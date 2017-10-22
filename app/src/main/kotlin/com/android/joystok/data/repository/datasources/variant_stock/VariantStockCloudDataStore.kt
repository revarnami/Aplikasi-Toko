package com.android.joystok.data.repository.datasources.variant_stock

import com.android.joystok.data.entity.VariantStockAPIEntity
import com.android.joystok.data.net.RestAPI
import rx.Observable

/**
 * Created by Fauzi Arnami on 10/14/17.
 */

class VariantStockCloudDataStore(private val restAPI: RestAPI) : VariantStockDataStore {
    override fun addVariantStock(authorization: String, itemVariantId: Int, quantity: Int, branchId: Int): Observable<VariantStockAPIEntity> {
        return restAPI.postVariantStock(authorization, itemVariantId, quantity, branchId)
    }
}