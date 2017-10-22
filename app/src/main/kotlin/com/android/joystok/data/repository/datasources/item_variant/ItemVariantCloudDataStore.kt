package com.android.joystok.data.repository.datasources.item_variant

import com.android.joystok.data.entity.ItemVariantAPIEntity
import com.android.joystok.data.net.RestAPI
import rx.Observable

/**
 * Created by Fauzi Arnami on 10/14/17.
 */

class ItemVariantCloudDataStore (private val restAPI: RestAPI) : ItemVariantDataStore {
    override fun addItemVariant(auth: String, itemId: Int, variantName: String): Observable<ItemVariantAPIEntity> {
        return restAPI.postItemVariant(auth, itemId, variantName)
    }
}