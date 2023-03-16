package com.example.hm4m6.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.hm4m6.FirstFragment.FirstFragment
import com.example.hm4m6.SecondFragment.SecondFragment
import com.example.hm4m6.ThirdFragment.OperationsFragment
import hm4m6.databinding.FragmentThirdBinding

class PagerAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {

    val count = 3

    override fun getItemCount(): Int = count

    override fun createFragment(position: Int): Fragment {
        return  when(position){
            0->{
                FirstFragment()
            }
            1->{
                SecondFragment()
            }
            2->{
                OperationsFragment()
            }
            else -> FirstFragment()
        }
    }

}