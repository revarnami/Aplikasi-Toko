package com.android.joystok.domain.repository

import com.android.joystok.domain.model.ItemCategoryAPIModel
import com.google.gson.JsonObject
import org.json.JSONObject
import rx.Observable

/**
 * Created by Fauzi Arnami on 9/27/17.
 */

interface ItemCategoryRepository {
    fun itemCategoryList(auth: String, filter: JSONObject): Observable<List<ItemCategoryAPIModel>>
    fun addCategory(auth: String, categoryName: String, remarks: String): Observable<ItemCategoryAPIModel>
    fun updateCategory(auth: String, where: JSONObject, data: JsonObject): Observable<ItemCategoryAPIModel>
    fun deleteCategory(auth: String, id: Int): Observable<ItemCategoryAPIModel>
    fun findCategoryName(auth: String, categoryName: JSONObject): Observable<List<ItemCategoryAPIModel>>
}