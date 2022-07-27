package com.bppoddarfsm.features.stockAddCurrentStock.api

import com.bppoddarfsm.base.BaseResponse
import com.bppoddarfsm.features.location.model.ShopRevisitStatusRequest
import com.bppoddarfsm.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.bppoddarfsm.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.bppoddarfsm.features.stockAddCurrentStock.model.CurrentStockGetData
import com.bppoddarfsm.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}