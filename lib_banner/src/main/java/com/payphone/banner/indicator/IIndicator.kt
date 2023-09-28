package com.payphone.banner.indicator

import androidx.viewpager.widget.ViewPager
import com.payphone.banner.options.IndicatorOptions

/**
 * IIndicator
 */
interface IIndicator : ViewPager.OnPageChangeListener {

    fun notifyDataChanged()

    fun setIndicatorOptions(options: IndicatorOptions)
}
