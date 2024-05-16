package com.breezebppoddarhospital.features.viewAllOrder.interf

import com.breezebppoddarhospital.app.domain.NewOrderProductEntity
import com.breezebppoddarhospital.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}