package com.breezebppoddar.features.login.model.opportunitymodel

import com.breezebppoddar.app.domain.OpportunityStatusEntity
import com.breezebppoddar.app.domain.ProductListEntity
import com.breezebppoddar.base.BaseResponse

/**
 * Created by Puja on 30.05.2024
 */
class OpportunityStatusListResponseModel : BaseResponse() {
    var status_list: ArrayList<OpportunityStatusEntity>? = null
}