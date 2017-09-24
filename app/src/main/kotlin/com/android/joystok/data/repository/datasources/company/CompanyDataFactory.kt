package com.android.joystok.data.repository.datasources.company

import com.android.joystok.data.net.RestAPI
import javax.inject.Inject

/**
 * Created by Fauzi Arnami on 9/24/17.
 */

class CompanyDataFactory
@Inject
constructor(private val restAPI: RestAPI) {
    fun createCloudDataStore(): CompanyDataStore {
        return CompanyCloudDataStore(restAPI)
    }
}