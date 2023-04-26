package com.jsldev080.myfirstapp // myfirstapp.jsldev080.com

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

// MainActivity class is inherited by AppCompatActivity
class MainActivity : AppCompatActivity() { // Activity = Screen
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // res - layout - activity_main.xml
        // press command key on activity_main to click
        // activity_main.xml: there are Code section other than Design one.

        // check out the Component Tree in activity_main.xml - Design
        val btnClickMe = findViewById<Button>(R.id.mybutton) // Palette - Common - Button / Declared Attributes - id 'mybutton'
        val tvMyTextView = findViewById<TextView>(R.id.textView) // Palette - Common - TextView / Declared Attributes - id 'textView'
        var timesClicked = 0
        btnClickMe.setOnClickListener { // each time we click on the Button (using method setOnClickListener of Button),
            timesClicked += 1 // the number increases by one starting from zero
            tvMyTextView.text = timesClicked.toString() // the text of the TextView changes to increased number ("0" -> "1" -> "2" -> "3" -> ...)
            Toast.makeText(this, "Hey Jungsoo!", Toast.LENGTH_LONG).show() // text "Hey Jungsoo!" shows up on the screen
        }

        // how to connect with physical device: phone - developer mode - debugging mode

    }
}