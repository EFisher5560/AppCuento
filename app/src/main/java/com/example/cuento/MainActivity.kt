package com.example.cuento

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_pg1.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnComenzar.setOnClickListener {
           val pagina1:Intent= Intent(applicationContext, pg1::class.java)
            startActivity(pagina1)

        }

    }

}