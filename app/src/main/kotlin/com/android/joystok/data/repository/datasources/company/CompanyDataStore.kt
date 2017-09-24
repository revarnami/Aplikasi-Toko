package com.android.joystok.data.repository.datasources.company

import com.android.joystok.data.entity.CompanyAPIEntity
import rx.Observable

/**
 * Created by Fauzi Arnami on 9/24/17.
 */

interface CompanyDataStore {
    fun company(id: Int): Observable<CompanyAPIEntity>
}