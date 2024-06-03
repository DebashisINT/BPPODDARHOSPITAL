package com.breezebppoddar.features.viewAllOrder.interf

import com.breezebppoddar.app.domain.NewOrderColorEntity
import com.breezebppoddar.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}