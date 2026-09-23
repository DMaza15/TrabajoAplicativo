package com.maza.lab05.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.material3.ExperimentalMaterial3Api

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileScreen(
    onBack: () -> Unit
) {

    Scaffold(

        // Barra superior.
        topBar = {

            TopAppBar(
                title = {
                    Text("Perfil")
                },

                navigationIcon = {

                    // Botón para regresar.
                    IconButton(
                        onClick = {
                            onBack()
                        }
                    ) {

                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Regresar"
                        )
                    }
                }
            )
        }

    ) { paddingValues ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(24.dp),

            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Text(
                text = "Mi Perfil"
            )

            Text(
                text = "Usuario de prueba",
                modifier = Modifier.padding(top = 10.dp)
            )

            Button(
                onClick = {
                    onBack()
                },
                modifier = Modifier.padding(top = 20.dp)
            ) {

                Text(
                    text = "Regresar"
                )
            }
        }
    }
}