package com.testeapp.app

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class Abertura : AppCompatActivity() {

    private val SPLASH_TIME_OUT: Long = 2000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Assuming activity_splash is your splash screen layout

        Handler().postDelayed({
            val intent = Intent(this@Abertura, Login::class.java)
            startActivity(intent)
            finish()
        }, SPLASH_TIME_OUT)
    }
}
