package com.mihlali.musicplaylistapp

import android.R.string
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

// ST10483401
//MIHLALI LEONARD SIKAKANE

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //CODE STARTS HERE
        val edtTitle = findViewById<EditText>(R.id.edtTitle)
        val edtName = findViewById<EditText>(R.id.edtName)
        val edtRating = findViewById<EditText>(R.id.edtRating)
        val edtComments = findViewById<EditText>(R.id.edtComments)
        val btnReview = findViewById<Button>(R.id.btnReview)
        val btnExit = findViewById<Button>(R.id.btnExit)
        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val songTitles = arrayListOf<string>()
        val artists = arrayListOf<string>()
        val ratings = arrayListOf<String>()
        val comments = arrayListOf<string>()



        //terminate the app

        btnReview.setOnClickListener {
            val intent = Intent(this, review::class.java)
            startActivity(intent)

        }
        btnExit.setOnClickListener {
            finish() }
//takes you to the review page

        btnAdd.setOnClickListener {
            val title = edtTitle.text.toString()
            val name = edtName.text.toString()
            val rating = edtRating.text.toString()
            val comment = edtComments.text.toString()
                if (edtTitle.text.toString().isNotEmpty() && edtName.text.toString().isNotEmpty() && edtRating.text.toString().isNotEmpty() && edtComments.text.toString().isNotEmpty()) {
                    songTitles.add(title)  //Adds the song title to the arraylist
                    artists.add(name) //Adds the artist name to the arraylist
                    ratings.add(rating) //Adds the rating to the arraylist
                    comments.add(comment) //Adds the comment to the arraylist
                    Toast.makeText(this, "Song Added", Toast.LENGTH_SHORT).show() //Displays a toast message
                } else {
                    Toast.makeText(this, "Please Enter All Fields", Toast.LENGTH_SHORT).show() //Displays a toast message

                }
        }

    }

}
private fun ArrayList<string>.add(string: String) {
}

