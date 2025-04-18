package com.sunnyweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

/**
 * @author: cong.pan
 * @e-mail: cong.pan@guasemi.com
 * @date: 2025/4/18
 * @desc: 提供一种全局获取 Context 的方式
 */
class SunnyWeatherApplication : Application() {
    companion object {
        const val TOKEN = "uUiGaIXkRNQTrpzK"

        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}