package com.sunnyweather.android.logic

import kotlinx.coroutines.Dispatchers
import retrofit2.http.Query

/**
 * @author: cong.pan
 * @e-mail: cong.pan@guasemi.com
 * @date: 2025/4/18
 * @desc: 单例类 仓库层的统一封装入口
 */
object Repository {

    // 城市搜索
    fun searchPlaces(query: String) = fire(Dispatchers)
}