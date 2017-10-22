package com.android.joystok.data.repository

import com.android.joystok.data.entity.mapper.*
import com.android.joystok.data.repository.datasources.item.ItemDataFactory
import com.android.joystok.domain.model.ItemAPIModel
import com.android.joystok.domain.model.ItemCategoryAPIModel
import com.android.joystok.domain.model.ItemVariantAPIModel
import com.android.joystok.domain.model.VariantStockAPIModel
import com.android.joystok.domain.repository.ItemRepository
import com.google.gson.JsonObject
import org.json.JSONObject
import rx.Observable
import javax.inject.Inject

/**
 * Created by Fauzi Arnami on 10/8/17.
 */

class ItemDataRepository
@Inject constructor(private val listMapper: ItemListMapper,
                    private val mapper: ItemMapper,
                    private val categoryMapper: CategoryMapper,
                    private val variantMapper: ItemVariantListMapper,
                    private val stockMapper: VariantStockMapper,
                    private val dataFactory: ItemDataFactory
) : ItemRepository {
    override fun itemList(auth: String, filter: JSONObject): Observable<List<ItemAPIModel>> {
        return dataFactory.createCloudDataStore()
                .itemList(auth, filter)
                .map({ listMapper.transform(it) })
    }

    override fun addItem(auth: String, data: JsonObject): Observable<ItemAPIModel> {
        return dataFactory.createCloudDataStore()
                .addItem(auth, data)
                .map ({mapper.transform(it)})
    }

    override fun itemCategoryByItemId(auth: String, id: String): Observable<ItemCategoryAPIModel> {
        return dataFactory.createCloudDataStore()
                .itemCategoryByItemId(auth, id)
                .map ({categoryMapper.transform(it)})
    }

    override fun variantByItemId(auth: String, id: String): Observable<List<ItemVariantAPIModel>> {
        return dataFactory.createCloudDataStore()
                .variantByItemId(auth, id)
                .map({variantMapper.transform(it)})
    }

    override fun stockByVariantId(auth: String, id: String): Observable<VariantStockAPIModel> {
        return dataFactory.createCloudDataStore()
                .stockByVariantId(auth, id)
                .map({stockMapper.transform(it)})
    }
}