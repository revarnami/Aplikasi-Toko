package com.android.joystok.data.repository.datasources.login

import com.android.joystok.data.entity.LoginAPIEntity
import rx.Observable

/**
 * Created by Fauzi Arnami on 9/16/17.
 */

interface LoginDataStore {
    fun login(username: String,
              password: String
    ): Observable<LoginAPIEntity>
}