package com.ansari.b21services

import android.app.IntentService
import android.content.Intent
import android.util.Log
import android.widget.Toast

class MyIntentService : IntentService("myThread") {

    override fun onHandleIntent(intent: Intent?) {
        Toast.makeText(this,"Intent onHandle intetn",Toast.LENGTH_SHORT).show()

        for(i in 1..10){
            Thread.sleep(1000)
        }

        for(i in 1..20){
            Thread.sleep(1000)
        }
    }

    override fun onCreate() {
        super.onCreate()
        Log.i("myTag","Intent Service Created")
        Toast.makeText(this,"Intent Service",Toast.LENGTH_SHORT).show()
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.i("myTag","Intent Service started")
        Toast.makeText(this,"Intent Service Started",Toast.LENGTH_LONG).show()

        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this,"Intent Service Destroyed",Toast.LENGTH_LONG).show()

        Log.i("myTag","Intent Service Destoryed")

    }
}