package com.android.joystok.data.repository.datasources.customer

import com.android.joystok.data.entity.CustomerAPIEntity
import com.android.joystok.data.net.RestAPI
import com.android.joystok.domain.model.CustomerAPIModel
import com.google.gson.JsonObject
import org.json.JSONObject
import rx.Observable

/**
 * Created by Fauzi Arnami on 10/7/17.
 */

class CustomerCloudDataStore(private val restAPI: RestAPI) : CustomerDataStore {
    override fun customerList(auth: String, filter: JSONObject): Observable<List<CustomerAPIModel>> {
        return restAPI.getCustomerList(auth, filter)
    }

    override fun addCustomer(auth: String, name: String, phone: String, address: String, remarks: String): Observable<CustomerAPIEntity> {
        return restAPI.postCustomer(auth, name, phone, address, remarks)
    }

    override fun updateCustomer(auth: String, where: JSONObject, data: JsonObject): Observable<CustomerAPIEntity> {
        return restAPI.postUpdateCustomer(auth, where, data)
    }

    override fun deleteCustomer(auth: String, id: Int): Observable<CustomerAPIEntity> {
        return restAPI.deleteCustomer(auth, id)
    }
}