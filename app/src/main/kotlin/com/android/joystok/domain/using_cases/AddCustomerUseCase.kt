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

class AddCustomerUseCase
@Inject
constructor(threadExecutor: ThreadExecutor,
            postExecutionThread: PostExecutionThread,
            private val customerRepository: CustomerRepository
) : UseCase<CustomerAPIModel>(threadExecutor, postExecutionThread)
{
    var auth: String = ""
    var name: String = ""
    var phone: String = ""
    var address: String = ""
    var remarks: String = ""

    override fun buildUseCaseObservable(): Observable<CustomerAPIModel>? {
        return this.customerRepository.addCustomer(auth, name, phone, address, remarks)
    }
}