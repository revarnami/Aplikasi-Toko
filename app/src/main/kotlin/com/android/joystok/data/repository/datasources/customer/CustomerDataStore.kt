package com.android.joystok.data.repository.datasources.customer

import com.android.joystok.data.entity.CustomerAPIEntity
import com.android.joystok.domain.model.CustomerAPIModel
import com.google.gson.JsonObject
import org.json.JSONObject
import rx.Observable

/**
 * Created by Fauzi Arnami on 10/7/17.
 */

interface CustomerDataStore {
    fun customerList(auth: String, filter: JSONObject): Observable<List<CustomerAPIModel>>
    fun addCustomer(auth: String, name: String, phone: String, address: String, remarks: String): Observable<CustomerAPIEntity>
    fun updateCustomer(auth: String, where: JSONObject, data: JsonObject): Observable<CustomerAPIEntity>
    fun deleteCustomer(auth: String, id: Int): Observable<CustomerAPIEntity>
}