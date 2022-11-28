package com.example.mungnyangsongil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mungnyangsongil.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}