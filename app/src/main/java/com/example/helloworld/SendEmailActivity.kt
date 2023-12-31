package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.helloworld.databinding.ActivitySendEmailBinding

class SendEmailActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySendEmailBinding

    private var contador = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySendEmailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.enviarButton.setOnClickListener {
            contador++
            binding.prueba.text = contador.toString()
        }
    }
}