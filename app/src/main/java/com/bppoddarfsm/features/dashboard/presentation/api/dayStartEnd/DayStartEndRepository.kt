package com.bppoddarfsm.features.dashboard.presentation.api.dayStartEnd

import com.bppoddarfsm.app.Pref
import com.bppoddarfsm.base.BaseResponse
import com.bppoddarfsm.features.dashboard.presentation.model.DaystartDayendRequest
import com.bppoddarfsm.features.dashboard.presentation.model.StatusDayStartEnd
import com.bppoddarfsm.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.bppoddarfsm.features.stockCompetetorStock.api.AddCompStockApi
import io.reactivex.Observable

class DayStartEndRepository (val apiService: DayStartEndApi){
    fun dayStart(daystartDayendRequest: DaystartDayendRequest): Observable<BaseResponse> {
        return apiService.submitDayStartEnd(daystartDayendRequest)
    }

    fun dayStartEndStatus(date:String): Observable<StatusDayStartEnd> {
        return apiService.statusDayStartEnd(Pref.session_token!!, Pref.user_id!!,date)
    }


}