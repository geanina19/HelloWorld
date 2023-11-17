package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.helloworld.databinding.ActivityStudentBinding

class StudentActivity : AppCompatActivity() {

    private lateinit var binding: ActivityStudentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStudentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.enviarADisplayStudentActivity.setOnClickListener()
        {
            if(binding.nombre.text.isEmpty())
            {
                Toast.makeText(
                    this,
                    "Debe introducir un nombre de usuario",
                    Toast.LENGTH_SHORT
                ).show()
            } else if(binding.apellido.text.isEmpty())
            {
                Toast.makeText(
                    this,
                    "Debe introducir un apellido de usuario",
                    Toast.LENGTH_SHORT
                ).show()
            }
            else if(binding.edad.text.isEmpty()) {
                Toast.makeText(
                    this,
                    "Debe introducir un edad de usuario",
                    Toast.LENGTH_SHORT
                ).show()
            }
            else
            {
                //con el Intent abrimos otra actividad
                val intent = Intent (
                    this,
                    DisplayStudentActivity::class.java
                )

                val student = Student(
                    binding.nombre.text.toString(),
                    binding.apellido.text.toString(),
                    binding.edad.text.toString().toInt()
                )

                /*le decimos que además de que abra la acividad display,
                añada la info pasada en el editText
                 */
                intent.putExtra (
                    DisplayStudentActivity.Params.STUDENT.name,
                    student
                )

                startActivity(intent)
            }
        }
    }
}