package com.android.joystok.domain.repository

import com.android.joystok.domain.model.VariantStockAPIModel
import rx.Observable

/**
 * Created by Fauzi Arnami on 10/14/17.
 */

interface VariantStockRepository {
    fun addVariantStock(authorization: String,
                        itemVariantId: Int,
                        quantity: Int,
                        branchId: Int
    ): Observable<VariantStockAPIModel>
}