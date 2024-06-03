package com.breezebppoddar.features.stockAddCurrentStock.api

import com.breezebppoddar.base.BaseResponse
import com.breezebppoddar.features.location.model.ShopRevisitStatusRequest
import com.breezebppoddar.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezebppoddar.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.breezebppoddar.features.stockAddCurrentStock.model.CurrentStockGetData
import com.breezebppoddar.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}