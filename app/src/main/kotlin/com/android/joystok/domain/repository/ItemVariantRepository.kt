package com.android.joystok.domain.repository

import com.android.joystok.domain.model.ItemVariantAPIModel
import rx.Observable

/**
 * Created by Fauzi Arnami on 10/14/17.
 */

interface ItemVariantRepository {
    fun addItemVariant(auth: String, itemId: Int, variantName: String): Observable<ItemVariantAPIModel>
}