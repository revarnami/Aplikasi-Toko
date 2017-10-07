package com.android.joystok.presentation.ui.master_customer

import android.util.Log
import com.android.joystok.data.cache.DBHelper
import com.android.joystok.domain.model.CustomerAPIModel
import com.android.joystok.domain.using_cases.ListCustomerUseCase
import com.android.joystok.presentation.internal.di.scope.PerActivity
import org.json.JSONObject
import rx.lang.kotlin.FunctionSubscriber
import javax.inject.Inject

/**
 * Created by Fauzi Arnami on 10/7/17.
 */

@PerActivity
class MasterCustomerPresenter
@Inject
constructor(private val listCustomerUseCase: ListCustomerUseCase) {
    private val TAG = "MasterCategoryPresenter"

    var view: MasterCustomerView? = null

    fun onGetList(data: JSONObject) {
        listCustomerUseCase.auth = DBHelper().getToken()
        listCustomerUseCase.filter = data
        listCustomerUseCase.execute(useCaseSubscriber = FunctionSubscriber<List<CustomerAPIModel>>()
                .onNext {
                    view?.showListCustomer(it)
                }
                .onError {
                    Log.e(TAG, "onGetUser: error")
                }
        )
    }
}