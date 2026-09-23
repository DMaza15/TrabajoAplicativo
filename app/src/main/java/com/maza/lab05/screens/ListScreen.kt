package com.maza.lab05.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

// Clase sencilla para representar un elemento.
data class Item(
    val id: Int,
    val name: String
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ListScreen(
    onItemClick: (Int) -> Unit,
    onBack: () -> Unit
) {

    // Lista de ejemplo.
    val items = listOf(
        Item(1, "Producto 1"),
        Item(2, "Producto 2"),
        Item(3, "Producto 3"),
        Item(4, "Producto 4"),
        Item(5, "Producto 5")
    )

    Scaffold(

        // Barra superior de la pantalla.
        topBar = {

            TopAppBar(
                title = {
                    Text("Lista")
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

        // LazyColumn permite mostrar una lista
        // de elementos de manera eficiente.
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {

            // Recorremos nuestra lista.
            items(items) { item ->

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .clickable {

                            // Al hacer clic enviamos
                            // el ID del elemento.
                            onItemClick(item.id)
                        }
                        .padding(20.dp)
                ) {

                    Text(
                        text = item.name
                    )
                }
            }
        }
    }
}