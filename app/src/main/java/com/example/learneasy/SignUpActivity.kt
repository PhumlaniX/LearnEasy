package com.example.learneasy

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val signupButton : Button = findViewById<Button>(R.id.userSignup)

        signupButton.setOnClickListener{
            Toast.makeText(this, "Congratulations as you embark on your new journey to become Cloud Certified!!!", Toast.LENGTH_LONG).show()
        }
    }
}