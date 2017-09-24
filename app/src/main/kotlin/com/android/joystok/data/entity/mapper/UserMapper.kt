package com.android.joystok.data.entity.mapper

import com.android.joystok.data.entity.UserAPIEntity
import com.android.joystok.domain.model.UserAPIModel
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by Fauzi Arnami on 9/23/17.
 */

@Singleton
class UserMapper
@Inject
constructor() : EntryEntityMapper<UserAPIModel, UserAPIEntity>()
{
    override fun transform(entity: UserAPIEntity?): UserAPIModel? {
        if (entity != null) {
            val userModel = UserAPIModel()
            userModel.id = entity.id
            userModel.username = entity.username
            userModel.email = entity.email
            userModel.companyId = entity.companyId
            userModel.branchId = entity.branchId
            userModel.userRole = entity.userRole
            userModel.status = entity.status
            return userModel
        }
        return null
    }
}