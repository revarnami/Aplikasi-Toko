package com.android.joystok.data.repository.datasources.item_category

import com.android.joystok.data.entity.ItemCategoryAPIEntity
import com.android.joystok.data.net.RestAPI
import com.android.joystok.domain.model.ItemCategoryAPIModel
import rx.Observable

/**
 * Created by Fauzi Arnami on 9/27/17.
 */

class ItemCategoryCloudDataStore(private val restAPI: RestAPI) : ItemCategoryDataStore {
    override fun itemCategoryList(auth: String): Observable<List<ItemCategoryAPIModel>> {
        return restAPI.getItemCategoryList(auth)
    }

    override fun addCategory(categoryName: String, remarks: String): Observable<ItemCategoryAPIEntity> {
        return restAPI.postCategory(categoryName, remarks)
    }

    override fun updateCategory(id: Int, categoryName: String, remarks: String): Observable<ItemCategoryAPIEntity> {
        return restAPI.postUpdateCategory(id, categoryName, remarks)
    }

    override fun deleteCategory(id: Int): Observable<ItemCategoryAPIEntity> {
        return restAPI.deleteCategory(id)
    }
}