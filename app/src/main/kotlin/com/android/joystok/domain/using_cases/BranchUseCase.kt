package com.android.joystok.domain.using_cases

import com.android.joystok.domain.executor.PostExecutionThread
import com.android.joystok.domain.executor.ThreadExecutor
import com.android.joystok.domain.model.BranchAPIModel
import com.android.joystok.domain.repository.BranchRepository
import rx.Observable
import javax.inject.Inject

/**
 * Created by Fauzi Arnami on 9/24/17.
 */

class BranchUseCase
@Inject
constructor(threadExecutor: ThreadExecutor,
            postExecutionThread: PostExecutionThread,
            private val branchRepository: BranchRepository
) : UseCase<BranchAPIModel>(threadExecutor, postExecutionThread)
{
    var id: Int = 0
    var auth: String = ""

    override fun buildUseCaseObservable(): Observable<BranchAPIModel>? {
        return this.branchRepository.branch(auth, id)
    }
}