package com.android.joystok.data.entity.mapper

import com.android.joystok.data.entity.CustomerAPIEntity
import com.android.joystok.domain.model.CustomerAPIModel
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by Fauzi Arnami on 10/7/17.
 */

@Singleton
class CustomerMapper
@Inject
constructor() : EntryEntityMapper<CustomerAPIModel, CustomerAPIEntity>()
{
    override fun transform(entity: CustomerAPIEntity?): CustomerAPIModel? {
        if (entity != null) {
            val categoryModel = CustomerAPIModel()
            categoryModel.id = entity.id
            categoryModel.name = entity.name
            categoryModel.address = entity.address
            categoryModel.phone = entity.phone
            categoryModel.remarks = entity.remarks
            return categoryModel
        }
        return null
    }
}