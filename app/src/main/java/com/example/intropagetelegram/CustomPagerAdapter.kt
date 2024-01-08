package com.example.intropagetelegram

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.intropagetelegram.databinding.FragmentPagerBinding

class CustomPagerAdapter(activity: MainActivity,val list: List<ModulData>): FragmentStateAdapter(activity){
    override fun getItemCount(): Int {
        return list.size
    }

    override fun createFragment(position: Int): Fragment {

        return PagerFragment().apply {
            arguments= Bundle().apply {
                val item= list[position]
                putInt("image",item.image)
                putString("title",item.title)
                putString("description",item.description)
            }
        }
    }

}