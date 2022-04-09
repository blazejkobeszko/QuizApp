package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.app.AppCompatDelegate.setDefaultNightMode

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        val btnStart : Button = findViewById(R.id.btnStart)
        val etName : EditText = findViewById(R.id.etName)
        btnStart.setOnClickListener(){

            if(etName.text.isEmpty()){
                Toast.makeText(this,
                    "Please enter your name", Toast.LENGTH_LONG).show()
            }else{
                val intent = Intent(this, QuestionsActivity::class.java)
                intent.putExtra(Constants.USER_NAME, etName.text.toString())
                startActivity(intent)
                finish()
            }
        }

    }
}