package com.example.components

import android.R
import android.graphics.drawable.GradientDrawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.components.databinding.ActivityLoginBinding


class LoginActivity : AppCompatActivity() {
    val binding: ActivityLoginBinding by lazy {
        return@lazy ActivityLoginBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


    }
}