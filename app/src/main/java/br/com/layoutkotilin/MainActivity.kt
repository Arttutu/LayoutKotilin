package br.com.layoutkotilin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.layoutkotilin.ui.theme.LayoutKotilinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LayoutKotilinTheme {
                Surface(
                    modifier = Modifier.size(width = 300.dp, height = 300.dp),
                    shape = RoundedCornerShape(topEnd = 32.dp, bottomStart = 32.dp),
                    color = Color.Yellow
                ) {
                    Box(
                        modifier = Modifier.background(Color.Magenta),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "Fiap",
                            fontSize = 30.sp,
                            modifier = Modifier
                                .align(Alignment.TopCenter)
                                .padding(10.dp)

                        )
                        Button(
                            onClick = { /*TODO*/ },
                            modifier = Modifier.offset( x = 20.dp, y = 20.dp)
                        ) {
                            Text(text = "clique aqui")
                        }
                    }
                    LayoutScreen()
                }
            }
        }
    }
}
@Composable
fun LayoutScreen() {
    Column ( horizontalAlignment = Alignment.CenterHorizontally) {
        Button(onClick = { /*TODO*/ }) {
            Text(text = "botao 1")
        }
        Button(onClick = { /*TODO*/ }) {
            Text(text = "botao 2")
        }
        Button(onClick = { /*TODO*/ }) {
            Text(text = "botao 3")
        }
        Row (horizontalArrangement =  Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth()){
            Button(onClick = { /*TODO*/ }) {
                Text(text = "botao 4")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "botao 5")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "botao 6")
            }
        }

    }
    
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun LayoutScreenPreview() {
    LayoutScreen()
}

