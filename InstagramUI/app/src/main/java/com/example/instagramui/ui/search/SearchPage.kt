package com.example.instagramui.ui.search

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.instagramui.R
import com.example.instagramui.ui.common.components.PostsGrid

@Composable
fun SearchPage() {
    var searchText by remember { mutableStateOf("") }
    Scaffold { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            SearchTextField(onSearchTextChanged = { searchText = it })
            val users = listOf(
                "mark_rice" to R.drawable.user_avatar1,
                "jude_crouch" to R.drawable.user_avatar2,
                "andres_norman" to R.drawable.user_avatar3,
            )
            if (searchText.isNotEmpty()) {
                val filteredUsers =
                    users.filter { it.first.contains(searchText, ignoreCase = true) }
                if (filteredUsers.isNotEmpty()) {
                    SearchUsersList(users = filteredUsers)
                } else {
                    Text("Аккаунтов не найдено", modifier = Modifier.padding(16.dp))
                }
            } else {
                val posts = ArrayList<String>()
                (0..26).forEach { index ->
                    val post = "https://picsum.photos/id/${index + 10}/200/300"
                    posts.add(post)
                }
                PostsGrid(
                    posts, modifier = Modifier.fillMaxWidth()
                )
            }

        }
    }

}
