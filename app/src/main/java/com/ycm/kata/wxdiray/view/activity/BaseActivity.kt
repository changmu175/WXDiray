package com.ycm.kata.wxdiray.view.activity

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.gyf.barlibrary.ImmersionBar
import com.ycm.kata.wxdiray.R

/**
 * Created by changmuyu on 2017/11/2.
 * Description:
 */
@SuppressLint("Registered")
open class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ImmersionBar.with(this)
                .statusBarColor(R.color.colorTrans)
                .statusBarDarkFont(true)
                .fullScreen(true)
                .init()

    }
}