package com.android.joystok.data.repository.datasources.user

import com.android.joystok.data.entity.UserAPIEntity
import rx.Observable

/**
 * Created by Fauzi Arnami on 9/23/17.
 */

interface UserDataStore {
    fun user(id: String): Observable<UserAPIEntity>
}