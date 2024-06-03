package com.breezebppoddar.features.viewAllOrder.interf

import com.breezebppoddar.app.domain.NewOrderGenderEntity
import com.breezebppoddar.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}