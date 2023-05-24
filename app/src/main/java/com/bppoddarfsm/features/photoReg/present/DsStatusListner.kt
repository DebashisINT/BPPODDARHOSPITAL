package com.bppoddarfsm.features.photoReg.present

import com.bppoddarfsm.app.domain.ProspectEntity
import com.bppoddarfsm.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}