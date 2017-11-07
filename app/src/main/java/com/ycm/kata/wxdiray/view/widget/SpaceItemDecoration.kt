package com.ycm.kata.wxdiray.view.widget

import android.graphics.Rect
import android.support.v7.widget.RecyclerView
import android.view.View

/**
 * Created by changmuyu on 2017/11/5.
 * Description:
 */
class SpaceItemDecoration(private var mSpace: Int) : RecyclerView.ItemDecoration() {

    override fun getItemOffsets(outRect: Rect?, view: View?, parent: RecyclerView?, state: RecyclerView.State?) {
        super.getItemOffsets(outRect, view, parent, state)
        outRect?.right ?: mSpace
        outRect?.bottom ?: mSpace
        outRect?.top ?: mSpace
        if (parent?.getChildAdapterPosition(view) == 0) {
            outRect?.left ?: mSpace * 2
        }
    }
}