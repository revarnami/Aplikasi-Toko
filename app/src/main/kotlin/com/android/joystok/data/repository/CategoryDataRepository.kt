package com.android.joystok.data.repository

import com.android.joystok.data.entity.mapper.CategoryMapper
import com.android.joystok.data.entity.mapper.ItemCategoryListMapper
import com.android.joystok.data.repository.datasources.item_category.ItemCategoryDataFactory
import com.android.joystok.domain.model.ItemCategoryAPIModel
import com.android.joystok.domain.repository.ItemCategoryRepository
import rx.Observable
import javax.inject.Inject

/**
 * Created by Fauzi Arnami on 9/27/17.
 */

class CategoryDataRepository
@Inject constructor(private val listMapper: ItemCategoryListMapper,
                    private val mapper: CategoryMapper,
                    private val dataFactory: ItemCategoryDataFactory
) : ItemCategoryRepository {
    override fun itemCategoryList(auth:String): Observable<List<ItemCategoryAPIModel>> {
        return dataFactory.createCloudDataStore()
                .itemCategoryList(auth)
                .map({ listMapper.transform(it) })
    }

    override fun addCategory(categoryName: String, remarks: String): Observable<ItemCategoryAPIModel> {
        return dataFactory.createCloudDataStore()
                .addCategory(categoryName, remarks)
                .map({ mapper.transform(it) })
    }

    override fun updateCategory(id: Int, categoryName: String, remarks: String): Observable<ItemCategoryAPIModel> {
        return dataFactory.createCloudDataStore()
                .updateCategory(id, categoryName, remarks)
                .map({ mapper.transform(it) })
    }

    override fun deleteCategory(id: Int): Observable<ItemCategoryAPIModel> {
        return dataFactory.createCloudDataStore()
                .deleteCategory(id)
                .map({ mapper.transform(it) })
    }
}