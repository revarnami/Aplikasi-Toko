package com.android.joystok.presentation.ui.main

import com.android.joystok.domain.model.CompanyAPIModel
import com.android.joystok.domain.model.UserAPIModel
import com.android.joystok.domain.using_cases.CompanyUseCase
import com.android.joystok.domain.using_cases.UserInfoUseCase
import com.android.joystok.domain.using_cases.UserUseCase
import com.android.joystok.presentation.internal.di.scope.PerActivity
import rx.lang.kotlin.FunctionSubscriber
import javax.inject.Inject

/**
 * Created by Fauzi Arnami on 9/23/17.
 */

@PerActivity
class MainPresenter
@Inject
constructor(private val userUseCase: UserUseCase,
            private val userInfoUseCase: UserInfoUseCase,
            private val companyUseCase: CompanyUseCase)
{
    private val TAG = "LoginPresenter"

    var view: MainView? = null

    fun onGetUser(id: Int) {
        userUseCase.id = id.toString()
        userUseCase.execute(FunctionSubscriber<UserAPIModel>()
                .onNext {
                    userInfoUseCase.id = id.toString()
                    userInfoUseCase.execute(FunctionSubscriber<UserAPIModel>()
                            .onNext {
                                companyUseCase.id = 3
                                companyUseCase.execute(FunctionSubscriber<CompanyAPIModel>()
                                        .onNext {

                                        }
                                        .onError {

                                        }
                                )
                            }
                            .onError {

                            }
                    )
                    view!!.showWelcomeMessage(it.username)
                }
                .onError {

                }
        )
    }
}