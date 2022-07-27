package com.bppoddarfsm.features.newcollectionreport

import com.bppoddarfsm.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}