@file:JvmName("ImageLoader")
package com.ycm.kata.wxdiray.utils

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy

/**
 * Created by changmuyu on 2017/11/3.
 * Description:
 */
fun loadImage(context: Context, imageUri: String, target: ImageView) {
    Glide.with(context)
            .load(imageUri)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .centerCrop()
            .into(target)
}
