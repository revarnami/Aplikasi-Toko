package com.android.joystok.data.repository.datasources.item_variant

import com.android.joystok.data.net.RestAPI
import javax.inject.Inject

/**
 * Created by Fauzi Arnami on 10/14/17.
 */

class ItemVariantDataFactory
@Inject
constructor(private val restAPI: RestAPI) {
    fun createCloudDataStore(): ItemVariantDataStore {
        return ItemVariantCloudDataStore(restAPI)
    }
}