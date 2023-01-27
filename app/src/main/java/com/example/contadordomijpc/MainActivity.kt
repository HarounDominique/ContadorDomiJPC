package com.example.contadordomijpc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.contadordomijpc.ui.theme.ContadorDomiJPCTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ContadorDomiJPCTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    DefaultPreview()
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ContadorDomiJPCTheme {
        Column(
            Modifier.fillMaxSize(),
            Arrangement.SpaceEvenly,
            Alignment.CenterHorizontally
        ) {
            Column(Modifier.fillMaxWidth()) {
                Row() {
                    Surface(modifier = Modifier.padding(8.dp)){
                        Boton("Contador 1", Modifier)
                    }
                    Surface(modifier = Modifier.padding(8.dp)){
                        Text(text = "0")
                    }
                    Surface(modifier = Modifier.padding(8.dp)){
                        Text(text = "Soy una papelera")
                    }
                }
            }
            Column(Modifier.fillMaxWidth()) {
                Row() {
                    Boton("Contador 2", Modifier)
                    Button(onClick = { /*TODO*/ }) {

                    }
                    Text(text = "0")
                    Text(text = "Soy una papelera")
                }
            }
            Row(Modifier.fillMaxWidth()) {
                Text(text = "Global")
                Text(text = "0")
                Text(text = "Soy una papelera")
            }
        }
    }
}

@Composable
fun Boton(
    texto: String,
    modifier: Modifier
) {
    Text(
        text = texto,
        Modifier
            .background(Color.Magenta),
        fontSize = 22.sp,
        textAlign = TextAlign.Center
    )
}