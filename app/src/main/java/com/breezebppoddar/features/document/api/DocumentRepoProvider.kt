package com.breezebppoddar.features.document.api

import com.breezebppoddar.features.dymanicSection.api.DynamicApi
import com.breezebppoddar.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}