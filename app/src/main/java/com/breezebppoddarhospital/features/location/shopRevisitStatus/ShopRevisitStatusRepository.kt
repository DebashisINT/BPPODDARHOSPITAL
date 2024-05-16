package com.breezebppoddarhospital.features.location.shopRevisitStatus

import com.breezebppoddarhospital.base.BaseResponse
import com.breezebppoddarhospital.features.location.model.ShopDurationRequest
import com.breezebppoddarhospital.features.location.model.ShopRevisitStatusRequest
import io.reactivex.Observable

class ShopRevisitStatusRepository(val apiService : ShopRevisitStatusApi) {
    fun shopRevisitStatus(shopRevisitStatus: ShopRevisitStatusRequest?): Observable<BaseResponse> {
        return apiService.submShopRevisitStatus(shopRevisitStatus)
    }
}