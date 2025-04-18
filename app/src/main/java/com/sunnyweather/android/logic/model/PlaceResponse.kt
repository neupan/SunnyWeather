package com.sunnyweather.android.logic.model

import com.google.gson.annotations.SerializedName

/**
 * @author: cong.pan
 * @e-mail: cong.pan@guasemi.com
 * @date: 2025/4/18
 * @desc:
 */
data class PlaceResponse(val status: String, val places: List<Place>)

/**
 * 城市信息
 */
data class Place(
    val name: String, val location: Location,
    @SerializedName("formatted_address") val address: String
)

/**
 * 地理位置信息, lng 代表经度, lat 代表纬度
 */
data class Location(val lng: String, val lat: String)

