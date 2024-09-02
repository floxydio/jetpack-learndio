package com.example.learnjetpack_compose.ui.screens

import android.provider.CalendarContract.Colors
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.learnjetpack_compose.ui.components.SafeAreaBox
import com.example.learnjetpack_compose.ui.components.TextInput
import com.example.learnjetpack_compose.ui.theme.*

@Composable
fun LoginView(navController: NavController) {
    val (email, setEmail) = remember { mutableStateOf("") }
    val (password, setPassword) = remember { mutableStateOf("") }
   SafeAreaBox {
       Column(
           modifier = Modifier
               .fillMaxWidth()
               .align(Alignment.Center),
           horizontalAlignment = Alignment.CenterHorizontally,
           verticalArrangement = Arrangement.Center,
       ) {
           Text(text = "Login Account")
           TextInput(placeholder = { Text("Input your Email...",fontSize = 14.sp) }, value = email , onValueChange = {setEmail(it)})
           OutlinedTextField(
               modifier = Modifier
                   .fillMaxWidth()
                   .padding(top = 15.dp, start = 24.dp, end = 24.dp)
                   .height(50.dp),
               shape = RoundedCornerShape(8.dp),
               placeholder = {Text("Input your Password...", fontSize= 14.sp)},
               keyboardOptions = KeyboardOptions(
                   keyboardType =  KeyboardType.Password
               ),
               visualTransformation = PasswordVisualTransformation(),
               colors = TextFieldDefaults.colors(
                     focusedIndicatorColor = ColorTransparent,
                     unfocusedIndicatorColor = ColorTransparent,
                     disabledIndicatorColor = ColorTransparent,
                    unfocusedContainerColor = GreyTextFieldColor,
                   focusedContainerColor = GreyTextFieldColor
               ),
               value = password , onValueChange = {
                setPassword(it)
           })
           Button(
               shape = RoundedCornerShape(12.dp),
               colors = ButtonDefaults.buttonColors(colorPrimary),
               modifier = Modifier
                   .fillMaxWidth()
                   .height(65.dp)
                   .padding(start = 24.dp, end = 24.dp, top = 20.dp),
               onClick = {
                   navController.navigate("home")
               }) {
               Text("Login")
           }
           Row(modifier = Modifier.padding(top = 12.dp)) {
               Text("Don't Have an account? ")
               Text("Sign Up", color= colorPrimary, fontWeight = FontWeight.Bold)
           }
       }
   }

}