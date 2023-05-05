package com.jason.mathfunctions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Toast
import com.jason.mathfunctions.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        val anim1 = AnimationUtils.loadAnimation(this, R.anim.anim)

        binding.mathTextView.startAnimation(anim1)
        anim1.setAnimationListener(object : Animation.AnimationListener {

            override fun onAnimationStart(animation: Animation?) {

            }

            override fun onAnimationEnd(animation: Animation?) {
                startActivity(Intent(this@MainActivity, FunctionsActivity::class.java))
                finish()
            }

            override fun onAnimationRepeat(animation: Animation?) {
                Toast.makeText(this@MainActivity, "repeat", Toast.LENGTH_SHORT).show()
            }

        })
    }
}