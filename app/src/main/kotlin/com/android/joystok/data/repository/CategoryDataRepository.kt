package com.android.joystok.data.repository

import com.android.joystok.data.entity.mapper.CategoryMapper
import com.android.joystok.data.entity.mapper.ItemCategoryListMapper
import com.android.joystok.data.repository.datasources.item_category.ItemCategoryDataFactory
import com.android.joystok.domain.model.ItemCategoryAPIModel
import com.android.joystok.domain.repository.ItemCategoryRepository
import com.google.gson.JsonObject
import org.json.JSONObject
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
    override fun itemCategoryList(auth:String, filter: JSONObject): Observable<List<ItemCategoryAPIModel>> {
        return dataFactory.createCloudDataStore()
                .itemCategoryList(auth, filter)
                .map({ listMapper.transform(it) })
    }

    override fun addCategory(auth: String, categoryName: String, remarks: String): Observable<ItemCategoryAPIModel> {
        return dataFactory.createCloudDataStore()
                .addCategory(auth, categoryName, remarks)
                .map({ mapper.transform(it) })
    }

    override fun updateCategory(auth:String, where: JSONObject, data: JsonObject): Observable<ItemCategoryAPIModel> {
        return dataFactory.createCloudDataStore()
                .updateCategory(auth, where, data)
                .map({ mapper.transform(it) })
    }

    override fun deleteCategory(auth: String, id: Int): Observable<ItemCategoryAPIModel> {
        return dataFactory.createCloudDataStore()
                .deleteCategory(auth, id)
                .map({ mapper.transform(it) })
    }

    override fun findCategoryName(auth: String, categoryName: JSONObject): Observable<List<ItemCategoryAPIModel>> {
        return dataFactory.createCloudDataStore()
                .findCategoryName(auth, categoryName)
                .map({ listMapper.transform(it) })
    }
}