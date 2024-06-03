package com.breezebppoddar.features.leaderboard.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import com.fasterxml.jackson.databind.ObjectMapper
import com.breezebppoddar.app.FileUtils
import com.breezebppoddar.app.Pref
import com.breezebppoddar.base.BaseResponse
import com.breezebppoddar.features.addshop.model.AddLogReqData
import com.breezebppoddar.features.addshop.model.AddShopRequestData
import com.breezebppoddar.features.addshop.model.AddShopResponse
import com.breezebppoddar.features.addshop.model.LogFileResponse
import com.breezebppoddar.features.addshop.model.UpdateAddrReq
import com.breezebppoddar.features.contacts.CallHisDtls
import com.breezebppoddar.features.contacts.CompanyReqData
import com.breezebppoddar.features.contacts.ContactMasterRes
import com.breezebppoddar.features.contacts.SourceMasterRes
import com.breezebppoddar.features.contacts.StageMasterRes
import com.breezebppoddar.features.contacts.StatusMasterRes
import com.breezebppoddar.features.contacts.TypeMasterRes
import com.breezebppoddar.features.dashboard.presentation.DashboardActivity
import com.breezebppoddar.features.login.model.WhatsappApiData
import com.breezebppoddar.features.login.model.WhatsappApiFetchData
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

/**
 * Created by Puja on 10-10-2024.
 */
class LeaderboardRepo(val apiService: LeaderboardApi) {

    fun branchlist(session_token: String): Observable<LeaderboardBranchData> {
        return apiService.branchList(session_token)
    }
    fun ownDatalist(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOwnData> {
        return apiService.ownDatalist(user_id,activitybased,branchwise,flag)
    }
    fun overAllAPI(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOverAllData> {
        return apiService.overAllDatalist(user_id,activitybased,branchwise,flag)
    }
}