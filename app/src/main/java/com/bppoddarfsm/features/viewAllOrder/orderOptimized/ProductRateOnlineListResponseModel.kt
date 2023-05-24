package com.bppoddarfsm.features.viewAllOrder.orderOptimized

import com.bppoddarfsm.app.domain.ProductOnlineRateTempEntity
import com.bppoddarfsm.base.BaseResponse
import com.bppoddarfsm.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}