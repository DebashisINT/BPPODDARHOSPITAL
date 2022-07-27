package com.bppoddarfsm.features.newcollection.model

import com.bppoddarfsm.app.domain.CollectionDetailsEntity
import com.bppoddarfsm.base.BaseResponse
import com.bppoddarfsm.features.shopdetail.presentation.model.collectionlist.CollectionListDataModel

/**
 * Created by Saikat on 15-02-2019.
 */
class NewCollectionListResponseModel : BaseResponse() {
    //var collection_list: ArrayList<CollectionListDataModel>? = null
    var collection_list: ArrayList<CollectionDetailsEntity>? = null
}