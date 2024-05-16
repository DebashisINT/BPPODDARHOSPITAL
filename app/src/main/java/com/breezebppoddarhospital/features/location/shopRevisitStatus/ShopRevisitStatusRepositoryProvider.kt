package com.breezebppoddarhospital.features.location.shopRevisitStatus

import com.breezebppoddarhospital.features.location.shopdurationapi.ShopDurationApi
import com.breezebppoddarhospital.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}