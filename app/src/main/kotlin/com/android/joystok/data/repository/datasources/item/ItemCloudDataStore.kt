package com.android.joystok.data.repository.datasources.item

import com.android.joystok.data.entity.ItemAPIEntity
import com.android.joystok.data.entity.ItemCategoryAPIEntity
import com.android.joystok.data.entity.VariantStockAPIEntity
import com.android.joystok.data.net.RestAPI
import com.android.joystok.domain.model.ItemAPIModel
import com.android.joystok.domain.model.ItemVariantAPIModel
import com.google.gson.JsonObject
import org.json.JSONObject
import rx.Observable

/**
 * Created by Fauzi Arnami on 10/8/17.
 */

class ItemCloudDataStore(private val restAPI: RestAPI) : ItemDataStore {
    override fun itemList(auth: String, filter: JSONObject): Observable<List<ItemAPIModel>> {
        return restAPI.getItemList(auth, filter)
    }

    override fun addItem(auth: String, data: JsonObject): Observable<ItemAPIEntity> {
        return restAPI.postItem(auth, data)
    }

    override fun itemCategoryByItemId(auth: String, id: String): Observable<ItemCategoryAPIEntity> {
        return restAPI.getCategoryByItemId(auth, id)
    }

    override fun variantByItemId(auth: String, id: String): Observable<List<ItemVariantAPIModel>> {
        return restAPI.getVariantByItemId(auth, id)
    }

    override fun stockByVariantId(auth: String, id: String): Observable<VariantStockAPIEntity> {
        return restAPI.getStockByVariantId(auth, id)
    }
}