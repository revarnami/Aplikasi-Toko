package com.android.joystok.domain.using_cases

import com.android.joystok.domain.executor.PostExecutionThread
import com.android.joystok.domain.executor.ThreadExecutor
import com.android.joystok.domain.model.LoginAPIModel
import com.android.joystok.domain.repository.LoginRepository
import rx.Observable
import javax.inject.Inject

/**
 * Created by Fauzi Arnami on 9/17/17.
 */

class LoginUseCase
@Inject constructor(threadExecutor: ThreadExecutor,
                    postExecutionThread: PostExecutionThread,
                    private val loginRepository: LoginRepository
) : UseCase<LoginAPIModel>(threadExecutor, postExecutionThread)
{
    var username: String = ""
    var password: String = ""

    override fun buildUseCaseObservable(): Observable<LoginAPIModel>? {
        return this.loginRepository.login(username, password)
    }
}