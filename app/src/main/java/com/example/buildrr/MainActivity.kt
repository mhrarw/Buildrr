package com.example.buildrr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.tbuonomo.viewpagerdotsindicator.SpringDotsIndicator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        val viewPager : ViewPager2 = findViewById(R.id.viewpager2)

        val fragment: ArrayList<Fragment> = arrayListOf(
            Onboarding1Fragment(),
            Onboarding2Fragment(),
            Onboarding3Fragment()
        )

        val adapter = ViewPagerAdapter(fragment, this)
        viewPager.adapter = adapter

        val springDotsIndicator = findViewById<SpringDotsIndicator>(R.id.spring_dots_indicator)
        viewPager.adapter = adapter
        springDotsIndicator.attachTo(viewPager)

    }
}