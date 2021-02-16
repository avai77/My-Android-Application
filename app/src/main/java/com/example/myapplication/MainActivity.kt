package com.example.myapplication

import android.graphics.Color
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button2 = findViewById<Button>(R.id.button)
        val imageButton = findViewById<ImageButton>(R.id.imageButton)
        button2.setOnClickListener(this)
        imageButton.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.button -> {
                val lastName = findViewById<View>(R.id.button) as TextView
                lastName.text = "Aidarov"
                val myToast = Toast.makeText(applicationContext, "My last name!", Toast.LENGTH_LONG)
                myToast.show()
                val handleToast = Handler()
                handleToast.postDelayed({
                    val mySecondToast = Toast.makeText(applicationContext, "I changed my name!", Toast.LENGTH_LONG)
                    mySecondToast.show()
                }, 3000)
            }
            R.id.imageButton -> {
                val imageButton = findViewById<View>(R.id.imageButton) as ImageButton
                val firstName = findViewById<View>(R.id.button) as TextView
                firstName.text = "Avai"
                val myThirdToast = Toast.makeText(applicationContext, "My first name!", Toast.LENGTH_SHORT)
                myThirdToast.show()
                imageButton.setBackgroundColor(Color.BLACK)
            }
        }
    }
}