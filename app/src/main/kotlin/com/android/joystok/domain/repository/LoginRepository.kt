package com.android.joystok.domain.repository

import com.android.joystok.domain.model.LoginAPIModel
import rx.Observable

/**
 * Created by Fauzi Arnami on 9/16/17.
 */

interface LoginRepository {
    fun login(username: String,
              password: String
    ): Observable<LoginAPIModel>
}