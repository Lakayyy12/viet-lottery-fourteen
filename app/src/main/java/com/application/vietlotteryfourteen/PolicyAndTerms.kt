package com.application.vietlotteryfourteen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class PolicyAndTerms : AppCompatActivity() {

    private var bck : ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_policy_and_terms)

        bck = findViewById(R.id.bck)
        bck?.setOnClickListener{
            onBackPressed()
        }
    }
}