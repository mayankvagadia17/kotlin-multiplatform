package com.eclipticon.first_multiplatform_demo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform