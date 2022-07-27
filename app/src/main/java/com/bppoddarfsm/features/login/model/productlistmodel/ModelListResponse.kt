package com.bppoddarfsm.features.login.model.productlistmodel

import com.bppoddarfsm.app.domain.ModelEntity
import com.bppoddarfsm.app.domain.ProductListEntity
import com.bppoddarfsm.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}