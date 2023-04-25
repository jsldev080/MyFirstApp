package com.jsldev080.myfirstapp // myfirstapp.jsldev080.com

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

// MainActivity class is inherited by AppCompatActivity
class MainActivity : AppCompatActivity() { // Activity = Screen
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // res - layout - activity_main.xml
        // press command key on activity_main to click
        // activity_main.xml: there are Code section other than design one.
    }
}