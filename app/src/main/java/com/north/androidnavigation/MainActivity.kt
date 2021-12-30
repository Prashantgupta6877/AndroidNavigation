package com.north.androidnavigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigation = findViewById<BottomNavigationView>(R.id.bottomNV)
        val controller = findNavController(R.id.fragmentContainerView)
        bottomNavigation.setupWithNavController(controller)

        val appConfiguration = AppBarConfiguration(
            setOf(
                R.id.fragment1, R.id.fragment2, R.id.fragment3
            )
        )
        setupActionBarWithNavController(controller,appConfiguration)
    }
}