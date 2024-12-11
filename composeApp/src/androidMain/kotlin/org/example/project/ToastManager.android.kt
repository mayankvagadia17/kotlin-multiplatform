package com.eclipticon.first_multiplatform_demo

import android.widget.Toast
import org.example.project.DemoApplication

actual open class ToastManager actual constructor() {
    actual fun showToast(message: String) {
        val context = DemoApplication.getContext()
        Toast.makeText(context, "${message} From Android" , Toast.LENGTH_SHORT).show()
    }
}