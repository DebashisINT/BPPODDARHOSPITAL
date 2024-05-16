package com.breezebppoddarhospital.features.newcollection.model

import com.breezebppoddarhospital.app.domain.CollectionDetailsEntity
import com.breezebppoddarhospital.base.BaseResponse
import com.breezebppoddarhospital.features.shopdetail.presentation.model.collectionlist.CollectionListDataModel

/**
 * Created by Saikat on 15-02-2019.
 */
class NewCollectionListResponseModel : BaseResponse() {
    //var collection_list: ArrayList<CollectionListDataModel>? = null
    var collection_list: ArrayList<CollectionDetailsEntity>? = null
}