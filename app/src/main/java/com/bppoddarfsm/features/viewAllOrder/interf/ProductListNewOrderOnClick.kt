package com.bppoddarfsm.features.viewAllOrder.interf

import com.bppoddarfsm.app.domain.NewOrderGenderEntity
import com.bppoddarfsm.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}