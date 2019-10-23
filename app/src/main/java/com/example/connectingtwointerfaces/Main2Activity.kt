package com.example.connectingtwointerfaces

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var btn2 = findViewById<Button>(R.id.idButton2)

        btn2.setOnClickListener{
            var intent2 = Intent(this,MainActivity::class.java)

            startActivity(intent2)
        }
    }
}
