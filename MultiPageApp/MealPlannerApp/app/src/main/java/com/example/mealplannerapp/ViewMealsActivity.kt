package com.example.mealplannerapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ViewMealsActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_meals)

        val day = intent.getStringExtra("day")
        val meals = MealRepository.getMeals().filter { it.day == day }

        val textView = findViewById<TextView>(R.id.mealsTextView)
        val mealsText = meals.joinToString("\n") { "${it.name}: ${it.description}" }
        textView.text = "Meals for $day:\n$mealsText"
    }
}
