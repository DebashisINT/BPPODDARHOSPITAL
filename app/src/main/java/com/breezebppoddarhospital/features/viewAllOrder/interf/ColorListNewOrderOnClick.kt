package com.breezebppoddarhospital.features.viewAllOrder.interf

import com.breezebppoddarhospital.app.domain.NewOrderColorEntity
import com.breezebppoddarhospital.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}