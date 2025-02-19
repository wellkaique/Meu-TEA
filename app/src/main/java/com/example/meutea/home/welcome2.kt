package com.example.meutea.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.meutea.R
import com.example.meutea.ui.theme.MeuTEATheme

@Composable
fun WelcomeScreen2(
    navController: NavController
) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.img_background),
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize()
                .blur(20.dp),
            contentScale = ContentScale.Crop
        )

        // Overlay escuro para reduzir a claridade
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black.copy(alpha = 0.5f))
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 24.dp, vertical = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.mipmap.ic_meutea_24_foreground),
                contentDescription = "Logo MeuTEA",
                modifier = Modifier
                    .size(200.dp) // Diminuído para mais espaço
                    .padding(top = 16.dp)
            )

            Text(
                text = "Divirta-se enquanto aprende a se comunicar através de imagens e exercícios sociais.\n\nJunte-se a nós para crescer e aprender!",
                fontSize = 20.sp, // Reduzi um pouco para melhor ajuste
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                color = Color(0xCCFFFFFF),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 32.dp, vertical = 16.dp)
            )

            Image(
                painter = painterResource(id = R.mipmap.ic_imagetea_foreground),
                contentDescription = "Imagem MeuTEA",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(250.dp) // Reduzi a altura para abrir espaço
                    .padding(top = 10.dp)
            )

            Spacer(modifier = Modifier.height(176.dp)) // Empurra os botões para cima

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 24.dp), // Padding ajustado para visibilidade
                horizontalArrangement = Arrangement.SpaceBetween // Melhor espaçamento
            ) {
                Button(
                    onClick = { navController.navigate("welcomeScreen") },
                    modifier = Modifier.width(120.dp),
                    shape = RoundedCornerShape(8.dp),
                    colors = androidx.compose.material3.ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF0ABBDE)
                    )
                ) {
                    Text(
                        text = "Voltar",
                        fontSize = 18.sp, // Ajustado para melhor visualização
                        color = Color.White
                    )
                }

                Button(
                    onClick = { navController.navigate("loginScreen") },
                    modifier = Modifier.width(120.dp),
                    shape = RoundedCornerShape(8.dp),
                    colors = androidx.compose.material3.ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF0ABBDE)
                    )
                ) {
                    Text(
                        text = "Próximo",
                        fontSize = 18.sp,
                        color = Color.White
                    )
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
private fun TaskListPreview() {
    val navController = rememberNavController()
    WelcomeScreen2(navController)
}