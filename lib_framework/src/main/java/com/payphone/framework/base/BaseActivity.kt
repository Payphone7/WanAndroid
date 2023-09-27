package com.payphone.framework.base

import android.os.Bundle
import androidx.annotation.StringRes
import androidx.appcompat.app.AppCompatActivity
import com.payphone.framework.R
import com.payphone.framework.utils.LoadingUtils
import com.payphone.framework.utils.TipsToast

/**
 * create time : 2023/9/26 16:45
 * create by : xupengpeng
 */
abstract class BaseActivity: AppCompatActivity() {
    protected var TAG = this.javaClass.simpleName

    private val dialogUtils by lazy {
        LoadingUtils(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentLayout()
        initView(savedInstanceState)
        initData()
    }

    open fun setContentLayout() {
        setContentView(getLayoutResId())
    }

    abstract fun initView(savedInstanceState: Bundle?)

    abstract fun getLayoutResId(): Int

    open fun initData(){

    }

    fun showLoading() {
        showLoading(getString(R.string.default_loading))
    }

    /**
     * 加载提示框
     */
    fun showLoading(msg: String?) {
        dialogUtils.showLoading(msg)
    }

    /**
     * 加载提示框
     */
    fun showLoading(@StringRes res: Int) {
        showLoading(getString(res))
    }

    /**
     * 关闭提示框
     */
    fun dismissLoading() {
        dialogUtils.dismissLoading()
    }

    /**
     * Toast
     * @param msg Toast内容
     */
    fun showToast(msg: String) {
        TipsToast.instance.showTips(msg)
    }

    /**
     * Toast
     * @param resId 字符串id
     */
    fun showToast(@StringRes resId: Int) {
        TipsToast.instance.showTips(resId)
    }

    override fun onDestroy() {
        super.onDestroy()
    }

}