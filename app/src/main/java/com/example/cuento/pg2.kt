package com.example.cuento

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_pg2.*

class pg2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pg2)

        prev2.setOnClickListener {
            val prev: Intent = Intent(applicationContext, pg1::class.java)
            startActivity(prev)
        }
        next2.setOnClickListener {
            val next: Intent = Intent(applicationContext, pg3::class.java)
            startActivity(next)
        }
    }
}