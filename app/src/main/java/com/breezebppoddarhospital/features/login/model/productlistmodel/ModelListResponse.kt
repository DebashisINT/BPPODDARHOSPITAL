package com.breezebppoddarhospital.features.login.model.productlistmodel

import com.breezebppoddarhospital.app.domain.ModelEntity
import com.breezebppoddarhospital.app.domain.ProductListEntity
import com.breezebppoddarhospital.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}