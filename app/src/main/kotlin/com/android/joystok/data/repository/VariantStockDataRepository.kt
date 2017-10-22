package com.android.joystok.data.repository

import com.android.joystok.data.entity.mapper.VariantStockMapper
import com.android.joystok.data.repository.datasources.variant_stock.VariantStockDataFactory
import com.android.joystok.domain.model.VariantStockAPIModel
import com.android.joystok.domain.repository.VariantStockRepository
import rx.Observable
import javax.inject.Inject

/**
 * Created by Fauzi Arnami on 10/14/17.
 */

class VariantStockDataRepository
@Inject
constructor(private val mapper: VariantStockMapper,
            private val dataFactory: VariantStockDataFactory
) : VariantStockRepository {
    override fun addVariantStock(authorization: String, itemVariantId: Int, quantity: Int, branchId: Int): Observable<VariantStockAPIModel> {
        return dataFactory.createCloudDataStore()
                .addVariantStock(authorization, itemVariantId, quantity, branchId)
                .map ({mapper.transform(it)})
    }
}