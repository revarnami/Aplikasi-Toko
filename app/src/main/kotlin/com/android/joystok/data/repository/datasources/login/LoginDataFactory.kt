package com.android.joystok.data.repository.datasources.login

import com.android.joystok.data.net.RestAPI
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by Fauzi Arnami on 9/16/17.
 */

@Singleton
class LoginDataFactory
@Inject
constructor(private val restAPI: RestAPI) {
    fun createCloudDataStore(): LoginDataStore {
        return LoginCloudDataStore(restAPI)
    }
}