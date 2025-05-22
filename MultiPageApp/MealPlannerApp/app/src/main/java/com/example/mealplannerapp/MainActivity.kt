package com.example.mealplannerapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val planMealButton = findViewById<Button>(R.id.planMealButton)
        val viewMealsButton = findViewById<Button>(R.id.viewMealsButton)

        planMealButton.setOnClickListener {
            val intent = Intent(this, PlanMealActivity::class.java)
            startActivity(intent)
        }

        viewMealsButton.setOnClickListener {
            val intent = Intent(this, ViewMealsActivity::class.java)
            startActivity(intent)
        }
    }
}
