package com.payphone.banner.annotation

import androidx.annotation.IntDef
import com.payphone.banner.mode.PageStyle.Companion.MULTI_PAGE
import com.payphone.banner.mode.PageStyle.Companion.MULTI_PAGE_OVERLAP
import com.payphone.banner.mode.PageStyle.Companion.MULTI_PAGE_SCALE
import com.payphone.banner.mode.PageStyle.Companion.NORMAL
import java.lang.annotation.ElementType

/**
 * 指示器页面样式
 */
@Target(AnnotationTarget.VALUE_PARAMETER)
@IntDef(NORMAL, MULTI_PAGE, MULTI_PAGE_OVERLAP, MULTI_PAGE_SCALE)
@Retention(AnnotationRetention.SOURCE)
annotation class APageStyle()
