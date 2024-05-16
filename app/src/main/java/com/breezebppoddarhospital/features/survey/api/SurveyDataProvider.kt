package com.breezebppoddarhospital.features.survey.api

import com.breezebppoddarhospital.features.photoReg.api.GetUserListPhotoRegApi
import com.breezebppoddarhospital.features.photoReg.api.GetUserListPhotoRegRepository

object SurveyDataProvider{

    fun provideSurveyQ(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.create())
    }

    fun provideSurveyQMultiP(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.createImage())
    }
}