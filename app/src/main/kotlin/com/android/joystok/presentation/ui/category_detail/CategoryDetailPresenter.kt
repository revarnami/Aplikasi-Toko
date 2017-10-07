package com.android.joystok.presentation.ui.category_detail

import android.util.Log
import com.android.joystok.data.cache.DBHelper
import com.android.joystok.domain.model.ItemCategoryAPIModel
import com.android.joystok.domain.using_cases.AddCategoryUseCase
import com.android.joystok.domain.using_cases.DeleteCategoryUseCase
import com.android.joystok.domain.using_cases.UpdateCategoryUseCase
import com.google.gson.JsonObject
import org.json.JSONObject
import rx.lang.kotlin.FunctionSubscriber
import javax.inject.Inject

/**
 * Created by Fauzi Arnami on 9/30/17.
 */

class CategoryDetailPresenter
@Inject
constructor(private val addCategoryUseCase: AddCategoryUseCase,
            private val updateCategoryUseCase: UpdateCategoryUseCase,
            private val deleteCategoryUseCase: DeleteCategoryUseCase) {
    private val TAG = "MasterCategoryPresenter"

    var view: CategoryDetailView? = null

    fun addCategory(categoryName: String, remarks: String) {
        addCategoryUseCase.auth = DBHelper().getToken()
        addCategoryUseCase.categoryName = categoryName
        addCategoryUseCase.remarks = remarks
        Log.e(TAG, "onGetList: auth = ${addCategoryUseCase.categoryName}")
        addCategoryUseCase.execute(useCaseSubscriber = FunctionSubscriber<ItemCategoryAPIModel>()
                .onNext {
                    view?.showMessage("Berhasil menambahkan")
                }
                .onError {
                    Log.e(TAG, "onGetUser: error")
                }
        )
    }

    fun updateCategory(where: JSONObject, categoryName: String, remarks: String, categoryId: Int) {
        updateCategoryUseCase.auth = DBHelper().getToken()
        updateCategoryUseCase.where = where
        val data = JsonObject()
        data.addProperty("categoryName", categoryName)
        data.addProperty("remarks", remarks)
        updateCategoryUseCase.data = data
        updateCategoryUseCase.execute(useCaseSubscriber = FunctionSubscriber<ItemCategoryAPIModel>()
                .onNext {
                    view?.showMessage("Berhasil Mengubah")
                }
                .onError {
                    Log.e(TAG, "onGetUser: error")
                }
        )
    }

    fun deleteCategory(id: Int) {
        deleteCategoryUseCase.auth = DBHelper().getToken()
        deleteCategoryUseCase.id = id
        deleteCategoryUseCase.execute(useCaseSubscriber = FunctionSubscriber<ItemCategoryAPIModel>()
                .onNext {
                    view?.showMessage("Berhasil Menghapus")
                }
                .onError {
                    Log.e(TAG, "onGetUser: error")
                }
        )
    }
}