package com.example.splasha1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Thread.sleep(2000)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}