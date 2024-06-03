package com.breezebppoddar.features.login.model.productlistmodel

import com.breezebppoddar.app.domain.ModelEntity
import com.breezebppoddar.app.domain.ProductListEntity
import com.breezebppoddar.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}