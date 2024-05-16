package com.breezebppoddarhospital.features.lead.api

import com.breezebppoddarhospital.features.NewQuotation.api.GetQuotListRegRepository
import com.breezebppoddarhospital.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}