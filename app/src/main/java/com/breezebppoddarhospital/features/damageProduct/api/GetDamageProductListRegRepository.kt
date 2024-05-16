package com.breezebppoddarhospital.features.damageProduct.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import android.util.Log
import com.breezebppoddarhospital.app.FileUtils
import com.breezebppoddarhospital.base.BaseResponse
import com.breezebppoddarhospital.features.NewQuotation.model.*
import com.breezebppoddarhospital.features.addshop.model.AddShopRequestData
import com.breezebppoddarhospital.features.addshop.model.AddShopResponse
import com.breezebppoddarhospital.features.damageProduct.model.DamageProductResponseModel
import com.breezebppoddarhospital.features.damageProduct.model.delBreakageReq
import com.breezebppoddarhospital.features.damageProduct.model.viewAllBreakageReq
import com.breezebppoddarhospital.features.login.model.userconfig.UserConfigResponseModel
import com.breezebppoddarhospital.features.myjobs.model.WIPImageSubmit
import com.breezebppoddarhospital.features.photoReg.model.*
import com.fasterxml.jackson.databind.ObjectMapper
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

class GetDamageProductListRegRepository(val apiService : GetDamageProductListApi) {

    fun viewBreakage(req: viewAllBreakageReq): Observable<DamageProductResponseModel> {
        return apiService.viewBreakage(req)
    }

    fun delBreakage(req: delBreakageReq): Observable<BaseResponse>{
        return apiService.BreakageDel(req.user_id!!,req.breakage_number!!,req.session_token!!)
    }

}