package com.breezebppoddarhospital.features.viewAllOrder.orderOptimized

import com.breezebppoddarhospital.app.domain.ProductOnlineRateTempEntity
import com.breezebppoddarhospital.base.BaseResponse
import com.breezebppoddarhospital.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}