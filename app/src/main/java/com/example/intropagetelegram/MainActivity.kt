package com.example.intropagetelegram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.MediatorLiveData
import com.example.intropagetelegram.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val list = listOf<ModulData>(
            ModulData(R.drawable.img,"Telegram",""),
            ModulData(R.drawable.fast,"Fast",""),
            ModulData(R.drawable.time,"time",""),
            ModulData(R.drawable.cloud,"cloud",""),
            ModulData(R.drawable.powerful,"powerful","")
        )


        val customPagerAdapter = CustomPagerAdapter(this,list)
        binding.viewPager2.adapter= customPagerAdapter

        TabLayoutMediator(binding.tabLayout,binding.viewPager2){ _, _ ->
        }.attach()
    }
}