package com.example.tarjeta

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tarjeta.ui.theme.    TarjetaTheme

var nombre: String = "Emmanuel"
var rojito: Color = Color.Green

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TarjetaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Snoopy(
                        name = nombre,
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Snoopy(name: String, modifier: Modifier = Modifier) {
    Surface(
        modifier = Modifier
            .padding(20.dp),
        color = rojito){
        Text(
            text = "Hola, mi nombre es: $name!",
            modifier = Modifier
                .padding(20.dp)
                .background(Color.Cyan),
                color = Color.Blue,
        )
    }
}

@Preview(showBackground = true, name = "titulo?", showSystemUi = true)
@Composable
fun funcionCambiadaPreview() {
    TarjetaTheme {
        Snoopy(nombre)
    }
}