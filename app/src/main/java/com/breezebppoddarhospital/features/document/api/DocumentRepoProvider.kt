package com.breezebppoddarhospital.features.document.api

import com.breezebppoddarhospital.features.dymanicSection.api.DynamicApi
import com.breezebppoddarhospital.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}