package com.bppoddarfsm.features.stockCompetetorStock.api

import com.bppoddarfsm.base.BaseResponse
import com.bppoddarfsm.features.orderList.model.NewOrderListResponseModel
import com.bppoddarfsm.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.bppoddarfsm.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class AddCompStockRepository(val apiService:AddCompStockApi){

    fun addCompStock(shopAddCompetetorStockRequest: ShopAddCompetetorStockRequest): Observable<BaseResponse> {
        return apiService.submShopCompStock(shopAddCompetetorStockRequest)
    }

    fun getCompStockList(sessiontoken: String, user_id: String, date: String): Observable<CompetetorStockGetData> {
        return apiService.getCompStockList(sessiontoken, user_id, date)
    }
}