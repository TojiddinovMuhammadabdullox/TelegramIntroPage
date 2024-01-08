package com.example.intropagetelegram

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.intropagetelegram.databinding.FragmentPagerBinding

class PagerFragment : Fragment() {
   private val binding by lazy { FragmentPagerBinding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

       arguments?.apply {
           binding.imageView2.setImageResource(getInt("image",R.drawable.img))
           binding.titleTv.text=getString("title")
           binding.descriptionTv.text=getString("description")
       }

    }
}