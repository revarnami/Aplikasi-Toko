package com.android.joystok.data.repository.datasources.item_category

import com.android.joystok.data.net.RestAPI
import javax.inject.Inject

/**
 * Created by Fauzi Arnami on 9/27/17.
 */

class ItemCategoryDataFactory
@Inject
constructor(private val restAPI: RestAPI) {
    fun createCloudDataStore(): ItemCategoryDataStore {
        return ItemCategoryCloudDataStore(restAPI)
    }
}