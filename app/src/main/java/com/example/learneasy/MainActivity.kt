package com.example.learneasy

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activity)

        val loginButton: Button = findViewById<Button>(R.id.login)
        val signupButton: Button = findViewById<Button>(R.id.signup)

        loginButton.setOnClickListener{
            Toast.makeText(this, "Continue Learning!!!", Toast.LENGTH_LONG).show()
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }

        signupButton.setOnClickListener{
            Toast.makeText(this, "Are you ready to be Cloud Certified?", Toast.LENGTH_LONG).show()
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}