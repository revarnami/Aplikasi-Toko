package com.android.joystok.data.repository

import com.android.joystok.data.entity.mapper.BranchMapper
import com.android.joystok.data.repository.datasources.branch.BranchDataFactory
import com.android.joystok.domain.model.BranchAPIModel
import com.android.joystok.domain.repository.BranchRepository
import rx.Observable
import javax.inject.Inject

/**
 * Created by Fauzi Arnami on 9/24/17.
 */

class BranchDataRepository
@Inject constructor(private val mapper: BranchMapper,
                    private val dataFactory: BranchDataFactory
) : BranchRepository {
    override fun branch(auth:String, id: Int): Observable<BranchAPIModel> {
        return dataFactory.createCloudDataStore()
                .branch(auth, id)
                .map({ mapper.transform(it) })
    }
}