package com.android.joystok.domain.using_cases

import com.android.joystok.domain.executor.PostExecutionThread
import com.android.joystok.domain.executor.ThreadExecutor
import com.android.joystok.domain.model.CompanyAPIModel
import com.android.joystok.domain.repository.CompanyRepository
import rx.Observable
import javax.inject.Inject

/**
 * Created by Fauzi Arnami on 9/24/17.
 */

class CompanyUseCase
@Inject
constructor(threadExecutor: ThreadExecutor,
            postExecutionThread: PostExecutionThread,
            private val companyRepository: CompanyRepository
) : UseCase<CompanyAPIModel>(threadExecutor, postExecutionThread)
{
    var id: Int = 0

    override fun buildUseCaseObservable(): Observable<CompanyAPIModel>? {
        return this.companyRepository.company(id)
    }
}