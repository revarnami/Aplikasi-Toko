package com.android.joystok.domain.using_cases

import com.android.joystok.domain.executor.PostExecutionThread
import com.android.joystok.domain.executor.ThreadExecutor
import com.android.joystok.domain.model.CustomerAPIModel
import com.android.joystok.domain.repository.CustomerRepository
import rx.Observable
import javax.inject.Inject

/**
 * Created by Fauzi Arnami on 10/7/17.
 */

class DeleteCustomerUseCase
@Inject
constructor(threadExecutor: ThreadExecutor,
            postExecutionThread: PostExecutionThread,
            private val customerRepository: CustomerRepository
) : UseCase<CustomerAPIModel>(threadExecutor, postExecutionThread)
{
    var auth = ""
    var id = 0

    override fun buildUseCaseObservable(): Observable<CustomerAPIModel>? {
        return this.customerRepository.deleteCategory(auth, id)
    }
}