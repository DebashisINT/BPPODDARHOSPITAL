package com.breezebppoddar.features.dashboard.presentation.api.dayStartEnd

import com.breezebppoddar.features.stockCompetetorStock.api.AddCompStockApi
import com.breezebppoddar.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}