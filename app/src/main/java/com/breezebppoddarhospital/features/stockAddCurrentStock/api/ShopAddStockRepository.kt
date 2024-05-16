package com.breezebppoddarhospital.features.stockAddCurrentStock.api

import com.breezebppoddarhospital.base.BaseResponse
import com.breezebppoddarhospital.features.location.model.ShopRevisitStatusRequest
import com.breezebppoddarhospital.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezebppoddarhospital.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.breezebppoddarhospital.features.stockAddCurrentStock.model.CurrentStockGetData
import com.breezebppoddarhospital.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}