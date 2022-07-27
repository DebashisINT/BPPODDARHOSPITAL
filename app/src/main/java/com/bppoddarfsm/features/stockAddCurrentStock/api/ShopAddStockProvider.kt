package com.bppoddarfsm.features.stockAddCurrentStock.api

import com.bppoddarfsm.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.bppoddarfsm.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}