package com.ycm.kata.wxdiray.view.adapter

import android.support.v4.view.PagerAdapter
import android.support.v4.view.ViewPager
import android.view.View
import android.view.ViewGroup
import java.util.*

/**
 * Created by changmuyu on 2017/11/5.
 * Description:
 */
class FindArticlePagerAdapter(private val viewList: ArrayList<View>) : PagerAdapter() {

    override fun isViewFromObject(view: View?, `object`: Any?): Boolean = view == `object`

    override fun getCount(): Int = viewList.size


    override fun instantiateItem(container: ViewGroup?, position: Int): Any {
        container?.addView(viewList[position])
        return super.instantiateItem(container, position)
    }

    override fun destroyItem(container: ViewGroup?, position: Int, `object`: Any?) {
        container?.removeView(viewList[position])
    }
}