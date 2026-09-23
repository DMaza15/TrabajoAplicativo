package com.maza.lab05.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

import com.maza.lab05.screens.DetailScreen
import com.maza.lab05.screens.HomeScreen
import com.maza.lab05.screens.ListScreen
import com.maza.lab05.screens.ProfileScreen
@Composable
fun AppNavigation() {

    // NavController controla el movimiento
    // entre las diferentes pantallas.
    val navController = rememberNavController()

    // NavHost contiene todas las rutas
    // disponibles dentro de nuestra aplicación.
    NavHost(
        navController = navController,

        // La aplicación comienza en Home.
        startDestination = Screen.Home.route
    ) {configurar grafo de navegación y rutas con Screen sealed class

        // -------------------------
        // PANTALLA HOME
        // -------------------------
        composable(Screen.Home.route) {

            HomeScreen(

                // Cuando presionamos el botón
                // vamos a la pantalla List.
                onGoToList = {
                    navController.navigate(Screen.List.route)
                },

                // Cuando presionamos perfil
                // vamos a Profile.
                onGoToProfile = {
                    navController.navigate(Screen.Profile.route)
                }
            )
        }

        // -------------------------
        // PANTALLA LIST
        // -------------------------
        composable(Screen.List.route) {

            ListScreen(

                // Recibimos el ID seleccionado
                // y navegamos hacia Detail.
                onItemClick = { itemId ->

                    navController.navigate(
                        "detail/$itemId"
                    )
                },

                // Regresamos a la pantalla anterior.
                onBack = {
                    navController.popBackStack()
                }
            )
        }

        // -------------------------
        // PANTALLA DETAIL
        // -------------------------
        composable(
            route = Screen.Detail.route,

            // Indicamos que itemId será un número entero.
            arguments = listOf(
                navArgument("itemId") {
                    type = NavType.IntType
                }
            )
        ) { backStackEntry ->

            // Obtenemos el ID enviado desde ListScreen.
            val itemId =
                backStackEntry.arguments?.getInt("itemId") ?: 0

            DetailScreen(

                // Mandamos el ID a nuestra pantalla.
                itemId = itemId,

                // Botón para regresar.
                onBack = {
                    navController.popBackStack()
                }
            )
        }

        // -------------------------
        // PANTALLA PROFILE
        // -------------------------
        composable(Screen.Profile.route) {

            ProfileScreen(

                // Regresar a la pantalla anterior.
                onBack = {
                    navController.popBackStack()
                }
            )
        }
    }
}