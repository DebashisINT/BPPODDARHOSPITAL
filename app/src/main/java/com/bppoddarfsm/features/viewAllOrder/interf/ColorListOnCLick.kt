package com.bppoddarfsm.features.viewAllOrder.interf

import com.bppoddarfsm.app.domain.NewOrderGenderEntity
import com.bppoddarfsm.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}