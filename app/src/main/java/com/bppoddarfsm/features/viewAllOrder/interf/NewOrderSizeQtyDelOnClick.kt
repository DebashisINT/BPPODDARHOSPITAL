package com.bppoddarfsm.features.viewAllOrder.interf

import com.bppoddarfsm.app.domain.NewOrderGenderEntity
import com.bppoddarfsm.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}