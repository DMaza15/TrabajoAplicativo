package com.maza.lab05

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import com.maza.lab05.navigation.AppNavigation

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // setContent permite construir
        // la interfaz utilizando Jetpack Compose.
        setContent {

            // Llamamos a nuestra función
            // principal de navegación.
            AppNavigation()
        }
    }
}