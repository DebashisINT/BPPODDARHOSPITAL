package com.breezebppoddar.features.stockCompetetorStock.api

import com.breezebppoddar.base.BaseResponse
import com.breezebppoddar.features.orderList.model.NewOrderListResponseModel
import com.breezebppoddar.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.breezebppoddar.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class AddCompStockRepository(val apiService:AddCompStockApi){

    fun addCompStock(shopAddCompetetorStockRequest: ShopAddCompetetorStockRequest): Observable<BaseResponse> {
        return apiService.submShopCompStock(shopAddCompetetorStockRequest)
    }

    fun getCompStockList(sessiontoken: String, user_id: String, date: String): Observable<CompetetorStockGetData> {
        return apiService.getCompStockList(sessiontoken, user_id, date)
    }
}