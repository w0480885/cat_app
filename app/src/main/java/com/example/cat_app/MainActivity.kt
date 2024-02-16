package com.example.cat_app

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.cat_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Setup click listeners for the buttons
        binding.btnCats.setOnClickListener {
            startActivity(Intent(this, CatActivity::class.java))
        }

        binding.btnDogs.setOnClickListener {
            startActivity(Intent(this, DogActivity::class.java))
        }
    }
}
