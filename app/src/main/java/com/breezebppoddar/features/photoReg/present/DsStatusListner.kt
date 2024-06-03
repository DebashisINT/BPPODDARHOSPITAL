package com.breezebppoddar.features.photoReg.present

import com.breezebppoddar.app.domain.ProspectEntity
import com.breezebppoddar.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}