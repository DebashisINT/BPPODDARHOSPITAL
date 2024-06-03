package com.breezebppoddar.features.weather.api

import com.breezebppoddar.base.BaseResponse
import com.breezebppoddar.features.task.api.TaskApi
import com.breezebppoddar.features.task.model.AddTaskInputModel
import com.breezebppoddar.features.weather.model.ForeCastAPIResponse
import com.breezebppoddar.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}