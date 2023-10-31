package com.example.kotlinnative

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform