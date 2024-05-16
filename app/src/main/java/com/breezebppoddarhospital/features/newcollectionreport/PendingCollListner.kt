package com.breezebppoddarhospital.features.newcollectionreport

import com.breezebppoddarhospital.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}