package com.bppoddarfsm.features.weather.api

import com.bppoddarfsm.base.BaseResponse
import com.bppoddarfsm.features.task.api.TaskApi
import com.bppoddarfsm.features.task.model.AddTaskInputModel
import com.bppoddarfsm.features.weather.model.ForeCastAPIResponse
import com.bppoddarfsm.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}