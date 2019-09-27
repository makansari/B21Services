package com.ansari.b21services

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder
import android.util.Log

class MyService : Service() {

    override fun onBind(intent: Intent): IBinder {
        TODO("Return the communication channel to the service.")
    }

    var mediaPlayer = MediaPlayer()
    override fun onCreate() {
        super.onCreate()
            mediaPlayer = MediaPlayer.create(this, R.raw.kali)
        Log.i("mytag","service CREATED")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.i("mytag","service STARTED")
            mediaPlayer.start()
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("mytag","service DESTROYED")

        mediaPlayer.stop()

    }
}
