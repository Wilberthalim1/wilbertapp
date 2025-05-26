package edu.uph.m23sr3.wilbertapp

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import edu.uph.m23sr3.wilbertapp.ui.theme.WilbertappTheme
import kotlin.math.log

class MainActivity : ComponentActivity() {

    lateinit var usernameInput :EditText
    lateinit var passwordInput :EditText
    lateinit var loginBtn :Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WilbertappTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
         usernameInput = findViewById(R.id.username_input)
         passwordInput = findViewById(R.id.password_input)
         loginBtn = findViewById(R.id.login_btn)

         loginBtn.setOnClickListener {
             val username = usernameInput.text.toString()
             val password = passwordInput.toString()
             Log.i("Test Credentials", "Username :$username and $password")
         }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    WilbertappTheme {
        Greeting("Android")
    }
}