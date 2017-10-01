package com.android.joystok.data.repository.datasources.item_category

import com.android.joystok.data.entity.ItemCategoryAPIEntity
import com.android.joystok.domain.model.ItemCategoryAPIModel
import rx.Observable

/**
 * Created by Fauzi Arnami on 9/27/17.
 */

interface ItemCategoryDataStore {
    fun itemCategoryList(auth: String): Observable<List<ItemCategoryAPIModel>>
    fun addCategory(categoryName: String, remarks: String): Observable<ItemCategoryAPIEntity>
    fun updateCategory(id: Int, categoryName: String, remarks: String): Observable<ItemCategoryAPIEntity>
    fun deleteCategory(id: Int): Observable<ItemCategoryAPIEntity>
}