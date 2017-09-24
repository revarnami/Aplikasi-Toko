package com.android.joystok.domain.using_cases

import com.android.joystok.domain.executor.PostExecutionThread
import com.android.joystok.domain.executor.ThreadExecutor
import com.android.joystok.domain.model.UserAPIModel
import com.android.joystok.domain.repository.UserRepository
import rx.Observable
import javax.inject.Inject

/**
 * Created by Fauzi Arnami on 9/23/17.
 */

class UserInfoUseCase
@Inject constructor(threadExecutor: ThreadExecutor,
                    postExecutionThread: PostExecutionThread,
                    private val userRepository: UserRepository
) : UseCase<UserAPIModel>(threadExecutor, postExecutionThread)
{
    var id: String = ""

    override fun buildUseCaseObservable(): Observable<UserAPIModel>? {
        return this.userRepository.userInfo(id)
    }
}