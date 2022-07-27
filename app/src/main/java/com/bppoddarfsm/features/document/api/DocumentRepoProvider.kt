package com.bppoddarfsm.features.document.api

import com.bppoddarfsm.features.dymanicSection.api.DynamicApi
import com.bppoddarfsm.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}