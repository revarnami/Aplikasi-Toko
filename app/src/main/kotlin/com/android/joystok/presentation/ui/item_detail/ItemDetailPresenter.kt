package com.android.joystok.presentation.ui.item_detail

import android.util.Log
import com.android.joystok.data.cache.DBHelper
import com.android.joystok.domain.model.ItemAPIModel
import com.android.joystok.domain.model.ItemCategoryAPIModel
import com.android.joystok.domain.model.ItemVariantAPIModel
import com.android.joystok.domain.model.VariantStockAPIModel
import com.android.joystok.domain.using_cases.*
import com.android.joystok.presentation.internal.di.scope.PerActivity
import com.google.gson.JsonObject
import org.json.JSONObject
import rx.lang.kotlin.FunctionSubscriber
import javax.inject.Inject

/**
 * Created by Fauzi Arnami on 10/14/17.
 */

@PerActivity
class ItemDetailPresenter
@Inject
constructor(private val addItemUseCase: AddItemUseCase,
            private val addItemVariantUseCase: AddItemVariantUseCase,
            private val addVariantStockUseCase: AddVariantStockUseCase,
            private val listCategoryUseCase: ListCategoryUseCase,
            private val categoryByItemIdUseCase: CategoryByItemIdUseCase,
            private val variantByItemIdUseCase: VariantByItemIdUseCase,
            private val stockByVariantIdUseCase: StockByVariantIdUseCase) {
    private val TAG = "MasterCategoryPresenter"

    var view: ItemDetailView? = null

    fun addItem(data: JsonObject, state: Int) {
        addItemUseCase.auth = DBHelper().getToken()
        addItemUseCase.data = data
        addItemUseCase.execute(useCaseSubscriber = FunctionSubscriber<ItemAPIModel>()
                .onNext {
                    if (state == 0) {
                        view!!.showMessage("Berhasil menambahkan item")
                    } else {
                        view!!.showMessage("Berhasil edit item")
                    }
                }
                .onError {
                    Log.e(TAG, "onAddItem: error")
                }
        )
    }

    fun getCategoryList(data: JSONObject) {
        listCategoryUseCase.auth = DBHelper().getToken()
        listCategoryUseCase.filter = data
        listCategoryUseCase.execute(useCaseSubscriber = FunctionSubscriber<List<ItemCategoryAPIModel>>()
                .onNext {
                    view?.insertComboBox(it)
                }
                .onError {
                    Log.e(TAG, "onGetUser: error")
                }
        )
    }

    fun addVariant(itemId: Int, itemVariantName: String, quantity: Int) {
        addItemVariantUseCase.auth = DBHelper().getToken()
        addItemVariantUseCase.itemId = itemId
        addItemVariantUseCase.variantName = itemVariantName
        addItemVariantUseCase.execute(useCaseSubscriber = FunctionSubscriber<ItemVariantAPIModel>()
                .onNext {
                    addVariantStock(it.id, quantity)
                }
                .onError {
                    Log.e(TAG, "onAddVariant: error")
                }
        )
    }

    fun addVariantStock(itemVariantId: Int, quantity: Int) {
        addVariantStockUseCase.auth = DBHelper().getToken()
        addVariantStockUseCase.branchId = DBHelper().getBranchId()
        addVariantStockUseCase.itemVariantId = itemVariantId
        addVariantStockUseCase.quantity = quantity
        addVariantStockUseCase.execute(useCaseSubscriber = FunctionSubscriber<VariantStockAPIModel>()
                .onNext {
                    view?.showMessage("Berhasil menambahkan")
                }
                .onError {

                }
        )
    }

    fun categoryByItemId(itemId: String) {
        categoryByItemIdUseCase.auth = DBHelper().getToken()
        categoryByItemIdUseCase.id =itemId
        categoryByItemIdUseCase.execute(useCaseSubscriber = FunctionSubscriber<ItemCategoryAPIModel>()
                .onNext {
                    view?.categorySetSelection(it.categoryName)
                }
                .onError {

                }
        )
    }

    fun stockByVariantId(variantId: String) {
        stockByVariantIdUseCase.auth = DBHelper().getToken()
        stockByVariantIdUseCase.id = variantId
        stockByVariantIdUseCase.execute(useCaseSubscriber = FunctionSubscriber<VariantStockAPIModel>()
                .onNext {
                    view?.showStock(it.quantity)
                }
                .onError {
                    Log.e(TAG, "stockByVariantId: error")
                }
        )
    }

    fun variantByItemId(itemId: String) {
        variantByItemIdUseCase.auth = DBHelper().getToken()
        variantByItemIdUseCase.id =itemId
        variantByItemIdUseCase.execute(useCaseSubscriber = FunctionSubscriber<List<ItemVariantAPIModel>>()
                .onNext {
                    Log.e(TAG, "variantByItemId: masuk")
                    stockByVariantId(it[0].id.toString())
                }
                .onError {
                    Log.e(TAG, "variantByItemId: error")
                }
        )
    }

    fun updateItem(where: JSONObject, data: JsonObject) {

    }

    fun deleteItem(id: Int) {

    }
}