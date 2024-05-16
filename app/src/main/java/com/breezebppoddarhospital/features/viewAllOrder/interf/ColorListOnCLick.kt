package com.breezebppoddarhospital.features.viewAllOrder.interf

import com.breezebppoddarhospital.app.domain.NewOrderGenderEntity
import com.breezebppoddarhospital.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}