package com.android.joystok.data.repository.datasources.variant_stock

import com.android.joystok.data.entity.VariantStockAPIEntity
import rx.Observable

/**
 * Created by Fauzi Arnami on 10/14/17.
 */

interface VariantStockDataStore {
    fun addVariantStock(authorization: String,
                        itemVariantId: Int,
                        quantity: Int,
                        branchId: Int
    ): Observable<VariantStockAPIEntity>
}