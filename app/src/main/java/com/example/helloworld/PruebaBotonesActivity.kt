package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.helloworld.databinding.ActivityPruebaBotonesBinding

class PruebaBotonesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPruebaBotonesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPruebaBotonesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.emailSwitch.setOnClickListener {
            binding.editTextEmail.visibility = View.INVISIBLE
            binding.editTextEmail.isEnabled =
                binding.emailSwitch.isChecked
        }

        binding.helloButton.setOnClickListener {_ ->
            when(binding.sexoGroup.checkedRadioButtonId)
            {
                binding.hombre.id -> {
                    Toast.makeText(this, "Sexo : Hombre", Toast.LENGTH_SHORT).show()
                }

                binding.mujer.id -> {
                    Toast.makeText(this, "Sexo : Mujer", Toast.LENGTH_SHORT).show()
                }
            }

        }
    }
}