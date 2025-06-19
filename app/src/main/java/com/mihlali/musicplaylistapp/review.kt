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

        val songTiles = arrayListOf<String>()
        val artists = arrayListOf<String>()
        val ratings = arrayListOf<String>()
        val comments = arrayListOf<String>()

        intent.putStringArrayListExtra("titles", songTiles)
        intent.putStringArrayListExtra("artists", artists)
        intent.putStringArrayListExtra("ratings", ratings)
        intent.putStringArrayListExtra("comments", comments)

        val titles = intent.getStringArrayListExtra("titles")
        val setBuilder = StringBuilder()
         for (i in titles.indices){
             setBuilder.append("Song Title: , $titles[i]\n" )
             setBuilder.append("Artist: , $artists[i]\n" )
             setBuilder.append("Rating: , $ratings[i]\n" )
             setBuilder.append("Comments: , $comments[i]\n" )

         }








        //CODE STARTS HERE


    }
}