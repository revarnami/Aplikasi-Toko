package com.android.joystok.data.repository.datasources.item

import com.android.joystok.data.entity.ItemAPIEntity
import com.android.joystok.data.entity.ItemCategoryAPIEntity
import com.android.joystok.data.entity.VariantStockAPIEntity
import com.android.joystok.domain.model.ItemAPIModel
import com.android.joystok.domain.model.ItemVariantAPIModel
import com.google.gson.JsonObject
import org.json.JSONObject
import rx.Observable

/**
 * Created by Fauzi Arnami on 10/8/17.
 */

interface ItemDataStore {
    fun itemList(auth: String, filter: JSONObject): Observable<List<ItemAPIModel>>
    fun addItem(auth: String, data: JsonObject): Observable<ItemAPIEntity>
    fun itemCategoryByItemId(auth: String, id: String): Observable<ItemCategoryAPIEntity>
    fun variantByItemId(auth: String, id: String): Observable<List<ItemVariantAPIModel>>
    fun stockByVariantId(auth: String, id: String): Observable<VariantStockAPIEntity>
}