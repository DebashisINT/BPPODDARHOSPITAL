package com.bppoddarfsm.features.dashboard.presentation.api.dayStartEnd

import com.bppoddarfsm.features.stockCompetetorStock.api.AddCompStockApi
import com.bppoddarfsm.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}