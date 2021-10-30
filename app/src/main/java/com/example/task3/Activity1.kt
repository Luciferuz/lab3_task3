package com.example.task3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.task3.databinding.Activity1Binding

class Activity1 : AppCompatActivity() {

    private lateinit var binding: Activity1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Activity1Binding.inflate(layoutInflater)
        binding.toSecond.setOnClickListener { toSecondClick() }
        binding.bottomNavigation.setOnNavigationItemSelectedListener { onAboutClick(it) }
        setContentView(binding.root)
    }

    private fun onAboutClick(menuItem: MenuItem) : Boolean {
        when (menuItem.itemId) {
            R.id.to_about -> {
                startActivity(Intent(this, ActivityAbout::class.java))
            }
        }
        return false
    }

    private fun toSecondClick() {
        startActivity(Intent(this, Activity2::class.java))
    }
}