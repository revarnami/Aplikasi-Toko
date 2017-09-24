package com.android.joystok.data.repository.datasources.user

import com.android.joystok.data.cache.DBHelper
import com.android.joystok.data.entity.UserAPIEntity
import com.android.joystok.data.net.RestAPI
import rx.Observable


/**
 * Created by Fauzi Arnami on 9/23/17.
 */

class UserCloudDataStore(private val restAPI: RestAPI) : UserDataStore {
    override fun user(id: String): Observable<UserAPIEntity> {
        return restAPI.getUser(id).doOnNext {
            DBHelper().saveUser(it)
        }
    }

    override fun userInfo(id: String): Observable<UserAPIEntity> {
        return restAPI.getUserInfo(id).doOnNext {
            DBHelper().updateUserInfo(it.companyId, it.branchId)
        }
    }
}