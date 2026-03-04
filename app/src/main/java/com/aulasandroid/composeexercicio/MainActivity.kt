package com.aulasandroid.composeexercicio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.Size
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.aulasandroid.composeexercicio.ui.theme.ComposeExercicioTheme
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeExercicioTheme {
                Scaffold( modifier = Modifier.fillMaxSize() ) { innerPadding ->
                    LayoutScreen(modifier = Modifier
                        .padding(innerPadding)

//                    GameOverScreen(modifier = Modifier
//                        .padding(innerPadding)

                    )
                }
            }
        }
    }
}

@Composable
fun GameOverScreen(modifier: Modifier = Modifier){
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color.Black),
        contentAlignment = Alignment.Center
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            AndroidEnemy(color = Color.Red, size = 70.dp)
            AndroidEnemy(color = Color.Green, size = 70.dp)
            AndroidEnemy(color = Color.Blue, size = 70.dp)
            AndroidEnemy(color = Color.Yellow, size = 70.dp)

        }

        Row() {
            Text(
                text = "GAME OVER",
                color = Color.White,
                fontSize = 60.sp,
                fontWeight = FontWeight.W600
            )
        }
    }
}

@Composable
fun LayoutScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .background(Color.Black)
            .fillMaxSize()
            .padding(vertical = 50.dp),

        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column() {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row() {
                    Text(
                    text = "SCORE: 0050",
                    color = Color.White,
                     fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Bold
                     )
                }

                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                    text = "LIVES: ",
                    color = Color.White,
                     fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Bold
                     )

                    AndroidEnemy(color = Color.Green, size = 8.dp)
                    AndroidEnemy(color = Color.Green, size = 8.dp)
                    AndroidEnemy(color = Color.Green, size = 8.dp)
                }
            }
             EnemiesLine()
        }
        Column(
            modifier = Modifier,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            //Personagem
            PlayerCharacter(
                modifier = Modifier.padding(bottom = 20.dp),
                color = Color.Magenta,
                size = 70.dp
            )

            //Botao
            Text(
                text = "PRESS START" ,
                color = Color.White,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                fontSize = 24.sp,
                modifier = Modifier
                    .background(color = Color(0x63FFFFFF))
                    .fillMaxWidth()
                    .padding(12.dp)
            )
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun LayoutScreenPreview() {
    LayoutScreen()
}

@Composable
fun AndroidEnemy(modifier: Modifier = Modifier, color: Color, size: Dp){
    Image(
        painter = painterResource(R.drawable.ic_android_black_24dp),
        colorFilter = ColorFilter.tint(color = color),
        contentDescription = "Enemy Icon",
        modifier = modifier.size(size = size)
    )
}

@Composable
fun PlayerCharacter(modifier: Modifier = Modifier, color: Color, size: Dp){
    Image(
        painter = painterResource(R.drawable.ic_android_black_24dp),
        colorFilter = ColorFilter.tint(color = color),
        contentDescription = "Enemy Icon",
        modifier = modifier.size(size = size)
    )
}


@Composable
fun EnemiesLine(){
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ) {
        AndroidEnemy(color = Color.Red, size = 70.dp)
        AndroidEnemy(color = Color.Green, size = 70.dp)
        AndroidEnemy(color = Color.Blue, size = 70.dp)
        AndroidEnemy(color = Color.Yellow, size = 70.dp)

    }
}