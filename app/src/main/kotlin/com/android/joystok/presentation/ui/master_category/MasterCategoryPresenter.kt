package com.android.joystok.presentation.ui.master_category

import android.util.Log
import com.android.joystok.data.cache.DBHelper
import com.android.joystok.domain.model.ItemCategoryAPIModel
import com.android.joystok.domain.using_cases.ListCategoryUseCase
import com.android.joystok.presentation.internal.di.scope.PerActivity
import rx.lang.kotlin.FunctionSubscriber
import javax.inject.Inject

/**
 * Created by Fauzi Arnami on 9/24/17.
 */

@PerActivity
class MasterCategoryPresenter
@Inject
constructor(private val listCategoryUseCase: ListCategoryUseCase) {
    private val TAG = "MasterCategoryPresenter"

    var view: MasterCatergoryView? = null

    fun onGetList() {
        listCategoryUseCase.auth = DBHelper().getToken()
        Log.e(TAG, "onGetList: auth = ${listCategoryUseCase.auth}")
        listCategoryUseCase.execute(useCaseSubscriber = FunctionSubscriber<List<ItemCategoryAPIModel>>()
                .onNext {
                    view?.showListCategory(it)
                }
                .onError {
                    Log.e(TAG, "onGetUser: error")
                }
        )
    }
}