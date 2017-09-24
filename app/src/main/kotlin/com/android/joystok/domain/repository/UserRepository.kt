package com.android.joystok.domain.repository

import com.android.joystok.domain.model.UserAPIModel
import rx.Observable

/**
 * Created by Fauzi Arnami on 9/23/17.
 */

interface UserRepository {
    fun user(id: String): Observable<UserAPIModel>
    fun userInfo(id: String): Observable<UserAPIModel>
}