package com.android.joystok.domain.using_cases

import com.android.joystok.domain.executor.PostExecutionThread
import com.android.joystok.domain.executor.ThreadExecutor
import com.android.joystok.domain.model.CustomerAPIModel
import com.android.joystok.domain.repository.CustomerRepository
import org.json.JSONObject
import rx.Observable
import javax.inject.Inject

/**
 * Created by Fauzi Arnami on 10/7/17.
 */

class ListCustomerUseCase
@Inject
constructor(threadExecutor: ThreadExecutor,
            postExecutionThread: PostExecutionThread,
            private val customerRepository: CustomerRepository
) : UseCase<List<CustomerAPIModel>>(threadExecutor, postExecutionThread)
{
    var auth: String = ""
    var filter: JSONObject = JSONObject()

    override fun buildUseCaseObservable(): Observable<List<CustomerAPIModel>>? {
        return this.customerRepository.customerList(auth, filter)
    }
}