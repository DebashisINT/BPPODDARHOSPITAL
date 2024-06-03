package com.breezebppoddar.features.stockCompetetorStock.api

object AddCompStockProvider {
    fun provideCompStockRepositiry(): AddCompStockRepository{
        return AddCompStockRepository(AddCompStockApi.create())
    }

}