package com.bppoddarfsm.features.viewAllOrder.interf

import com.bppoddarfsm.app.domain.NewOrderColorEntity
import com.bppoddarfsm.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}