package com.example.cuento

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_pg1.*

class pg1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pg1)

        prev1.setOnClickListener {
            val prev: Intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(prev)
        }
        next1.setOnClickListener {
            val next: Intent = Intent(applicationContext, pg2::class.java)
            startActivity(next)
        }
    }
}