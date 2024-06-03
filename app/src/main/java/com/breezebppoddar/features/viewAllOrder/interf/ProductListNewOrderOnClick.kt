package com.breezebppoddar.features.viewAllOrder.interf

import com.breezebppoddar.app.domain.NewOrderGenderEntity
import com.breezebppoddar.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}