package com.example.mealplannerapp

object MealRepository {
    private val meals = mutableListOf<Meal>()

    fun addMeal(meal: Meal) {
        meals.add(meal)
    }

    fun getMeals(): List<Meal> {
        return meals
    }
}