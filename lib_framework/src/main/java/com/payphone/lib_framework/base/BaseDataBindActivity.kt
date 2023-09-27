package com.payphone.lib_framework.base

import android.view.LayoutInflater
import androidx.viewbinding.ViewBinding
import com.payphone.lib_framework.ext.saveAs
import com.payphone.lib_framework.ext.saveAsUnChecked
import java.lang.reflect.ParameterizedType

/**
 * create time : 2023/9/26 18:10
 * create by : xupengpeng
 */
abstract class BaseDataBindActivity<DB :ViewBinding> :BaseActivity (){

    lateinit var mBinding: DB


    override fun setContentLayout() {
        val type = javaClass.genericSuperclass
        val dbClass: Class<DB> = type!!.saveAs<ParameterizedType>().actualTypeArguments[0].saveAs()
        val method = dbClass.getDeclaredMethod("inflate",LayoutInflater::class.java)
        mBinding = method.invoke(this,layoutInflater)!!.saveAsUnChecked()
        setContentView(mBinding.root)
    }

    override fun getLayoutResId(): Int {
        return 0
    }
}