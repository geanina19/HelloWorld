package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.helloworld.databinding.ActivityMenuBinding
import com.example.helloworld.databinding.ActivityPruebaBotonesBinding

class MenuActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.sendEmailActivityButton.setOnClickListener {
            val sendEmailActivityIntent = Intent(this, SendEmailActivity::class.java)
            startActivity(sendEmailActivityIntent)
        }

        binding.textViewActivityButton.setOnClickListener()
        {
            val textViewActivityIntent = Intent(this, TextViewActivity::class.java)
            startActivity(textViewActivityIntent)
        }

    }
}