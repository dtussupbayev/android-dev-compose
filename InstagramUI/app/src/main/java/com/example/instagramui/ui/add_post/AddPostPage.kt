package com.example.instagramui.ui.add_post

import android.net.Uri
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.rememberAsyncImagePainter
import com.example.instagramui.ui.theme.ContainerGrey

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddPostPage(modifier: Modifier = Modifier) {
    var caption by remember { mutableStateOf(TextFieldValue("")) }
    var imageUri by remember {
        mutableStateOf<Uri?>(null)
    }
    var showSuccessDialog by remember { mutableStateOf(false) }
    var showErrorDialog by remember { mutableStateOf(false) }
    var errorMessage by remember { mutableStateOf("") }

    val galleryLauncher =
        rememberLauncherForActivityResult(contract = ActivityResultContracts.GetContent(),
            onResult = { uri ->
                uri?.let {
                    imageUri = it
                }
            })

    if (showSuccessDialog) {
        AlertDialog(onDismissRequest = { showSuccessDialog = false },
            title = { Text("Успех") },
            text = { Text("Пост успешно добавлен!") },
            confirmButton = {
                TextButton(onClick = { showSuccessDialog = false }) {
                    Text("OK")
                }
            })
    }

    if (showErrorDialog) {
        AlertDialog(onDismissRequest = { showErrorDialog = false },
            title = { Text("Ошибка") },
            text = { Text(errorMessage) },
            confirmButton = {
                TextButton(onClick = { showErrorDialog = false }) {
                    Text("OK")
                }
            })
    }

    Scaffold(topBar = {
        TopAppBar(title = {
            Text(
                "Новая публикация",
                Modifier.fillMaxWidth(),
                fontWeight = FontWeight.Bold,
                style = MaterialTheme.typography.titleLarge
            )
        })
    }) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .padding(horizontal = 16.dp, vertical = 8.dp)
        ) {
            TextField(
                value = caption,
                onValueChange = { caption = it },
                placeholder = { Text("Добавьте текст публикации...") },
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(8.dp),
                colors = TextFieldDefaults.colors(
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                ),
                minLines = 2
            )
            Spacer(Modifier.height(8.dp))
            imageUri?.let {
                Image(
                    painter = rememberAsyncImagePainter(model = imageUri),
                    contentDescription = null,
                    modifier = Modifier.size(250.dp)
                )
            } ?: run {
                Text("Фото не выбрано", modifier = Modifier.padding(bottom = 16.dp))
            }
            Button(onClick = {
                galleryLauncher.launch("image/*")
            }, modifier = Modifier.fillMaxWidth(0.5f), colors = ButtonDefaults.buttonColors(
                containerColor = Color.Gray, contentColor = Color.White
            ), shape = RoundedCornerShape(8.dp), content = {
                Text("Выбрать фото")
            })
            Spacer(Modifier.height(16.dp))
            Button(onClick = {
                when {
                    caption.text.isBlank() -> {
                        errorMessage = "Текст не может быть пустым"
                        showErrorDialog = true
                    }

                    imageUri == null -> {
                        errorMessage = "Вы должны выбрать фото"
                        showErrorDialog = true
                    }

                    else -> {
                        showSuccessDialog = true
                        caption = TextFieldValue("")
                        imageUri = null
                    }
                }
            }, modifier = Modifier.fillMaxWidth(), colors = ButtonDefaults.buttonColors(
                containerColor = ContainerGrey, contentColor = Color.White
            ), shape = RoundedCornerShape(8.dp), content = {
                Text("Добавить публикацию")
            }

            )
        }

    }
}

@Preview
@Composable
private fun AddPostPagePreview() {
    AddPostPage()
}