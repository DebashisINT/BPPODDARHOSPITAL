package com.bppoddarfsm.features.viewAllOrder.model

import com.bppoddarfsm.app.domain.NewOrderColorEntity
import com.bppoddarfsm.app.domain.NewOrderGenderEntity
import com.bppoddarfsm.app.domain.NewOrderProductEntity
import com.bppoddarfsm.app.domain.NewOrderSizeEntity
import com.bppoddarfsm.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

