package com.payphone.lib_framework

/**
 * create time : 2023/9/27 09:12
 * create by : xupengpeng
 */
inline fun <reified T> Any.saveAs() : T{
    return this as T
}


@Suppress("UNCHECKED_CAST")
fun <T> Any.saveAsUnChecked() : T{
    return this as T
}

inline fun <reified T> Any.isEqualType() : Boolean{
    return this is T
}