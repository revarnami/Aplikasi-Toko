package com.android.joystok.data.repository.datasources.item_category

import com.android.joystok.data.entity.ItemCategoryAPIEntity
import com.android.joystok.data.net.RestAPI
import com.android.joystok.domain.model.ItemCategoryAPIModel
import com.google.gson.JsonObject
import org.json.JSONObject
import rx.Observable

/**
 * Created by Fauzi Arnami on 9/27/17.
 */

class ItemCategoryCloudDataStore(private val restAPI: RestAPI) : ItemCategoryDataStore {
    override fun itemCategoryList(auth: String, filter: JSONObject): Observable<List<ItemCategoryAPIModel>> {
        return restAPI.getItemCategoryList(auth, filter)
    }

    override fun addCategory(auth:String, categoryName: String, remarks: String): Observable<ItemCategoryAPIEntity> {
        return restAPI.postCategory(auth, categoryName, remarks)
    }

    override fun updateCategory(auth: String, where: JSONObject, data: JsonObject): Observable<ItemCategoryAPIEntity> {
        return restAPI.postUpdateCategory(auth, where, data)
    }

    override fun deleteCategory(auth: String, id: Int): Observable<ItemCategoryAPIEntity> {
        return restAPI.deleteCategory(auth, id)
    }

    override fun findCategoryName(auth: String, categoryName: JSONObject): Observable<List<ItemCategoryAPIModel>> {
        return restAPI.findCategoryName(auth, categoryName)
    }
}