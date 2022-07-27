package com.bppoddarfsm.features.viewAllOrder.interf

import com.bppoddarfsm.app.domain.NewOrderProductEntity
import com.bppoddarfsm.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}