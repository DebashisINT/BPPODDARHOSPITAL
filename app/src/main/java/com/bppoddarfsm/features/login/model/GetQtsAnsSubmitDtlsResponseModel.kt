package com.bppoddarfsm.features.login.model

import com.bppoddarfsm.app.domain.QuestionSubmitEntity


class GetQtsAnsSubmitDtlsResponseModel {
    var status:String? = null
    var message:String? = null
    var Question_list: ArrayList<QuestionSubmitEntity>? = null
}