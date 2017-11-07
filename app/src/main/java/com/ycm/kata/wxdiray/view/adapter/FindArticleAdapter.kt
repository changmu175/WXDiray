package com.ycm.kata.wxdiray.view.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.LinearLayout
import com.ycm.kata.wxdiray.R
import com.ycm.kata.wxdiray.presenter.bean.Article
import com.ycm.kata.wxdiray.utils.loadImage
import com.ycm.kata.wxdiray.view.viewholder.ArticleViewHolder

/**
 * Created by changmuyu on 2017/11/3.
 * Description:
 */

class FindArticleAdapter(private val context: Context) : RecyclerView.Adapter<ArticleViewHolder>() {
    private val dataSource = ArrayList<Article>()

    fun setDataSource(dataSource: ArrayList<Article>) {
        if (!this.dataSource.isEmpty()) {
            this.dataSource.clear()
        }
        this.dataSource.addAll(dataSource)
        notifyDataSetChanged()
    }

    fun appendDataSource(dataSource: ArrayList<Article>) {
        this.dataSource.addAll(dataSource)
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: ArticleViewHolder?, position: Int) {
        val article = dataSource[position]
        //顶层函数现在可以直接调用了？
        loadImage(context, " ", holder!!.ivPic!!)
        holder.tvContent!!.text = article.content
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ArticleViewHolder {
        val view = LayoutInflater.from(this.context).inflate( R.layout.item_article_card, parent, false)
        return ArticleViewHolder(view)
    }

    override fun getItemCount(): Int {
        return dataSource.size
    }

}
