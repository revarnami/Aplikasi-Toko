package com.android.joystok.presentation.ui.master_menu

import com.android.joystok.domain.model.UserAPIModel
import com.android.joystok.domain.using_cases.UserUseCase
import com.android.joystok.presentation.internal.di.scope.PerActivity
import rx.lang.kotlin.FunctionSubscriber
import javax.inject.Inject

/**
 * Created by Fauzi Arnami on 9/23/17.
 */

@PerActivity
class MasterMenuPresenter
@Inject
constructor(private val userUseCase: UserUseCase)
{
    private val TAG = "MasterMenuPresenter"

    var view: MasterMenuView? = null

    fun onGetUser(id: Int) {
        userUseCase.id = id.toString()
        userUseCase.execute(FunctionSubscriber<UserAPIModel>()
                .onNext {
                    view!!.showWelcomeMessage(it.username)
                }
                .onError {

                }
        )
    }
}