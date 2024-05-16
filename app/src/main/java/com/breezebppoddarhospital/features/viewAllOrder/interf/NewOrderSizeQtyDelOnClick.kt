package com.breezebppoddarhospital.features.viewAllOrder.interf

import com.breezebppoddarhospital.app.domain.NewOrderGenderEntity
import com.breezebppoddarhospital.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}