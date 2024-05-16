package com.breezebppoddarhospital.features.login.model.productlistmodel

import com.breezebppoddarhospital.base.BaseResponse
import java.io.Serializable

/**
 * Created by Saikat on 15-01-2020.
 */
class ProductRateListResponseModel : BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductRateDataModel>? = null
}