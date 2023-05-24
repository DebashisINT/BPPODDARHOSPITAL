package com.bppoddarfsm.features.location.api

import com.bppoddarfsm.features.location.shopdurationapi.ShopDurationApi
import com.bppoddarfsm.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}