package com.android.joystok.presentation.ui.login

import android.util.Log
import com.android.joystok.data.entity.LoginAPIEntity
import com.android.joystok.domain.model.LoginAPIModel
import com.android.joystok.domain.using_cases.LoginUseCase
import com.android.joystok.presentation.internal.di.scope.PerActivity
import io.realm.Realm
import io.realm.RealmQuery
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
    private val realm = Realm.getDefaultInstance()

    var view: LoginView? = null

    fun onLogin(username: String, password: String) {
        loginUseCase.username = username
        loginUseCase.password = password
        loginUseCase.execute(FunctionSubscriber<LoginAPIModel>()
                .onNext {
                    val savedUser: LoginAPIEntity? = RealmQuery.createQuery(realm, LoginAPIEntity::class.java)
                            .findFirst()
                    if (savedUser != null) {
                        Log.e(TAG, "onGetUser: ${savedUser.id}")
                    }
                    else {
                        Log.e(TAG, "onGetUser: no id")
                    }
                    view!!.loginSuccess(it.userId)
                }
                .onError {
                    //                    Log.e(TAG, "onLogin: error ${it.message}")
                    view!!.loginFailed()
                }
        )
    }
}