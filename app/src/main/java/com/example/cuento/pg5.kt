package com.example.cuento

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_pg4.*
import kotlinx.android.synthetic.main.activity_pg5.*

class pg5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pg5)
        prev5.setOnClickListener {
            val prev: Intent = Intent(applicationContext, pg4::class.java)
            startActivity(prev)
        }
        next5.setOnClickListener {
            val next: Intent = Intent(applicationContext, pg6::class.java)
            startActivity(next)
        }
    }
}