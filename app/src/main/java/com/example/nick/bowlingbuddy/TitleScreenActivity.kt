package com.example.nick.bowlingbuddy

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_title_screen.*

class TitleScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_title_screen)

        //start new activity
        newGameButton.setOnClickListener {
            val intent = Intent(this, FramesActivity::class.java)
            startActivity(intent)
        }
    }
}
