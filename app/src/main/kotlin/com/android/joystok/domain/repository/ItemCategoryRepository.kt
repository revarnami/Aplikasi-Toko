package com.android.joystok.domain.repository

import com.android.joystok.domain.model.ItemCategoryAPIModel
import rx.Observable

/**
 * Created by Fauzi Arnami on 9/27/17.
 */

interface ItemCategoryRepository {
    fun itemCategoryList(auth: String): Observable<List<ItemCategoryAPIModel>>
    fun addCategory(categoryName: String, remarks: String): Observable<ItemCategoryAPIModel>
    fun updateCategory(id: Int, categoryName: String, remarks: String): Observable<ItemCategoryAPIModel>
    fun deleteCategory(id: Int): Observable<ItemCategoryAPIModel>
}