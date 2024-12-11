package org.example.project

import android.app.Application
import android.content.Context

class DemoApplication : Application() {

    companion object {
        private lateinit var instance: DemoApplication

        fun getContext(): Context {
            return instance.applicationContext
        }
    }

    override fun onCreate() {
        super.onCreate()

        instance = this
    }
}