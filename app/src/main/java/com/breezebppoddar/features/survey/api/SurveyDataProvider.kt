package com.breezebppoddar.features.survey.api

import com.breezebppoddar.features.photoReg.api.GetUserListPhotoRegApi
import com.breezebppoddar.features.photoReg.api.GetUserListPhotoRegRepository

object SurveyDataProvider{

    fun provideSurveyQ(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.create())
    }

    fun provideSurveyQMultiP(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.createImage())
    }
}