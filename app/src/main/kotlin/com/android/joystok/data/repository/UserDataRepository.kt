package com.android.joystok.data.repository

import com.android.joystok.data.entity.mapper.UserMapper
import com.android.joystok.data.repository.datasources.user.UserDataFactory
import com.android.joystok.domain.model.UserAPIModel
import com.android.joystok.domain.repository.UserRepository
import rx.Observable
import javax.inject.Inject

/**
 * Created by Fauzi Arnami on 9/23/17.
 */

class UserDataRepository
@Inject constructor(private val mapper: UserMapper,
                    private val dataFactory: UserDataFactory
) : UserRepository
{
    override fun user(id: String): Observable<UserAPIModel> {
        return dataFactory.createCloudDataStore()
                .user(id)
                .map({ mapper.transform(it) })
    }

    override fun userInfo(id: String): Observable<UserAPIModel> {
        return dataFactory.createCloudDataStore()
                .userInfo(id)
                .map({ mapper.transform(it) })
    }
}