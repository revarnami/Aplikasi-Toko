package com.android.joystok.data.repository.datasources.login

import com.android.joystok.data.cache.DBHelper
import com.android.joystok.data.entity.LoginAPIEntity
import com.android.joystok.data.net.RestAPI
import rx.Observable

/**
 * Created by Fauzi Arnami on 9/16/17.
 */

class LoginCloudDataStore(private val restAPI: RestAPI) : LoginDataStore
{
    private val TAG = "LoginCloudDataStore"

    override fun login(username: String, password: String): Observable<LoginAPIEntity> {
        return restAPI.postLogin(username, password)
                .doOnNext {
                    DBHelper().saveLogin(it)
                }
    }
}