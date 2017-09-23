package com.android.joystok.data.repository.datasources.user

import com.android.joystok.data.net.RestAPI
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by Fauzi Arnami on 9/23/17.
 */

@Singleton
class UserDataFactory
@Inject
constructor(private val restAPI: RestAPI) {
    fun createCloudDataStore(): UserDataStore {
        return UserCloudDataStore(restAPI)
    }
}