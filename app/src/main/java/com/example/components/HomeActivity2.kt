package com.example.components

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.components.databinding.ActivityHome2Binding
import com.example.components.databinding.ActivityMainBinding

class HomeActivity2 : AppCompatActivity() {
    val binding: ActivityHome2Binding by lazy {
        return@lazy ActivityHome2Binding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.bottomNav.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    binding.circular1.visibility = View.VISIBLE
                    binding.circular2.visibility = View.INVISIBLE
                    binding.circular3.visibility = View.INVISIBLE
                    binding.circular4.visibility = View.INVISIBLE
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.nav_explore-> {
                    binding.circular2.visibility = View.VISIBLE
                    binding.circular1.visibility = View.INVISIBLE
                    binding.circular3.visibility = View.INVISIBLE
                    binding.circular4.visibility = View.INVISIBLE
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.nav_notifications -> {
                    binding.circular3.visibility = View.VISIBLE
                    binding.circular2.visibility = View.INVISIBLE
                    binding.circular1.visibility = View.INVISIBLE
                    binding.circular4.visibility = View.INVISIBLE
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.nav_libraries -> {
                    binding.circular4.visibility = View.VISIBLE
                    binding.circular2.visibility = View.INVISIBLE
                    binding.circular1.visibility = View.INVISIBLE
                    binding.circular3.visibility = View.INVISIBLE
                    return@setOnNavigationItemSelectedListener true
                }
                else -> false
            }
        }

        binding.circular1.visibility = View.VISIBLE
        binding.circular2.visibility = View.INVISIBLE
        binding.circular3.visibility = View.INVISIBLE
        binding.circular4.visibility = View.INVISIBLE
    }
}