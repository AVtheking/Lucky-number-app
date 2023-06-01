package com.example.luckynumberapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val txt1:TextView=findViewById(R.id.txt1)
        val btn: Button=findViewById(R.id.btn)
        val etxt:EditText=findViewById(R.id.etxt)
        btn.setOnClickListener(){
            var username=etxt.text
            if(username.isEmpty())
                Toast.makeText(this,"Please enter your name",Toast.LENGTH_LONG).show()
            else {
                var intent: Intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("name", username)
                startActivity(intent)
            }
        }

    }
}