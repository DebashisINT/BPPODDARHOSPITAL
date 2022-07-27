package com.bppoddarfsm.features.orderList.model

import com.bppoddarfsm.base.BaseResponse


class ReturnListResponseModel: BaseResponse() {
    var return_list: ArrayList<ReturnDataModel>? = null
}