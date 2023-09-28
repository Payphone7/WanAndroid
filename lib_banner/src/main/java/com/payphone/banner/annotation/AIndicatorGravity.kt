package com.payphone.banner.annotation

import androidx.annotation.IntDef
import com.payphone.banner.mode.IndicatorGravity


/**
 * create time : 2023/9/28 09:25
 * create by : xupengpeng
 */

@IntDef(IndicatorGravity.CENTER,IndicatorGravity.START,IndicatorGravity.END)
@Retention(AnnotationRetention.SOURCE)
@Target(AnnotationTarget.VALUE_PARAMETER)
annotation class AIndicatorGravity {
}