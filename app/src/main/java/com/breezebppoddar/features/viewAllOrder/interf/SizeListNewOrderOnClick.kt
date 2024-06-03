package com.breezebppoddar.features.viewAllOrder.interf

import com.breezebppoddar.app.domain.NewOrderProductEntity
import com.breezebppoddar.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}