package com.example.mealplannerapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class PlanMealActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plan_meal)

        val nameEditText = findViewById<EditText>(R.id.mealNameEditText)
        val descriptionEditText = findViewById<EditText>(R.id.mealDescriptionEditText)
        val dayEditText = findViewById<EditText>(R.id.dayEditText)
        val saveMealButton = findViewById<Button>(R.id.saveMealButton)

        saveMealButton.setOnClickListener {
            val name = nameEditText.text.toString()
            val description = descriptionEditText.text.toString()
            val day = dayEditText.text.toString()

            if (name.isNotEmpty() && description.isNotEmpty() && day.isNotEmpty()) {
                val meal = Meal(name, description, day)
                MealRepository.addMeal(meal)

                Toast.makeText(this, "Meal saved!", Toast.LENGTH_SHORT).show()
                finish()
            } else {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
            }
        }
    }
}