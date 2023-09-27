package com.payphone.lib_framework.loading

import android.app.Dialog
import android.content.Context
import android.view.LayoutInflater
import android.view.Window
import android.view.animation.Animation
import android.view.animation.RotateAnimation
import com.payphone.lib_framework.R
import com.payphone.lib_framework.databinding.LoadingCenterBinding

/**
 * create time : 2023/9/26 16:46
 * create by : xupengpeng
 */
class CenterLoadingView(context: Context) : Dialog(context, R.style.loading_dialog) {

    private var mBinding: LoadingCenterBinding
    private var animation: Animation? = null

    init {
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        mBinding = LoadingCenterBinding.inflate(LayoutInflater.from(context))
        setContentView(mBinding.root)
        initAnimation()
    }

    private fun initAnimation(){
        animation = RotateAnimation(
            0f,
            360f,
            Animation.RELATIVE_TO_SELF,
            0.5f,
            Animation.RELATIVE_TO_SELF,
            0.5f
        )
        animation?.apply {
            duration = 2000
            repeatCount = 40
            fillAfter = true
        }
    }

    override fun show() {
        super.show()
        mBinding.ivImage.startAnimation(animation)
    }

}