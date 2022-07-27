package com.bppoddarfsm.features.nearbyuserlist.api

import com.bppoddarfsm.app.Pref
import com.bppoddarfsm.features.nearbyuserlist.model.NearbyUserResponseModel
import com.bppoddarfsm.features.newcollection.model.NewCollectionListResponseModel
import com.bppoddarfsm.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}