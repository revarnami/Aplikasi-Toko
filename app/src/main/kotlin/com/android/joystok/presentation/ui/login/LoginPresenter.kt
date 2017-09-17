package com.android.joystok.presentation.ui.login

import android.util.Log
import com.android.joystok.domain.model.LoginAPIModel
import com.android.joystok.domain.using_cases.LoginUseCase
import com.android.joystok.presentation.internal.di.scope.PerActivity
import rx.lang.kotlin.FunctionSubscriber
import javax.inject.Inject

/**
 * Created by Fauzi Arnami on 9/17/17.
 */

@PerActivity
class LoginPresenter
@Inject
constructor(private val loginUseCase: LoginUseCase)
{
    private val TAG = "LoginPresenter"

    var view: LoginView? = null

    fun onLogin(username: String, password: String) {
        Log.e(TAG, "onLogin: username = $username")
        Log.e(TAG, "onLogin: pass = $password")
        loginUseCase.username = username
        loginUseCase.password = password
        loginUseCase.execute(FunctionSubscriber<LoginAPIModel>()
                .onNext {
                    Log.e(TAG, "onLogin: ${it.id}")
                    view!!.loginSuccess(it.id)
                }
                .onError {
                    Log.e(TAG, "onLogin: error ${it.message}")
                    view!!.loginFailed()
                }
        )
    }
}