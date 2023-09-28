package com.payphone.banner.annotation

import androidx.annotation.IntDef
import com.payphone.banner.mode.IndicatorStyle

/**
 * 指示器样式
 */
@IntDef(IndicatorStyle.CIRCLE, IndicatorStyle.DASH, IndicatorStyle.ROUND_RECT)
@Retention(AnnotationRetention.SOURCE)
@Target(AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.FIELD)
annotation class AIndicatorStyle
