package com.breezebppoddar.features.lead.api

import com.breezebppoddar.features.NewQuotation.api.GetQuotListRegRepository
import com.breezebppoddar.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}