package com.mic.tabviewpager

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter


class MyAdapter(fm:FragmentManager,val myContext: Context) : FragmentPagerAdapter(fm) {
    lateinit var fg:Fragment
    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> fg = FirstFragment()
            1 -> fg = SecondFragment()

        }
        return  fg

    }

    override fun getCount(): Int {
        return 2
    }

    override fun getPageTitle(position: Int): CharSequence? {

        return when (position) {
            0 -> "page one"
            1 -> "page two"
            else -> null
        }
    }

}