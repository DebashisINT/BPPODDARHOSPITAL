package com.breezebppoddar.features.viewAllOrder.orderOptimized

import com.breezebppoddar.app.domain.ProductOnlineRateTempEntity
import com.breezebppoddar.base.BaseResponse
import com.breezebppoddar.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}