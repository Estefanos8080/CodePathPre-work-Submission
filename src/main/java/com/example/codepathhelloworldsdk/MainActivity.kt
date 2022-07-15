package com.example.codepathhelloworldsdk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var testButton = findViewById<Button>(R.id.button)
        testButton.setOnClickListener {
            Log.v("Hey there," , "the button was clicked")
            Toast.makeText(this, "Hey, this is skaleton app for the codepath andriod program", Toast.LENGTH_SHORT).show()
        }
    }


}