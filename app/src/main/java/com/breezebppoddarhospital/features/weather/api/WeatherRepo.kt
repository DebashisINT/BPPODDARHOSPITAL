package com.breezebppoddarhospital.features.weather.api

import com.breezebppoddarhospital.base.BaseResponse
import com.breezebppoddarhospital.features.task.api.TaskApi
import com.breezebppoddarhospital.features.task.model.AddTaskInputModel
import com.breezebppoddarhospital.features.weather.model.ForeCastAPIResponse
import com.breezebppoddarhospital.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}