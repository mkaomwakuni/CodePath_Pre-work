package com.mkao.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import com.mkao.helloworld.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clicker = findViewById<Button>(R.id.button)
        clicker.setOnClickListener {
            Log.v("Hello World","Button clicked")
            Toast.makeText(this,"Hello to You too!",Toast.LENGTH_SHORT).show()
        }

    }
}