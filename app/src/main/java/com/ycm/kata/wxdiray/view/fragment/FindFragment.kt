package com.ycm.kata.wxdiray.view.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ycm.kata.wxdiray.R
import com.ycm.kata.wxdiray.presenter.bean.Article
import com.ycm.kata.wxdiray.view.adapter.FindArticleAdapter
/**
 * Created by changmuyu on 2017/11/2.
 * Description:
 */
open class FindFragment : Fragment() {
    private val dataSource = ArrayList<Article>()
    private var findArticleAdapter: FindArticleAdapter? = null
    private var rvFindArticle: RecyclerView? = null
    private var linearLayoutManager: LinearLayoutManager? = null

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater!!.inflate(R.layout.fragment_find, null)
        findArticleAdapter = FindArticleAdapter(context)
        linearLayoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        rvFindArticle = view.findViewById(R.id.rv_find)
        rvFindArticle!!.layoutManager = linearLayoutManager
        rvFindArticle!!.adapter = findArticleAdapter
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

        if (findArticleAdapter != null) {
            findArticleAdapter!!.setDataSource(dataSource)
        }
    }
}