package com.breezebppoddarhospital.features.photoReg.present

import com.breezebppoddarhospital.app.domain.ProspectEntity
import com.breezebppoddarhospital.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}