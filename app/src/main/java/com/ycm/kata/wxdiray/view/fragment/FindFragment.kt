package com.ycm.kata.wxdiray.view.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.view.ViewPager
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ycm.kata.wxdiray.R
import com.ycm.kata.wxdiray.presenter.bean.Article
import com.ycm.kata.wxdiray.view.adapter.FindArticleAdapter
import com.ycm.kata.wxdiray.view.adapter.LoopViewPagerAdapter

/**
 * Created by changmuyu on 2017/11/2.
 * Description:
 */
open class FindFragment : Fragment(), ViewPager.OnPageChangeListener {
    override fun onPageScrollStateChanged(state: Int) {

    }

    override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
    }

    override fun onPageSelected(position: Int) {
    }

    private val dataSource = ArrayList<Article>()
//    private var findArticleAdapter: FindArticleAdapter? = null
    private var vpFindArticle: ViewPager? = null
    private var linearLayoutManager: LinearLayoutManager? = null
    private var looperAdapter: LoopViewPagerAdapter? = null
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater!!.inflate(R.layout.fragment_find, null)
//        findArticleAdapter = FindArticleAdapter(context)
//        linearLayoutManager = LinearLayoutManager(context)
//        linearLayoutManager?.orientation = LinearLayoutManager.HORIZONTAL
//        linearLayoutManager?.widthMode
        vpFindArticle = view.findViewById(R.id.vp_find)
        activity?.let { looperAdapter = LoopViewPagerAdapter(vpFindArticle, null, it) }
        loadData()
        return view
    }

    private fun loadData() {
        for (i in 1..10) {
            val article = Article()
            article.content = "HHHHHHHHHHHHHHHHHHHH"
            article.imagePath = ""
            dataSource.add(article)
        }

        if (looperAdapter != null) {
            looperAdapter?.setList(dataSource)
        }
    }
}