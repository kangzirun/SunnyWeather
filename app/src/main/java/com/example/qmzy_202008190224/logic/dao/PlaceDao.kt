package com.example.qmzy_202008190224.logic.dao

import android.content.Context
import android.provider.Settings.System.putString
import androidx.core.content.edit
import com.example.qmzy_202008190224.SunnyWeatherApplication
import com.example.qmzy_202008190224.logic.model.Place
import com.google.gson.Gson


object PlaceDao {

    fun savePlace(place: Place) {
        sharedPreferences().edit {
            putString("place", Gson().toJson(place))
        }
    }

    fun getSavedPlace(): Place {
        val placeJson = sharedPreferences().getString("place", "")
        return Gson().fromJson(placeJson, Place::class.java)
    }

    fun isPlaceSaved() = sharedPreferences().contains("place")

    private fun sharedPreferences() =
        SunnyWeatherApplication.context.getSharedPreferences("sunny_weather", Context.MODE_PRIVATE)

}