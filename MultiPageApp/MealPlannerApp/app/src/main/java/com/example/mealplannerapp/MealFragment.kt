package com.example.mealplannerapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.fragment.app.Fragment

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        val listView = view.findViewById<ListView>(R.id.mealListView)

        val meals = MealRepository.getMeals()
        val mealDescriptions = meals.map { "${it.name} - ${it.day}" }

        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, mealDescriptions)
        listView.adapter = adapter

        return view
    }
}
