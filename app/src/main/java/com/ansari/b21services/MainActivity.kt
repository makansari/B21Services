package com.ansari.b21services

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonStart.setOnClickListener(){
            var myIntent = Intent(this,MyIntentService::class.java)
            startService(myIntent)
        }

        buttonStop.setOnClickListener(){
            var myIntent = Intent(this,MyService::class.java)
            stopService(myIntent)
        }
    }

    override fun onBackPressed() {
       // super.onBackPressed()
    }
}
