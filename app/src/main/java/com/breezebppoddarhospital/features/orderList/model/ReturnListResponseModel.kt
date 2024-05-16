package com.breezebppoddarhospital.features.orderList.model

import com.breezebppoddarhospital.base.BaseResponse


class ReturnListResponseModel: BaseResponse() {
    var return_list: ArrayList<ReturnDataModel>? = null
}