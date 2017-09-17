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
            val authModel = LoginAPIModel()
            authModel.id = entity.id
            return authModel
        }
        return null
    }
}