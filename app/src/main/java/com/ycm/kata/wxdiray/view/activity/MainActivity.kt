package com.ycm.kata.wxdiray.view.activity

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.View
import android.widget.LinearLayout
import com.ycm.kata.wxdiray.R
import com.ycm.kata.wxdiray.contract.MainContract
import com.ycm.kata.wxdiray.view.fragment.FindFragment
import com.ycm.kata.wxdiray.view.fragment.IdeaFragment
import com.ycm.kata.wxdiray.view.fragment.MeFragment

class MainActivity : BaseActivity(), MainContract.View, View.OnClickListener {
    private var llFound: LinearLayout? = null
    private var llIdea: LinearLayout? = null
    private var llMe: LinearLayout? = null
    private var findFragment: FindFragment? = null
    private var ideaFragment: IdeaFragment? = null
    private var meFragment: MeFragment? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findFragment = FindFragment()
        ideaFragment = IdeaFragment()
        meFragment = MeFragment()
        initView()

    }

    override fun initView() {
        llFound = findViewById(R.id.ll_found)
        llIdea = findViewById(R.id.ll_idea)
        llMe = findViewById(R.id.ll_me)
    }

    private fun showFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTran = fragmentManager.beginTransaction()
        fragmentTran.add(R.id.fragment_container, fragment).commit()
    }

    override fun onClick(view: View?) {
        if (view == null) {
            return
        }
        when (view.id) {
            R.id.ll_found -> showFragment(this.findFragment!!)
            R.id.ll_idea -> showFragment(this.ideaFragment!!)
            R.id.ll_me -> showFragment(this.meFragment!!)
        }
    }
}
