package com.example.cuento

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_pg3.*
import kotlinx.android.synthetic.main.activity_pg4.*

class pg4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pg4)
        prev4.setOnClickListener {
            val prev: Intent = Intent(applicationContext, pg3::class.java)
            startActivity(prev)
        }
        next4.setOnClickListener {
            val next: Intent = Intent(applicationContext, pg5::class.java)
            startActivity(next)
        }
    }
}