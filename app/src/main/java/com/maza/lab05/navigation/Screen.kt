package com.maza.lab05.navigation

// Sealed class que contiene todas las pantallas
// que tendrá nuestra aplicación.
sealed class Screen(val route: String) {

    // Pantalla principal
    object Home : Screen("home")

    // Pantalla donde mostramos la lista
    object List : Screen("list")

    // Pantalla de detalle.
    // Recibe un ID como parámetro.
    object Detail : Screen("detail/{itemId}")

    // Pantalla del perfil
    object Profile : Screen("profile")
}