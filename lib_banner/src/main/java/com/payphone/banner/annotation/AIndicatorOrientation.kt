package com.payphone.banner.annotation

import androidx.annotation.IntDef

/**
 * create time : 2023/9/28 09:32
 * create by : xupengpeng
 */
//@IntDef(IndicatorOrientation.INDICATOR_HORIZONTAL, IndicatorOrientation.INDICATOR_VERTICAL,
//    IndicatorOrientation.INDICATOR_RTL)
@Retention(AnnotationRetention.SOURCE)

@Target(AnnotationTarget.VALUE_PARAMETER,AnnotationTarget.FIELD)
annotation class AIndicatorOrientation {
}