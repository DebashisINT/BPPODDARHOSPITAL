package com.breezebppoddarhospital.features.nearbyuserlist.api

import com.breezebppoddarhospital.app.Pref
import com.breezebppoddarhospital.features.nearbyuserlist.model.NearbyUserResponseModel
import com.breezebppoddarhospital.features.newcollection.model.NewCollectionListResponseModel
import com.breezebppoddarhospital.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}