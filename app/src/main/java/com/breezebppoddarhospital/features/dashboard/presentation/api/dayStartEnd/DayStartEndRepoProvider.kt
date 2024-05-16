package com.breezebppoddarhospital.features.dashboard.presentation.api.dayStartEnd

import com.breezebppoddarhospital.features.stockCompetetorStock.api.AddCompStockApi
import com.breezebppoddarhospital.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}