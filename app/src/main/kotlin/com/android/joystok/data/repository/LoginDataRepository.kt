package com.android.joystok.data.repository

import com.android.joystok.data.entity.mapper.LoginMapper
import com.android.joystok.data.repository.datasources.login.LoginDataFactory
import com.android.joystok.domain.model.LoginAPIModel
import com.android.joystok.domain.repository.LoginRepository
import rx.Observable
import javax.inject.Inject

/**
 * Created by Fauzi Arnami on 9/16/17.
 */

class LoginDataRepository
@Inject constructor(private val mapper: LoginMapper,
                    private val dataFactory: LoginDataFactory
) : LoginRepository
{
    override fun login(username: String,
                       password: String): Observable<LoginAPIModel>
    {
        return dataFactory.createCloudDataStore()
                .login(username, password)
                .map({ mapper.transform(it) })
    }
}