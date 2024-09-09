package com.breezebppoddar.features.mylearning.apiCall

import com.breezebppoddar.features.login.api.opportunity.OpportunityListApi
import com.breezebppoddar.features.login.api.opportunity.OpportunityListRepo

object LMSRepoProvider {
    fun getTopicList(): LMSRepo {
        return LMSRepo(LMSApi.create())
    }
}