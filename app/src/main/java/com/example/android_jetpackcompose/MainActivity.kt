




package com.example.android_jetpackcompose

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            NotificationScreen()

//            reComposition()

//            PreviewFunction()

//            Android_JetPackComposeTheme {
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                     Greeting(
//                         name = "Android",
//                         modifier = Modifier.padding(innerPadding)
//                     )
//                }
//            }
        }
    }
}

@Preview
@Composable
fun NotificationScreen()
{

    var count = rememberSaveable { mutableStateOf(0)}
    Column (verticalArrangement = Arrangement.Center,

        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize(1f)
        )

    {

        NotificationCounter(count) { count.value++ }
        MessageBar(count)
    }
}

@Composable
fun MessageBar(state:MutableState<Int>)
{
    Text(text = state.value.toString())
}

@Composable
fun NotificationCounter(count: MutableState<Int>, increment: () -> Int)
{
//    var count = rememberSaveable { mutableStateOf(0)}
    Column (

        verticalArrangement = Arrangement.Center,

        horizontalAlignment = Alignment.CenterHorizontally

    ){

        Text(text = "You have sent ${count.value} notification" )


        Button (onClick = {increment()

            Log.d("ONE", "Button Clicked  - ${count.value}" )
        })
        {
            Text(text = "Send Notification")
        }

    }
}

//@Composable
//fun NotificationCounter()
//{
//    var count = rememberSaveable { mutableStateOf(0)}
//    Column (
//
//        verticalArrangement = Arrangement.Center,
//
//        horizontalAlignment = Alignment.CenterHorizontally
//
//    ){
//
//        Text(text = "You have sent ${count.value} notification" )
//
//
//        Button (onClick = {(count.value++ )
//
//            Log.d("ONE", "Button Clicked  - ${count.value}" )
//        })
//        {
//            Text(text = "Send Notification")
//        }
//
//    }
//}




//@Composable
//private fun reComposition()
//{
//    val state = remember { mutableStateOf(0.0) }
//    Log.d("ONE", "Initial Composition")
//
//    Button(onClick = {
//
//        state.value = Math.random();
//
//    }) {
//
//        Log.d("ONE", "Recomposition ${state.value}")
//        Text(text = state.value.toString())
//
//    }
//
//}


//data class Category(val title:String, val subtitle:String)
//
//fun getList() : MutableList<Category>
//{
//
//    val list = mutableListOf<Category>()
//    list.add(Category("ONE", "Java"))
//    list.add(Category("two", "Java"))
//    list.add(Category("three", "Java"))
//    list.add(Category("four", "Java"))
//    list.add(Category("five", "Java"))
//    list.add(Category("six", "Java"))
//    list.add(Category("seven", "Java"))
//    list.add(Category("eight", "Java"))
//    list.add(Category("nine", "Java"))
//    list.add(Category("ten", "Java"))
//    list.add(Category("eleven", "Java"))
//
//    return list
//
//}
//
//@Preview(showBackground = true, widthDp = 300, heightDp = 500)
//@Composable
//private fun previewItem()
//{
//
//    LazyColumn (content = {items(getList()){item -> CardView(title = item.title, subtitle = item.subtitle )} })
//
//}
//
//@Composable
//private fun CardView(title:String, subtitle:String) {
//    Row(
//        horizontalArrangement = Arrangement.SpaceAround,
//        verticalAlignment = Alignment.CenterVertically
//    )
//    {
//
//        Image(
//            painter = painterResource(id = R.drawable.heart),
//            contentDescription = "Heart Icon",
//            contentScale = ContentScale.Crop
//        )
//
//        Column (
//            verticalArrangement = Arrangement.SpaceEvenly,
//            horizontalAlignment = Alignment.CenterHorizontally
//        )
//        {
//            Text(text = title, fontSize = 24.sp)
//            Text(text = subtitle, fontSize = 24.sp)
//        }
//
//
//    }
//
//}

//@Preview(showBackground = true, widthDp = 300, heightDp = 500)
//@Composable
//private fun one() {
//
//
//    function(Modifier.background(Color.Red).padding(16.dp).size(50.dp))
//
//}


//@Preview(showBackground = true, widthDp = 300, heightDp = 500)
//@Composable
//private fun function(modifier: Modifier) {
//
//    Text(text = "Name", fontSize = 24.sp, modifier = modifier)
//
//}


//@Preview(showBackground = true, widthDp = 300, heightDp = 500)

//@Preview(showBackground = true, widthDp = 300, heightDp = 500)
//@Composable
//private fun PreviewFunction()
//{
//
//
//    Box(
//        contentAlignment = Alignment.Center
//    )
//    {
//
//        Image(
//            painter = painterResource(id = R.drawable.heart),
//            contentDescription = "Heart Icon",
//            contentScale = ContentScale.Crop
//        )
//
//        Row(
//            horizontalArrangement = Arrangement.SpaceEvenly,
//            verticalAlignment = Alignment.CenterVertically
//        )
//        {
//            Text(text = "A", fontSize = 24.sp)
//            Text(text = "B", fontSize = 24.sp)
//        }
//
//
//    }}    }



//    Column (
//        verticalArrangement = Arrangement.SpaceEvenly,
//        horizontalAlignment = Alignment.CenterHorizontally
//    )
//    {
//        Text(text = "A", fontSize = 24.sp)
//        Text(text = "B", fontSize = 24.sp)
//    }


//      Row (
//        horizontalArrangement = Arrangement.SpaceEvenly,
//        verticalAlignment = Alignment.CenterVertically
//    )
//    {
//        Text(text = "A", fontSize = 24.sp)
//        Text(text = "B", fontSize = 24.sp)
//    }







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

//@Preview(showBackground = true, showSystemUi = true, name = "Hello Message", widthDp = 200)
//@Composable
//private fun Greeting(name: String = "cheezyCode", modifier: Modifier = Modifier) {
//
//    var text = remember { mutableStateOf("Hello") }
//
//    TextField(
//        value = text.value,
//        onValueChange = { text.value = it },
//        label = { Text("Label") }
//    )
//}

// Uncomment if GreetingPreview is needed
// @Preview(showBackground = true)
// @Composable
// fun GreetingPreview() {
//     Android_JetPackComposeTheme {
//         Greeting("Android")
//     }
// }
