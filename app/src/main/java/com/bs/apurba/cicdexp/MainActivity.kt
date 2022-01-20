package com.bs.apurba.cicdexp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.widget.TextView
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ThemeUtility().applyTheme(ThemeUtility.DARK)
        val animation = AnimationUtility.getBubbleAnimation()
        animation.repeatCount = Animation.INFINITE

        findViewById<TextView>(R.id.tv_greetings).startAnimation(animation)

        Glide.with(this)
            .asGif()
            .load("https://www.hubspot.com/hubfs/Smiling%20Leo%20Perfect%20GIF.gif")
            .into(findViewById(R.id.iv_gif));
    }
}