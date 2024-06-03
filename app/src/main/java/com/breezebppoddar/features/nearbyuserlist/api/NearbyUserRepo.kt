package com.breezebppoddar.features.nearbyuserlist.api

import com.breezebppoddar.app.Pref
import com.breezebppoddar.features.nearbyuserlist.model.NearbyUserResponseModel
import com.breezebppoddar.features.newcollection.model.NewCollectionListResponseModel
import com.breezebppoddar.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}