package com.bppoddarfsm.features.nearbyuserlist.model

import com.bppoddarfsm.base.BaseResponse
import java.io.Serializable

data class NearbyUserResponseModel(var user_list: ArrayList<NearbyUserDataModel>?= null): BaseResponse(), Serializable

data class NearbyUserDataModel(var id: String = "",
                               var name: String = "",
                               var phone_no: String = "",
                               var latitude: String = "",
                               var longitude: String = ""): Serializable