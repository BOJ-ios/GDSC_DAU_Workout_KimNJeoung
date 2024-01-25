package com.example.workout

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavOptions
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.workout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val menuItemToIndex = mapOf(
        R.id.navigation_home to 0,
        R.id.navigation_dashboard to 1,
        R.id.navigation_notifications to 2
    )
    private var currentMenuItemIndex = 0 // 초기 인덱스

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
        binding.navView.setOnItemSelectedListener { item ->
            val selectedIndex = menuItemToIndex[item.itemId] ?: 0

            // 현재 선택된 항목이 이전에 선택된 항목과 동일한 경우, 아무런 액션도 취하지 않음
            if (selectedIndex == currentMenuItemIndex) {
                return@setOnItemSelectedListener true
            }

            val navOptions = if (selectedIndex > currentMenuItemIndex) {
                // 오른쪽에서 왼쪽으로 슬라이드
                NavOptions.Builder()
                    .setEnterAnim(R.anim.slide_in_right)
                    .setExitAnim(R.anim.slide_out_left)
                    .build()
            } else {
                // 왼쪽에서 오른쪽으로 슬라이드
                NavOptions.Builder()
                    .setEnterAnim(R.anim.slide_in_left)
                    .setExitAnim(R.anim.slide_out_right)
                    .build()
            }

            currentMenuItemIndex = selectedIndex // 현재 선택된 인덱스 업데이트

            when (item.itemId) {
                R.id.navigation_home -> {
                    navController.navigate(R.id.navigation_home, null, navOptions)
                }
                R.id.navigation_dashboard -> {
                    navController.navigate(R.id.navigation_dashboard, null, navOptions)
                }
                R.id.navigation_notifications -> {
                    navController.navigate(R.id.navigation_notifications, null, navOptions)
                }
            }
            true
        }
    }
}