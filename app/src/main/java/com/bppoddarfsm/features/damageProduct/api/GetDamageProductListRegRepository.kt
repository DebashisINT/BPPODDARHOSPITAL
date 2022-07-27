package com.bppoddarfsm.features.damageProduct.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import android.util.Log
import com.bppoddarfsm.app.FileUtils
import com.bppoddarfsm.base.BaseResponse
import com.bppoddarfsm.features.NewQuotation.model.*
import com.bppoddarfsm.features.addshop.model.AddShopRequestData
import com.bppoddarfsm.features.addshop.model.AddShopResponse
import com.bppoddarfsm.features.damageProduct.model.DamageProductResponseModel
import com.bppoddarfsm.features.damageProduct.model.delBreakageReq
import com.bppoddarfsm.features.damageProduct.model.viewAllBreakageReq
import com.bppoddarfsm.features.login.model.userconfig.UserConfigResponseModel
import com.bppoddarfsm.features.myjobs.model.WIPImageSubmit
import com.bppoddarfsm.features.photoReg.model.*
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