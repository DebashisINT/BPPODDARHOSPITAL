package com.breezebppoddar.features.location.shopRevisitStatus

import com.breezebppoddar.features.location.shopdurationapi.ShopDurationApi
import com.breezebppoddar.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}