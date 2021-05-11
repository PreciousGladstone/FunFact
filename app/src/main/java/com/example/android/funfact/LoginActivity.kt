package com.example.android.funfact

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        signIn()
    }

    private fun signIn() {
       val email = findViewById<TextInputEditText>(R.id.EditText_Email)
        val password = findViewById<TextInputEditText>(R.id.edit_password)
        val button = findViewById<MaterialButton>(R.id.signin_button)

        button.setOnClickListener {
            if (email.toString().isNullOrEmpty() || password.toString().isNullOrEmpty()){
                Toast.makeText(this, "Email or Password required", Toast.LENGTH_SHORT).show()
                
            }else{
                if(email.text.toString() == "preciousgladstone@gmail.com" && password.text.toString() == "12345"){
                    val intent = Intent(this , MainActivity::class.java)
                    startActivity(intent)
                }else{
                    Toast.makeText(this , "Wrong Email or Password" , Toast.LENGTH_LONG).show()
                }
            }
        }

    }
}