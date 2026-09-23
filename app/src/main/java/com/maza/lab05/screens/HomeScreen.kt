package com.maza.lab05.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen(
    onGoToList: () -> Unit,
    onGoToProfile: () -> Unit
) {

    // Column permite colocar los elementos
    // uno debajo del otro.
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),

        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        // Título de la pantalla.
        Text(
            text = "Pantalla Principal",
            style = MaterialTheme.typography.headlineMedium
        )

        // Espacio entre elementos.
        androidx.compose.foundation.layout.Spacer(
            modifier = Modifier.padding(10.dp)
        )

        // Botón para ir a la lista.
        Button(
            onClick = {
                onGoToList()
            }
        ) {
            Text(text = "Ver lista")
        }

        // Botón para ir al perfil.
        Button(
            onClick = {
                onGoToProfile()
            }
        ) {
            Text(text = "Ver perfil")
        }
    }
}