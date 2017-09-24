package com.android.joystok.domain.repository

import com.android.joystok.domain.model.CompanyAPIModel
import rx.Observable

/**
 * Created by Fauzi Arnami on 9/24/17.
 */

interface CompanyRepository {
    fun company(id: Int): Observable<CompanyAPIModel>
}