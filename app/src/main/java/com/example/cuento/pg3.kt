package com.example.cuento

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_pg2.*
import kotlinx.android.synthetic.main.activity_pg3.*

class pg3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pg3)
        prev3.setOnClickListener {
            val prev: Intent = Intent(applicationContext, pg2::class.java)
            startActivity(prev)
        }
        next3.setOnClickListener {
            val next: Intent = Intent(applicationContext, pg4::class.java)
            startActivity(next)
        }
    }
}