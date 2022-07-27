package com.bppoddarfsm.features.location.shopRevisitStatus

import com.bppoddarfsm.features.location.shopdurationapi.ShopDurationApi
import com.bppoddarfsm.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}