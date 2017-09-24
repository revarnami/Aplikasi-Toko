package com.android.joystok.data.repository.datasources.branch

import com.android.joystok.data.cache.DBHelper
import com.android.joystok.data.entity.BranchAPIEntity
import com.android.joystok.data.net.RestAPI
import rx.Observable

/**
 * Created by Fauzi Arnami on 9/24/17.
 */

class BranchCloudDataStore(private val restAPI: RestAPI): BranchDataStore {
    override fun branch(auth: String, id: Int): Observable<BranchAPIEntity> {
        return restAPI.getBranch(auth, id).doOnNext {
            DBHelper().saveBranch(it)
        }
    }
}