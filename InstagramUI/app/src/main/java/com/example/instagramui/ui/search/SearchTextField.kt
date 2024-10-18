package com.example.instagramui.ui.search

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp

@Composable
fun SearchTextField(modifier: Modifier = Modifier, onSearchTextChanged: (String) -> Unit) {
    var text by remember { mutableStateOf(TextFieldValue("")) }
    Row(modifier = Modifier.padding(10.dp)) {
        TextField(
            value = text,
            onValueChange = {
                text = it
                onSearchTextChanged(it.text)
            },
            singleLine = true,
            leadingIcon = {
                Icon(
                    Icons.Default.Search,
                    null,
                )
            },
            placeholder = { Text("Поиск") },
            modifier = Modifier
                .fillMaxWidth(),
            shape = RoundedCornerShape(8.dp),
            colors = TextFieldDefaults.colors(
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            )
        )
    }
}
