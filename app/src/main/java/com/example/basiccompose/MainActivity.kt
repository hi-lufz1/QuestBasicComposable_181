package com.example.basiccompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.basiccompose.ui.theme.BasicComposeTheme





class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BasicComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BasicCompose(
                        modifier = Modifier.padding(innerPadding)
                            .fillMaxSize()
                    )
                }
            }
        }
    }
}
@Preview (showBackground = true)
@Composable
fun BasicCompose( modifier: Modifier = Modifier
){
  Column (
      horizontalAlignment = Alignment.CenterHorizontally,
      verticalArrangement = Arrangement.Center,
      modifier = Modifier.fillMaxSize()
  ) {
      Text(
          text = "LOGIN",
          style = TextStyle(
              fontSize = 50.sp,
              fontWeight = FontWeight.Bold,
          )
      )
      Text(
          text = "Ini adalah halaman login",
          style = TextStyle(
              fontSize = 20.sp,
              ),
          modifier = Modifier.padding(bottom = 16.dp)
      )
      Image(painter = painterResource(id = R.drawable.umy ),
          contentDescription = "umy"
      )
      Text(
          text = "Nama",
          style = TextStyle(
              fontSize = 20.sp
          )
      )
      Text(
          text = "Latif Usmul Fauzi",
          style = TextStyle(
              fontSize = 32.sp,
              fontWeight = FontWeight.Bold,
          )
      )
      Text(
          text = "20220140181",
          style = TextStyle(
          fontSize = 50.sp,
          fontWeight = FontWeight.Bold,
              color = Color.Blue
          )
      )
      Image(painter = painterResource(id = R.drawable.img ),
          contentDescription = "foto",
          modifier = Modifier
              .clip(RoundedCornerShape(56.dp))
              .size(300.dp, 445.dp),
          contentScale = ContentScale.Fit
      )
  }

}
