package com.android.joystok.data.repository.datasources.company

import com.android.joystok.data.cache.DBHelper
import com.android.joystok.data.entity.CompanyAPIEntity
import com.android.joystok.data.net.RestAPI
import rx.Observable

/**
 * Created by Fauzi Arnami on 9/24/17.
 */

class CompanyCloudDataStore (private val restAPI: RestAPI) : CompanyDataStore
{
    private val TAG = "LoginCloudDataStore"

    override fun company(id: Int): Observable<CompanyAPIEntity> {
        return restAPI.getCompany(id)
                .doOnNext {
                    DBHelper().saveCompany(it)
                }
    }
}