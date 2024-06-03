package com.breezebppoddar.features.weather.api

import com.breezebppoddar.features.task.api.TaskApi
import com.breezebppoddar.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}