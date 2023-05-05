package com.jason.mathfunctions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jason.mathfunctions.databinding.ActivityFunctionsBinding
import com.jason.mathfunctions.functions.OvalActivity
import com.jason.mathfunctions.functions.SquareActivity
import com.jason.mathfunctions.functions.TriangleActivity

class FunctionsActivity : AppCompatActivity() {
    lateinit var binding: ActivityFunctionsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFunctionsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.triangleTextView.setOnClickListener{
            startActivity(Intent(this, TriangleActivity::class.java))
        }

        binding.squareTextView.setOnClickListener{
            startActivity(Intent(this, SquareActivity::class.java))
        }

        binding.ovalTextView.setOnClickListener{
            startActivity(Intent(this, OvalActivity::class.java))
        }

    }
}