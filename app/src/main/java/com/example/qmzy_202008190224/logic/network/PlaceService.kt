package com.example.qmzy_202008190224.logic.network

import com.example.qmzy_202008190224.SunnyWeatherApplication
import com.example.qmzy_202008190224.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PlaceService {

    @GET("v2/place?token=${SunnyWeatherApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query") query: String): Call<PlaceResponse>

}