package com.android.joystok.presentation.ui.category_detail

import android.util.Log
import com.android.joystok.domain.model.ItemCategoryAPIModel
import com.android.joystok.domain.using_cases.AddCategoryUseCase
import com.android.joystok.domain.using_cases.DeleteCategoryUseCase
import com.android.joystok.domain.using_cases.UpdateCategoryUseCase
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

    fun updateCategory(id: Int, categoryName: String, remarks: String) {
        updateCategoryUseCase.id = id
        updateCategoryUseCase.categoryName = categoryName
        updateCategoryUseCase.remarks = categoryName
        Log.e(TAG, "onGetList: auth = ${addCategoryUseCase.categoryName}")
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
        deleteCategoryUseCase.id = id
        deleteCategoryUseCase.execute(useCaseSubscriber = FunctionSubscriber<ItemCategoryAPIModel>()
                .onNext {
                    view?.showMessage("Berhasil Mengubah")
                }
                .onError {
                    Log.e(TAG, "onGetUser: error")
                }
        )
    }
}