package com.android.joystok.data.entity.mapper

import com.android.joystok.data.entity.CompanyAPIEntity
import com.android.joystok.domain.model.CompanyAPIModel
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by Fauzi Arnami on 9/24/17.
 */

@Singleton
class CompanyMapper
@Inject
constructor() : EntryEntityMapper<CompanyAPIModel, CompanyAPIEntity>()
{
    override fun transform(entity: CompanyAPIEntity?): CompanyAPIModel? {
        if (entity != null) {
            val companyModel = CompanyAPIModel()
            companyModel.id = entity.id
            companyModel.companyCode = entity.companyCode
            companyModel.status = entity.status
            return companyModel
        }
        return null
    }
}