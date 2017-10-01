package com.android.joystok.data.entity.mapper

import android.util.Log
import com.android.joystok.domain.model.ItemCategoryAPIModel
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by Fauzi Arnami on 9/27/17.
 */

@Singleton
class ItemCategoryListMapper
@Inject
constructor() : EntryEntityMapper<List<ItemCategoryAPIModel>, List<ItemCategoryAPIModel>>()
{
    private val TAG = "ItemCategoryListMapper"
    override fun transform(entity: List<ItemCategoryAPIModel>?): List<ItemCategoryAPIModel>? {
        if (entity != null) {
            Log.e(TAG, "transform: categoryName = ${entity[0].categoryName}")
//            val itemCategoryModel = ArrayList<ItemCategoryAPIModel>()
//            for (i in 0 until entity.size) {
//                Log.e(TAG, "transform: i = $i")
//                Log.e(TAG, "transform: id = ${entity[i].id}")
//                itemCategoryModel[i].id = entity[i].id
//                Log.e(TAG, "transform: catName = ${entity[i].categoryName}")
//                itemCategoryModel[i].categoryName = entity[i].categoryName
//                Log.e(TAG, "transform: remarks = ${entity[i].remarks}")
//                itemCategoryModel[i].remarks = entity[i].remarks
//            }
            return entity
        }
        return null
    }
}