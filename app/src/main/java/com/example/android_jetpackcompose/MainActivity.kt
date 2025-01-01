




package com.example.android_jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.android_jetpackcompose.ui.theme.Android_JetPackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Android_JetPackComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                     Greeting(
                         name = "Android",
                         modifier = Modifier.padding(innerPadding)
                     )
                }
            }
        }
    }
}

//@Preview(showBackground = true, showSystemUi = true, name = "Hello Message", widthDp = 200)
//@Composable
//private fun Greeting(name: String = "cheezyCode", modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier,
//        fontSize = 24.sp
//    )
//    // Uncomment for additional functionality
//    // Image(
//    //     painter = painterResource(id = R.drawable.heart),
//    //     contentDescription = "Heart Icon",
//    //     contentScale = ContentScale.Crop
//    // )
//
//    // Button(onClick = {}, enabled = true) {
//    //     Text("Hello")
//    // }
//}

@Preview(showBackground = true, showSystemUi = true, name = "Hello Message", widthDp = 200)
@Composable
private fun Greeting(name: String = "cheezyCode", modifier: Modifier = Modifier) {

    var text = remember { mutableStateOf("Hello") }

    TextField(
        value = text.value,
        onValueChange = { text.value = it },
        label = { Text("Label") }
    )
}

// Uncomment if GreetingPreview is needed
// @Preview(showBackground = true)
// @Composable
// fun GreetingPreview() {
//     Android_JetPackComposeTheme {
//         Greeting("Android")
//     }
// }
