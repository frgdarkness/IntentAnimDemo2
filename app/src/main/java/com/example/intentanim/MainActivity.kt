package com.example.intentanim

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGoSecond.setOnClickListener {
            var intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.anim_enter_1,R.anim.anim_exit_4)
        }
    }
}
