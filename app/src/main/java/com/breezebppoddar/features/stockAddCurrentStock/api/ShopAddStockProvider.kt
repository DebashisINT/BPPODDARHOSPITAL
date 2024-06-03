package com.breezebppoddar.features.stockAddCurrentStock.api

import com.breezebppoddar.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezebppoddar.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}