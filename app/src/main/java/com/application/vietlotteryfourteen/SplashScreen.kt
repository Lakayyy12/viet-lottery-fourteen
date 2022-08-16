package com.application.vietlotteryfourteen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import com.dakulangsakalam.customwebview.presentation.ui.jump.JumpActivity
import com.dakulangsakalam.customwebview.presentation.ui.jump.JumpType
import kotlinx.coroutines.ExperimentalCoroutinesApi

@OptIn(ExperimentalCoroutinesApi::class)

class SplashScreen : JumpActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        window.addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)
        val handler = Handler()
        handler.postDelayed({
            splashAction(JumpType.JUMP_LINK,1){ _, _ ->
            startActivity(Intent(this, MainActivity::class.java))
        }
        },1500)
    }
}