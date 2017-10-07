package com.android.joystok.data.repository

import com.android.joystok.data.entity.mapper.CustomerListMapper
import com.android.joystok.data.entity.mapper.CustomerMapper
import com.android.joystok.data.repository.datasources.customer.CustomerDataFactory
import com.android.joystok.domain.model.CustomerAPIModel
import com.android.joystok.domain.repository.CustomerRepository
import com.google.gson.JsonObject
import org.json.JSONObject
import rx.Observable
import javax.inject.Inject

/**
 * Created by Fauzi Arnami on 10/7/17.
 */

class CustomerDataRepository
@Inject constructor(private val listMapper: CustomerListMapper,
                    private val mapper: CustomerMapper,
                    private val dataFactory: CustomerDataFactory
) : CustomerRepository {
    override fun customerList(auth: String, filter: JSONObject): Observable<List<CustomerAPIModel>> {
        return dataFactory.createCloudDataStore()
                .customerList(auth, filter)
                .map({ listMapper.transform(it) })
    }

    override fun addCustomer(auth: String, name: String, phone: String, address: String, remarks: String): Observable<CustomerAPIModel> {
        return dataFactory.createCloudDataStore()
                .addCustomer(auth, name, phone, address, remarks)
                .map({mapper.transform(it)})
    }

    override fun updateCategory(auth: String, where: JSONObject, data: JsonObject): Observable<CustomerAPIModel> {
        return dataFactory.createCloudDataStore()
                .updateCustomer(auth, where, data)
                .map({mapper.transform(it)})
    }

    override fun deleteCategory(auth: String, id: Int): Observable<CustomerAPIModel> {
        return dataFactory.createCloudDataStore()
                .deleteCustomer(auth, id)
                .map({mapper.transform(it)})
    }
}