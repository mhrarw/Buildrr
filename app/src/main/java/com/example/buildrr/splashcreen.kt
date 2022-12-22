package com.example.buildrr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.core.view.WindowCompat

class splashcreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashcreen)

        supportActionBar?.hide()
        WindowCompat.setDecorFitsSystemWindows(window, false)
        Handler().postDelayed(Runnable {
            val i = Intent(this@splashcreen, MainActivity::class.java)
            startActivity(i)
            // close this activity
            finish()
        }, 3000)
    }
}
