package com.breezebppoddarhospital.features.menuBeat

import com.breezebppoddarhospital.features.addshop.model.AddShopRequestData
import com.breezebppoddarhospital.features.addshop.model.AddShopResponse
import io.reactivex.Observable

/**
 * Created by Pratishruti on 22-11-2017.
 */
object MenuBeatRepositoryProvider {
    fun provideAddShopRepository(): MenuBeatRepository {
        return MenuBeatRepository(MenuBeatApi.create())
    }
    fun provideAddShopWithoutImageRepository(): MenuBeatRepository {
        return MenuBeatRepository(MenuBeatApi.createWithoutMultipart())
    }

}