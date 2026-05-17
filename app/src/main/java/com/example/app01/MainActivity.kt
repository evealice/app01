package com.example.app01

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import com.example.app01.ui.theme.App01Theme
import androidx.compose.runtime.*
import androidx.compose.foundation.background
import androidx.compose.foundation.background
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.Image
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.example.app01.R

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            App01Theme {
                MainScreen()
            }
        }
    }
}

@Composable
fun VerticalDivider() {
    Box(
        modifier = Modifier
            .fillMaxHeight()
            .width(1.dp)
            .background(MaterialTheme.colorScheme.outline)
    )
}


@Composable
fun MainScreen() {

    var text by remember { mutableStateOf("Hallo Martin") }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            // Zwei Boxen oben
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {

                Card(
                    modifier = Modifier
                        .padding(8.dp)
                        .weight(1f)
                ) {
                    Column(
                        modifier = Modifier.padding(16.dp)
                    ) {
                        Text(
                            text = "Geography",
                            fontWeight = FontWeight.Bold
                        )

                        Spacer(modifier = Modifier.height(8.dp))

                        Text(
                            text = "Leuchtturm in 300sm"
                        )
                    }
                }

                Card(
                    modifier = Modifier
                        .padding(8.dp)
                        .weight(1f)
                ) {
                    Column(
                        modifier = Modifier.padding(16.dp)
                    ) {
                        Text(
                            text = "Vessel",
                            fontWeight = FontWeight.Bold
                        )

                        Spacer(modifier = Modifier.height(8.dp))

                        Text(
                            text = "Kiel 30m über Grund"
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(40.dp))

            // Haupttext
            Text(
                text = "17knts\n189DEG",
                fontSize = 36.sp,
                fontWeight = FontWeight.Bold,
                lineHeight = 42.sp
            )
            Spacer(modifier = Modifier.height(24.dp))

            Button(
                onClick = {
                    // Aktion
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Red,
                    contentColor = Color.White
                )
            ) {
                Text(
                    text = "ALL MEN ON DECK!",
                    fontWeight = FontWeight.Bold
                )
            }
            Spacer(modifier = Modifier.height(24.dp))

            // Zwei Boxen unten
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {





                Card(
                    modifier = Modifier
                        .padding(8.dp)
                        .weight(1f)
                        .height(220.dp)
                ) {

                    Box(modifier = Modifier.fillMaxSize()) {

                        // 🌍 Hintergrundkarte
                        Image(
                            painter = painterResource(id = R.drawable.map),
                            contentDescription = "Map",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier.fillMaxSize()
                        )

                        // leichte Abdunkelung (damit Icons sichtbar bleiben)
                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .background(Color.Black.copy(alpha = 0.2f))
                        )

                        // 📍 Position
                        Text(
                            text = "📍",
                            fontSize = 22.sp,
                            modifier = Modifier
                                .align(Alignment.Center)
                                .offset(x = 60.dp, y = (-50).dp)
                        )
                    }
                }





            }

            Spacer(modifier = Modifier.height(40.dp))


        }
    }
}
@Preview(showBackground = true)
@Composable
fun PreviewMainScreen() {
    App01Theme {
        MainScreen()
    }
}
