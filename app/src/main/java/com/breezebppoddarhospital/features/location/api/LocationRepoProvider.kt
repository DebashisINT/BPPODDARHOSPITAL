package com.breezebppoddarhospital.features.location.api

import com.breezebppoddarhospital.features.location.shopdurationapi.ShopDurationApi
import com.breezebppoddarhospital.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}