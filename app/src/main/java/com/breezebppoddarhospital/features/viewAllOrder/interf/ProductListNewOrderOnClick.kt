package com.breezebppoddarhospital.features.viewAllOrder.interf

import com.breezebppoddarhospital.app.domain.NewOrderGenderEntity
import com.breezebppoddarhospital.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}