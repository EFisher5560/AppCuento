package com.example.cuento

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_pg4.*
import kotlinx.android.synthetic.main.activity_pg6.*

class pg6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pg6)
        prev6.setOnClickListener {
            val prev: Intent = Intent(applicationContext, pg5::class.java)
            startActivity(prev)
        }
        next6.setOnClickListener {
            val next: Intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(next)
        }
    }
}