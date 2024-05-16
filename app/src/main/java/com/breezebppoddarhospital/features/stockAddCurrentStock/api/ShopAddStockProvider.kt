package com.breezebppoddarhospital.features.stockAddCurrentStock.api

import com.breezebppoddarhospital.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezebppoddarhospital.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}