package com.example.tarjeta

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tarjeta.ui.theme.TarjetaTheme

var nombre: String = "Emmanuel"
var rojito: Color = Color.Green

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TarjetaTheme {
                Scaffold(modifier = Modifier) { innerPadding ->
                    Surface(
                        color = Color.Green
                    ){
                        NuevaFuncion(
                            cumpleanhero = "Lucero Emmanuel",
                            de = "Wendy",
                            modificado= Modifier.padding(innerPadding)
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun NuevaFuncion(cumpleanhero : String, de : String, modificado : Modifier = Modifier){
    Column (
        modifier = modificado.then(Modifier
            .fillMaxSize())
            .background(color = Color(25,82,200))
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Feliz Cumpleaños $cumpleanhero",
            fontSize = 85.sp,
            lineHeight = 120.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = "Te Desea: $de",
            fontSize = 27.sp,
            modifier = Modifier
                .padding(8.dp,80.dp,8.dp,8.dp)
                .align(alignment = Alignment.End)
        )
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
        //Snoopy(nombre)
        NuevaFuncion("Saitama", de = "Immanuel")
    }
}