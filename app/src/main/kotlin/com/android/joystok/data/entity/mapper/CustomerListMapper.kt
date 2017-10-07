package com.android.joystok.data.entity.mapper

import com.android.joystok.domain.model.CustomerAPIModel
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by Fauzi Arnami on 10/7/17.
 */

@Singleton
class CustomerListMapper
@Inject
constructor() : EntryEntityMapper<List<CustomerAPIModel>, List<CustomerAPIModel>>()
{
    override fun transform(entity: List<CustomerAPIModel>?): List<CustomerAPIModel>? {
        if (entity != null) {
            return entity
        }
        return null
    }
}