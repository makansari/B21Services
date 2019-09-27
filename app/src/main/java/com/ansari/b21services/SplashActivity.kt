package com.ansari.b21services

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {


    var myAnim : Animation? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

            myAnim = AnimationUtils.loadAnimation(this,R.anim.myanim)
            imageViewSplash.startAnimation(myAnim)

        var thread = Thread(){
            kotlin.run {
                Thread.sleep(10000)
            }

            var i = Intent(this,MainActivity::class.java)
            startActivity(i)
            overridePendingTransition(R.anim.act_anim,R.anim.myanim)
        }

        thread.start()
    }
}
