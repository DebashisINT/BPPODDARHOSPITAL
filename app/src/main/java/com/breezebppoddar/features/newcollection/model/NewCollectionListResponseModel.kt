package com.breezebppoddar.features.newcollection.model

import com.breezebppoddar.app.domain.CollectionDetailsEntity
import com.breezebppoddar.base.BaseResponse
import com.breezebppoddar.features.shopdetail.presentation.model.collectionlist.CollectionListDataModel

/**
 * Created by Saikat on 15-02-2019.
 */
class NewCollectionListResponseModel : BaseResponse() {
    //var collection_list: ArrayList<CollectionListDataModel>? = null
    var collection_list: ArrayList<CollectionDetailsEntity>? = null
}