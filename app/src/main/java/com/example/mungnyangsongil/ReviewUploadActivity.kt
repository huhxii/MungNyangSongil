package com.example.mungnyangsongil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mungnyangsongil.databinding.ActivityReviewUploadBinding

class ReviewUploadActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityReviewUploadBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}