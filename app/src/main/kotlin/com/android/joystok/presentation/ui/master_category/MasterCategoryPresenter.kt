package com.android.joystok.presentation.ui.master_category

import android.util.Log
import com.android.joystok.data.cache.DBHelper
import com.android.joystok.domain.model.ItemCategoryAPIModel
import com.android.joystok.domain.using_cases.FindCategoryUseCase
import com.android.joystok.domain.using_cases.ListCategoryUseCase
import com.android.joystok.presentation.internal.di.scope.PerActivity
import org.json.JSONObject
import rx.lang.kotlin.FunctionSubscriber
import javax.inject.Inject

/**
 * Created by Fauzi Arnami on 9/24/17.
 */

@PerActivity
class MasterCategoryPresenter
@Inject
constructor(private val listCategoryUseCase: ListCategoryUseCase,
            private val findCategoryUseCase: FindCategoryUseCase) {
    private val TAG = "MasterCategoryPresenter"

    var view: MasterCatergoryView? = null

    fun onGetList(data: JSONObject) {
        listCategoryUseCase.auth = DBHelper().getToken()
        listCategoryUseCase.filter = data
        listCategoryUseCase.execute(useCaseSubscriber = FunctionSubscriber<List<ItemCategoryAPIModel>>()
                .onNext {
                    view?.showListCategory(it)
                }
                .onError {
                    Log.e(TAG, "onGetUser: error")
                }
        )
    }

    fun findList(query: String) {
        findCategoryUseCase.auth = DBHelper().getToken()
        findCategoryUseCase.categoryName.put("categoryName", query)
        findCategoryUseCase.execute(useCaseSubscriber = FunctionSubscriber<List<ItemCategoryAPIModel>>()
                .onNext {
                    view?.showListCategory(it)
                }
                .onError {
                    Log.e(TAG, "onFindCategory: error")
                }
        )
    }
}