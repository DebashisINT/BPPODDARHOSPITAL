package com.breezebppoddarhospital.features.stockCompetetorStock.api

import com.breezebppoddarhospital.base.BaseResponse
import com.breezebppoddarhospital.features.orderList.model.NewOrderListResponseModel
import com.breezebppoddarhospital.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.breezebppoddarhospital.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class AddCompStockRepository(val apiService:AddCompStockApi){

    fun addCompStock(shopAddCompetetorStockRequest: ShopAddCompetetorStockRequest): Observable<BaseResponse> {
        return apiService.submShopCompStock(shopAddCompetetorStockRequest)
    }

    fun getCompStockList(sessiontoken: String, user_id: String, date: String): Observable<CompetetorStockGetData> {
        return apiService.getCompStockList(sessiontoken, user_id, date)
    }
}