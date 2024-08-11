package com.example.aplicativo.ui.telas

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TelaPrincipal(modifier: Modifier = Modifier, onLogoffClick: () -> Unit) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier.fillMaxSize().padding(16.dp)
    ) {
        Text(text = "Pastas de Dados")

        // Exemplo de cards que podem representar pastas
        repeat(3) { index ->
            Card(
                modifier = Modifier.padding(8.dp)
            ) {
                Text(text = "Pasta ${index + 1}", modifier = Modifier.padding(16.dp))
            }
        }

        Spacer(modifier = Modifier.padding(top = 16.dp))

        Button(onClick = { onLogoffClick() }) {
            Text("Sair")
        }
    }
}
