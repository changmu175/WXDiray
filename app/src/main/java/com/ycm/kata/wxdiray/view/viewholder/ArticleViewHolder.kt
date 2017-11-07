package com.ycm.kata.wxdiray.view.viewholder

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.ycm.kata.wxdiray.R

/**
 * Created by changmuyu on 2017/11/3.
 * Description:
 */
class ArticleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var ivPic: ImageView? = itemView.findViewById(R.id.iv_image)
    var tvContent: TextView? = itemView.findViewById(R.id.tv_content)
}