package com.application.vietlotteryfourteen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PageAbout : AppCompatActivity() {

    private var oval : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_about)

        oval = findViewById(R.id.oval)
        oval?.setOnClickListener{
            onBackPressed()
        }
    }
}