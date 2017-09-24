package com.android.joystok.data.repository.datasources.branch

import com.android.joystok.data.entity.BranchAPIEntity
import rx.Observable

/**
 * Created by Fauzi Arnami on 9/24/17.
 */

interface BranchDataStore {
    fun branch(auth: String, id: Int): Observable<BranchAPIEntity>
}