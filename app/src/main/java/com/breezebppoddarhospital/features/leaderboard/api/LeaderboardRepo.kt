package com.breezebppoddarhospital.features.leaderboard.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import com.fasterxml.jackson.databind.ObjectMapper
import com.breezebppoddarhospital.app.FileUtils
import com.breezebppoddarhospital.app.Pref
import com.breezebppoddarhospital.base.BaseResponse
import com.breezebppoddarhospital.features.addshop.model.AddLogReqData
import com.breezebppoddarhospital.features.addshop.model.AddShopRequestData
import com.breezebppoddarhospital.features.addshop.model.AddShopResponse
import com.breezebppoddarhospital.features.addshop.model.LogFileResponse
import com.breezebppoddarhospital.features.addshop.model.UpdateAddrReq
import com.breezebppoddarhospital.features.contacts.CallHisDtls
import com.breezebppoddarhospital.features.contacts.CompanyReqData
import com.breezebppoddarhospital.features.contacts.ContactMasterRes
import com.breezebppoddarhospital.features.contacts.SourceMasterRes
import com.breezebppoddarhospital.features.contacts.StageMasterRes
import com.breezebppoddarhospital.features.contacts.StatusMasterRes
import com.breezebppoddarhospital.features.contacts.TypeMasterRes
import com.breezebppoddarhospital.features.dashboard.presentation.DashboardActivity
import com.breezebppoddarhospital.features.login.model.WhatsappApiData
import com.breezebppoddarhospital.features.login.model.WhatsappApiFetchData
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