package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.helloworld.databinding.ActivityPruebaBotonesBinding

class PruebaBotonesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPruebaBotonesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPruebaBotonesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.emailSwitch.setOnClickListener {
            binding.editTextEmail.isEnabled = binding.emailSwitch.isChecked
        }
    }
}