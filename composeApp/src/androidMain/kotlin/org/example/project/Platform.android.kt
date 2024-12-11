package org.example.project

import android.os.Build

class AndroidPlatform : Platform {
    override val name: String = "From Android"
}

actual fun getPlatform(): Platform = AndroidPlatform()