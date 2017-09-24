package com.android.joystok.data.entity.mapper

import com.android.joystok.data.entity.BranchAPIEntity
import com.android.joystok.domain.model.BranchAPIModel
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by Fauzi Arnami on 9/24/17.
 */

@Singleton
class BranchMapper
@Inject
constructor() : EntryEntityMapper<BranchAPIModel, BranchAPIEntity>()
{
    override fun transform(entity: BranchAPIEntity?): BranchAPIModel? {
        if (entity != null) {
            val branchModel = BranchAPIModel()
            branchModel.id = entity.id
            branchModel.companyId = entity.companyId
            branchModel.name = entity.name
            branchModel.address = entity.address
            branchModel.phone = entity.phone
            branchModel.remarks = entity.remarks
            return branchModel
        }
        return null
    }
}