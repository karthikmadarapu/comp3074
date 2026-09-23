package com.example.lab2

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var counter = 0
    private var stepValue = 1 // Default step size is 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvOutput = findViewById<TextView>(R.id.tvOutput)
        val btnPlus = findViewById<Button>(R.id.btnPlus)
        val btnMinus = findViewById<Button>(R.id.btnMinus)
        val btnReset = findViewById<Button>(R.id.btnReset)
        val btnStep = findViewById<Button>(R.id.btnStep)

        // Add
        btnPlus.setOnClickListener {
            counter += stepValue
            tvOutput.text = counter.toString()
        }

        // Subtract
        btnMinus.setOnClickListener {
            counter -= stepValue
            tvOutput.text = counter.toString()
        }

        // Step (Changes behavior to step by 2)
        btnStep.setOnClickListener {
            stepValue = 2
        }

        // Reset (Resets counter to 0 and step back to default 1)
        btnReset.setOnClickListener {
            counter = 0
            stepValue = 1
            tvOutput.text = counter.toString()
        }
    }
}