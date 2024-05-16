package com.breezebppoddarhospital.features.viewAllOrder.model

import com.breezebppoddarhospital.app.domain.NewOrderColorEntity
import com.breezebppoddarhospital.app.domain.NewOrderGenderEntity
import com.breezebppoddarhospital.app.domain.NewOrderProductEntity
import com.breezebppoddarhospital.app.domain.NewOrderSizeEntity
import com.breezebppoddarhospital.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

