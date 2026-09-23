package com.maza.lab05.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.Card
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
fun DetailScreen(
    itemId: Int,
    onBack: () -> Unit
) {

    Scaffold(

        // Barra superior.
        topBar = {

            TopAppBar(
                title = {
                    Text("Detalle")
                },

                navigationIcon = {

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
                .padding(20.dp),

            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            // Card que contiene la información.
            Card {

                Column(
                    modifier = Modifier.padding(24.dp)
                ) {

                    Text(
                        text = "Detalle del elemento"
                    )

                    Text(
                        text = "ID: $itemId"
                    )
                }
            }

            // Botón para volver.
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