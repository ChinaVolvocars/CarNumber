package com.tiger.auto.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), LicensePlateView.InputListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        activity_lpv.setInputListener(MainActivity@ this)

        activity_lpv.setKeyboardContainerLayout(main_rl_container)
        activity_lpv.showLastView()
//        activity_lpv.hideLastView()
        activity_lpv.onSetTextColor(R.color.colorAccent)
    }

    override fun inputComplete(content: String?) {
    }

    override fun deleteContent() {
    }


}