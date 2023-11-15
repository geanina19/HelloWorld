package com.example.helloworld

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.helloworld.databinding.ActivityDisplayUserNameBinding

class DisplayUserNameActivity : AppCompatActivity() {

    private lateinit var binding:ActivityDisplayUserNameBinding

    enum class Params {
        USERNAME, PASSWORD
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDisplayUserNameBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //(Params.USERNAME.name) = "username" -> convierte en string
        //.getStringExtra -> coge String, si fuera int sería (.getIntExtra)
        val username = intent.getStringExtra(Params.USERNAME.name)

        binding.nombreTextView.text = username

        binding.volverButton.setOnClickListener()
        {
            //este método cierra la ventana en la que estás
            finish()
        }
    }
}