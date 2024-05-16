package com.breezebppoddarhospital.features.weather.api

import com.breezebppoddarhospital.features.task.api.TaskApi
import com.breezebppoddarhospital.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}