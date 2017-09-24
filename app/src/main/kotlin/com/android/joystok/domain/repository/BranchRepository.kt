package com.android.joystok.domain.repository

import com.android.joystok.domain.model.BranchAPIModel
import rx.Observable

/**
 * Created by Fauzi Arnami on 9/24/17.
 */

interface BranchRepository {
    fun branch(auth: String, id: Int): Observable<BranchAPIModel>
}