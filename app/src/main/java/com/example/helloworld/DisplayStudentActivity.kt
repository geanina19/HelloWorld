package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.helloworld.databinding.ActivityDisplayStudentBinding
import com.example.helloworld.databinding.ActivityStudentBinding

class DisplayStudentActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDisplayStudentBinding

    enum class Params {
        STUDENT
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDisplayStudentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val student = intent.getParcelableExtra(Params.STUDENT.name, Student::class.java)

        //cuando no sea null
        student?.let { student ->
            binding.datosFormulario.text = student.toString()

        }

        binding.volverButton.setOnClickListener()
        {
            //este método cierra la ventana en la que estás
            finish()
        }
    }
}