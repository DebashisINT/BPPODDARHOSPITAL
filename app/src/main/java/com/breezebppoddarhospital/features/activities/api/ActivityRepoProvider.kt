package com.breezebppoddarhospital.features.activities.api

import com.breezebppoddarhospital.features.member.api.TeamApi
import com.breezebppoddarhospital.features.member.api.TeamRepo

object ActivityRepoProvider {
    fun activityRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.create())
    }

    fun activityImageRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.createImage())
    }
}