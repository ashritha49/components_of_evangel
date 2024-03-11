package com.example.components

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.components.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding: ActivityMainBinding by lazy {
        return@lazy ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.getStarted.setOnClickListener {
            val intent = Intent(this,HomeActivity1::class.java)
            startActivity(intent)
            finish()
        }
        binding.getStarted2.setOnClickListener {
            val intent = Intent(this,HomeActivity2::class.java)
            startActivity(intent)
            finish()
        }
    }
}