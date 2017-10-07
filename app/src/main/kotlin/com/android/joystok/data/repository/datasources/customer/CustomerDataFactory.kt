package com.android.joystok.data.repository.datasources.customer

import com.android.joystok.data.net.RestAPI
import javax.inject.Inject

/**
 * Created by Fauzi Arnami on 10/7/17.
 */

class CustomerDataFactory
@Inject
constructor(private val restAPI: RestAPI) {
    fun createCloudDataStore(): CustomerDataStore {
        return CustomerCloudDataStore(restAPI)
    }
}