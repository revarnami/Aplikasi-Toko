package com.android.joystok.data.repository.datasources.item

import com.android.joystok.data.net.RestAPI
import javax.inject.Inject

/**
 * Created by Fauzi Arnami on 10/8/17.
 */

class ItemDataFactory
@Inject
constructor(private val restAPI: RestAPI) {
    fun createCloudDataStore(): ItemDataStore {
        return ItemCloudDataStore(restAPI)
    }
}