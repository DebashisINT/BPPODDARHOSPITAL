package com.breezebppoddar.features.viewAllOrder.model

import com.breezebppoddar.app.domain.NewOrderColorEntity
import com.breezebppoddar.app.domain.NewOrderGenderEntity
import com.breezebppoddar.app.domain.NewOrderProductEntity
import com.breezebppoddar.app.domain.NewOrderSizeEntity
import com.breezebppoddar.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

