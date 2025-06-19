package com.mihlali.musicplaylistapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class review : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_review)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //Declarations
        val Display = findViewById<Button>(R.id.btnDisplay)
        val Calculate = findViewById<Button>(R.id.btnCalculate)
        val Back = findViewById<Button>(R.id.btnBack)

        val viewList = findViewById<TextView>(R.id.txtViewList)
        val viewCalc = findViewById<TextView>(R.id.txtViewCalc)

        val input = ""

        val titles =
            intent.getStringArrayListExtra("titles") //Retrieves the song titles from the intent
        val artists =
            intent.getStringArrayListExtra("artists") //Retrieves the artist names from the intent
        val ratings =
            intent.getStringArrayListExtra("ratings") //Retrieves the ratings from the intent
        val comments =
            intent.getStringArrayListExtra("comments") //Retrieves the comments from the intent



        Display.setOnClickListener {
            for (i in titles.indices) {
                input.append("Title: ${titles[i]}")
                input.append("Artist: ${artists[i]}")

            }
        }

        //CODE STARTS HERE


    }
}