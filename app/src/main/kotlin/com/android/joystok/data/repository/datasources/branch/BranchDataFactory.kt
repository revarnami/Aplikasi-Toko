package com.android.joystok.data.repository.datasources.branch

import com.android.joystok.data.net.RestAPI
import javax.inject.Inject

/**
 * Created by Fauzi Arnami on 9/24/17.
 */

class BranchDataFactory
@Inject
constructor(private val restAPI: RestAPI) {
    fun createCloudDataStore(): BranchDataStore {
        return BranchCloudDataStore(restAPI)
    }
}