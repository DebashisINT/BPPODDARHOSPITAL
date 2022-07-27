package com.bppoddarfsm.features.lead.api

import com.bppoddarfsm.features.NewQuotation.api.GetQuotListRegRepository
import com.bppoddarfsm.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}