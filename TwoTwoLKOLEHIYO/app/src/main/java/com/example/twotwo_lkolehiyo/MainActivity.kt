package com.example.twotwo_lkolehiyo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView()

        setOnClickListener()
    }

    private fun setContentView() {
        TODO("Not yet implemented")
    }
}

private fun setOnClickListener() {
    TODO("Not yet implemented")
}