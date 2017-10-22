package com.android.joystok.data.repository.datasources.variant_stock

import com.android.joystok.data.net.RestAPI
import javax.inject.Inject

/**
 * Created by Fauzi Arnami on 10/14/17.
 */

class VariantStockDataFactory
@Inject
constructor(private val restAPI: RestAPI) {
    fun createCloudDataStore(): VariantStockDataStore {
        return VariantStockCloudDataStore(restAPI)
    }
}