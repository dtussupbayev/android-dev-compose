package com.example.instagramui.data

import com.example.instagramui.R

data class PostModel(
    val username: String,
    val avatarResId: Int,
    val imageResId: Int,
    val text: String,
    val likesCount: Int,
    val commentsCount: Int,
    val repostsCount: Int,
    val timeAgo: String
)

val feedPosts = listOf(
    PostModel(
        username = "mark_rice",
        avatarResId = R.drawable.user_avatar1,
        imageResId = R.drawable.post_img,
        text = "The Road to Aoraki / Mount Cook",
        likesCount = 3134,
        commentsCount = 24,
        repostsCount = 3,
        timeAgo = "3 часа назад"
    ),
    PostModel(
        username = "jude_crouch",
        avatarResId = R.drawable.user_avatar2,
        imageResId = R.drawable.post_img1,
        text = "Erling Haaland as clinical as prime Ronaldo",
        likesCount = 213,
        commentsCount = 18,
        repostsCount = 1,
        timeAgo = "5 часов назад"
    ),
    PostModel(
        username = "andres_norman",
        avatarResId = R.drawable.user_avatar3,
        imageResId = R.drawable.post_img2,
        text = "Inter Miami - All Time Top Scorers",
        likesCount = 152,
        commentsCount = 45,
        repostsCount = 5,
        timeAgo = "2 дня назад"
    )
)
