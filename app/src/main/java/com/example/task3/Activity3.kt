package com.example.task3

import android.content.Intent
import android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.task3.databinding.Activity3Binding

class Activity3 : AppCompatActivity() {

    private lateinit var binding: Activity3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Activity3Binding.inflate(layoutInflater)
        binding.toFirst.setOnClickListener { toFirstClick() }
        binding.toSecond.setOnClickListener { toSecondClick() }
        binding.bottomNavigation.setOnNavigationItemSelectedListener { onNavAboutClick(it) }
        setContentView(binding.root)
    }

    private fun toFirstClick() {
        startActivity(Intent(this, Activity1::class.java).setFlags(FLAG_ACTIVITY_CLEAR_TOP))
    }

    private fun toSecondClick() {
        startActivity(Intent(this, Activity2::class.java).setFlags(FLAG_ACTIVITY_CLEAR_TOP))
    }

    private fun onNavAboutClick(menuItem: MenuItem) : Boolean {
        when (menuItem.itemId) {
            R.id.to_about -> {
                startActivity(Intent(this, ActivityAbout::class.java))
            }
        }
        return false
    }
}
