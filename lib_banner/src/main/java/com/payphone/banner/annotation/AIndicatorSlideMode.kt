package com.payphone.banner.annotation

import androidx.annotation.IntDef
import com.payphone.banner.mode.IndicatorSlideMode.Companion.COLOR
import com.payphone.banner.mode.IndicatorSlideMode.Companion.NORMAL
import com.payphone.banner.mode.IndicatorSlideMode.Companion.SCALE
import com.payphone.banner.mode.IndicatorSlideMode.Companion.SMOOTH
import com.payphone.banner.mode.IndicatorSlideMode.Companion.WORM

/**
 * 指示器滑动模式
 */
@IntDef(NORMAL, SMOOTH, WORM, COLOR, SCALE)
@Retention(AnnotationRetention.SOURCE)
@Target(AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.FIELD)
annotation class AIndicatorSlideMode
