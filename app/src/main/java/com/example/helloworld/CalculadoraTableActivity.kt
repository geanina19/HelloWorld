package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.helloworld.databinding.ActivityCalculadoraTableBinding

class CalculadoraTableActivity : AppCompatActivity() {

    private lateinit var binding:ActivityCalculadoraTableBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalculadoraTableBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}