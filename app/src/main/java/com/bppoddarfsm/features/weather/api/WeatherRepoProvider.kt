package com.bppoddarfsm.features.weather.api

import com.bppoddarfsm.features.task.api.TaskApi
import com.bppoddarfsm.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}