package com.android.joystok.data.entity.mapper

import com.android.joystok.data.entity.LoginAPIEntity
import com.android.joystok.domain.model.LoginAPIModel
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by Fauzi Arnami on 9/16/17.
 */

@Singleton
class LoginMapper
@Inject
constructor() : EntryEntityMapper<LoginAPIModel, LoginAPIEntity>()
{
    override fun transform(entity: LoginAPIEntity?): LoginAPIModel? {
        if (entity != null) {
            val loginModel = LoginAPIModel()
            loginModel.id = entity.id
            loginModel.ttl = entity.ttl
            loginModel.userId = entity.userId
            loginModel.created = entity.created
            return loginModel
        }
        return null
    }
}