package com.android.joystok.data.repository.datasources.item_category

import com.android.joystok.data.entity.ItemCategoryAPIEntity
import com.android.joystok.domain.model.ItemCategoryAPIModel
import com.google.gson.JsonObject
import org.json.JSONObject
import rx.Observable

/**
 * Created by Fauzi Arnami on 9/27/17.
 */

interface ItemCategoryDataStore {
    fun itemCategoryList(auth: String, filter: JSONObject): Observable<List<ItemCategoryAPIModel>>
    fun addCategory(auth: String, categoryName: String, remarks: String): Observable<ItemCategoryAPIEntity>
    fun updateCategory(auth: String, where: JSONObject, data: JsonObject): Observable<ItemCategoryAPIEntity>
    fun deleteCategory(auth: String, id: Int): Observable<ItemCategoryAPIEntity>
    fun findCategoryName(auth: String, categoryName: JSONObject): Observable<List<ItemCategoryAPIModel>>
}