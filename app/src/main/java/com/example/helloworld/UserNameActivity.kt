package com.example.helloworld

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.helloworld.databinding.ActivityUserNameBinding

class UserNameActivity : AppCompatActivity() {

    private lateinit var binding:ActivityUserNameBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserNameBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        binding.abrirDisplayUserNameActivityButton.setOnClickListener() {
//
//            //si se ha dejado el editText vacio saldrá un mensaje(Toast)
//            if(binding.nombreEditText.text.isEmpty()) {
//                Toast.makeText(
//                    this,
//                    "Debe introducir un nombre de usuario",
//                    Toast.LENGTH_SHORT
//                ).show()
//            }
//
//            else {
//                //con el Intent abrimos otra actividad
//                val intent = Intent (
//                    this,
//                    DisplayUserNameActivity::class.java
//                )
//
//                /*le decimos que además de que abra la acividad display,
//                añada la info pasada en el editText
//                 */
//                intent.putExtra (
//                    DisplayUserNameActivity.Params.USERNAME.name,
//                    binding.nombreEditText.text.toString()
//                )
//
//                startActivity(intent)
//            }
//        }
    }
}