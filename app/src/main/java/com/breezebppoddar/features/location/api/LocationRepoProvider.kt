package com.breezebppoddar.features.location.api

import com.breezebppoddar.features.location.shopdurationapi.ShopDurationApi
import com.breezebppoddar.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}