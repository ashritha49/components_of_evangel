package com.example.components

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.components.databinding.ActivityHome1Binding
import com.example.components.databinding.ActivityMainBinding

class HomeActivity1 : AppCompatActivity() {
    val binding: ActivityHome1Binding by lazy {
        return@lazy ActivityHome1Binding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.getStarted.setOnClickListener {
            val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}