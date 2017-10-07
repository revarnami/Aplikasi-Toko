package com.android.joystok.presentation.ui.customer_detail

import android.util.Log
import com.android.joystok.data.cache.DBHelper
import com.android.joystok.domain.model.CustomerAPIModel
import com.android.joystok.domain.using_cases.AddCustomerUseCase
import com.android.joystok.domain.using_cases.DeleteCustomerUseCase
import com.android.joystok.domain.using_cases.UpdateCustomerUseCase
import com.google.gson.JsonObject
import org.json.JSONObject
import rx.lang.kotlin.FunctionSubscriber
import javax.inject.Inject

/**
 * Created by Fauzi Arnami on 10/7/17.
 */

class CustomerDetailPresenter
@Inject
constructor(private val addCustomerUseCase: AddCustomerUseCase,
            private val updateCustomerUseCase: UpdateCustomerUseCase,
            private val deleteCustomerUseCase: DeleteCustomerUseCase) {
    private val TAG = "MasterCategoryPresenter"

    var view: CustomerDetailView? = null

    fun addCustomer(name: String, phone: String, address: String, remarks: String) {
        addCustomerUseCase.auth = DBHelper().getToken()
        addCustomerUseCase.name = name
        addCustomerUseCase.phone = phone
        addCustomerUseCase.address = address
        addCustomerUseCase.remarks = remarks
        Log.e(TAG, "onGetList: auth = ${addCustomerUseCase.name}")
        addCustomerUseCase.execute(useCaseSubscriber = FunctionSubscriber<CustomerAPIModel>()
                .onNext {
                    view?.showMessage("Berhasil menambahkan")
                }
                .onError {
                    Log.e(TAG, "onGetUser: error")
                }
        )
    }

    fun updateCategory(where: JSONObject, data: JsonObject) {
        updateCustomerUseCase.auth = DBHelper().getToken()
        updateCustomerUseCase.where = where

        updateCustomerUseCase.data = data
        updateCustomerUseCase.execute(useCaseSubscriber = FunctionSubscriber<CustomerAPIModel>()
                .onNext {
                    view?.showMessage("Berhasil Mengubah")
                }
                .onError {
                    Log.e(TAG, "onGetUser: error")
                }
        )
    }

    fun deleteCategory(id: Int) {
        deleteCustomerUseCase.auth = DBHelper().getToken()
        deleteCustomerUseCase.id = id
        deleteCustomerUseCase.execute(useCaseSubscriber = FunctionSubscriber<CustomerAPIModel>()
                .onNext {
                    view?.showMessage("Berhasil Menghapus")
                }
                .onError {
                    Log.e(TAG, "onGetUser: error")
                }
        )
    }
}