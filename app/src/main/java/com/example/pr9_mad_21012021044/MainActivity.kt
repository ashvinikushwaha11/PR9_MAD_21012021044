package com.example.pr9_mad_21012021044

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var alarmanimation :AnimationDrawable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val alarmimage = findViewById<ImageView>(R.id.Alarmimage)
        alarmimage.setBackgroundResource(R.drawable.alarm_animation_list)
        alarmimage.background as AnimationDrawable
    }
    override fun onWindowFocusChanged(hasFocus: Boolean) {
        if (hasFocus){
            alarmanimation.start()
        }
        else{
            alarmanimation.stop()
        }
        super.onWindowFocusChanged(hasFocus)
    }
}