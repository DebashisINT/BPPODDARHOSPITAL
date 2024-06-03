package com.breezebppoddar.features.newcollectionreport

import com.breezebppoddar.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}