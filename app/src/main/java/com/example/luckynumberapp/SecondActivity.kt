package com.example.luckynumberapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val txt2:TextView=findViewById(R.id.txt2)
        val txt3:TextView=findViewById(R.id.txt3)
        val btn2:Button=findViewById(R.id.btn)
        var user_name=receive()
//        Toast.makeText(this,""+user_name,Toast.LENGTH_SHORT).show()

            var random=randomgenerator()
            txt3.setText(""+random)
        btn2.setOnClickListener()
        {
            shareData(user_name,random)
        }

    }
    fun receive():String{
        val bundle:Bundle?=intent.extras
        var username=bundle?.get("name").toString()
        return username
    }
    fun randomgenerator():Int{
        val random= Random.nextInt(1000)
        return random
    }
    fun shareData(username:String,num:Int)
    {
        //Implcit intent
        var i =Intent(Intent.ACTION_SEND)
        i.setType("Text/plain")
        i.putExtra(Intent.EXTRA_SUBJECT,"$username is lucky today ")
        i.putExtra(Intent.EXTRA_TEXT,"His lucky number is $num")
        startActivity(i)
    }

}