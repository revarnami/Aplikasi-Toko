package com.android.joystok.domain.repository

import com.android.joystok.domain.model.ItemAPIModel
import com.android.joystok.domain.model.ItemCategoryAPIModel
import com.android.joystok.domain.model.ItemVariantAPIModel
import com.android.joystok.domain.model.VariantStockAPIModel
import com.google.gson.JsonObject
import org.json.JSONObject
import rx.Observable

/**
 * Created by Fauzi Arnami on 10/8/17.
 */

interface ItemRepository {
    fun itemList(auth: String, filter: JSONObject): Observable<List<ItemAPIModel>>
    fun addItem(auth: String, data: JsonObject): Observable<ItemAPIModel>
    fun itemCategoryByItemId(auth: String, id: String): Observable<ItemCategoryAPIModel>
    fun variantByItemId(auth: String, id: String): Observable<List<ItemVariantAPIModel>>
    fun stockByVariantId(auth: String, id: String): Observable<VariantStockAPIModel>
}