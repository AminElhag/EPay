package com.amin

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform