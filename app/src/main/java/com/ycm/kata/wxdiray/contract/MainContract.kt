package com.ycm.kata.wxdiray.contract

import com.ycm.kata.wxdiray.presenter.BasePresenter
import com.ycm.kata.wxdiray.presenter.bean.Article
import com.ycm.kata.wxdiray.view.view.BaseView

/**
 * Created by changmuyu on 2017/11/2.
 * Description:
 */
interface MainContract {
    interface View : BaseView<Presenter> {
        fun initView()
    }

    interface Presenter : BasePresenter<View> {
        fun setDataSource(dataSource : ArrayList<Article>)
    }
}