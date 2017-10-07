package com.android.joystok.domain.repository

import com.android.joystok.domain.model.CustomerAPIModel
import com.google.gson.JsonObject
import org.json.JSONObject
import rx.Observable

/**
 * Created by Fauzi Arnami on 10/7/17.
 */

interface CustomerRepository {
    fun customerList(auth: String, filter: JSONObject): Observable<List<CustomerAPIModel>>
    fun addCustomer(auth: String, name: String, phone: String, address: String, remarks: String): Observable<CustomerAPIModel>
    fun updateCategory(auth: String, where: JSONObject, data: JsonObject): Observable<CustomerAPIModel>
    fun deleteCategory(auth: String, id: Int): Observable<CustomerAPIModel>
}