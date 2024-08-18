package com.example.learnjetpack_compose.ui.components

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learnjetpack_compose.ui.theme.ColorTransparent
import com.example.learnjetpack_compose.ui.theme.GreyTextFieldColor

@Composable
fun TextInput(placeholder: @Composable() (() -> Unit), value: String, onValueChange: (String) -> Unit, radiusSize: Dp = 8.dp, paddingTop: Dp = 12.dp, heightInput: Dp = 50.dp, keyboardType: KeyboardType = KeyboardType.Text, visualTransformation: VisualTransformation = VisualTransformation.None)  {
    OutlinedTextField(
        modifier = Modifier.padding(top = paddingTop).height(heightInput),
        shape = RoundedCornerShape(radiusSize),
        placeholder = placeholder,
        keyboardOptions = KeyboardOptions(
            keyboardType =  keyboardType
        ),
        visualTransformation = visualTransformation,
        colors = TextFieldDefaults.colors(
            focusedIndicatorColor = ColorTransparent,
            unfocusedIndicatorColor = ColorTransparent,
            disabledIndicatorColor = ColorTransparent,
            unfocusedContainerColor = GreyTextFieldColor,
            focusedContainerColor = GreyTextFieldColor
        ),
        value = value , onValueChange = onValueChange,)
}