package com.bppoddarfsm.features.survey.api

import com.bppoddarfsm.features.photoReg.api.GetUserListPhotoRegApi
import com.bppoddarfsm.features.photoReg.api.GetUserListPhotoRegRepository

object SurveyDataProvider{

    fun provideSurveyQ(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.create())
    }

    fun provideSurveyQMultiP(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.createImage())
    }
}