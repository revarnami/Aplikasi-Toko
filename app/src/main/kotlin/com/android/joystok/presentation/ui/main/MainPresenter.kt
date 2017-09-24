package com.android.joystok.presentation.ui.main

import android.util.Log
import com.android.joystok.data.cache.DBHelper
import com.android.joystok.domain.model.BranchAPIModel
import com.android.joystok.domain.model.CompanyAPIModel
import com.android.joystok.domain.model.UserAPIModel
import com.android.joystok.domain.using_cases.BranchUseCase
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
            private val branchUseCase: BranchUseCase,
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
                                branchUseCase.id = it.branchId
                                branchUseCase.auth = DBHelper().getToken()
                                branchUseCase.execute(FunctionSubscriber<BranchAPIModel>()
                                        .onNext {
                                            companyUseCase.id = it.companyId
                                            companyUseCase.auth = DBHelper().getToken()
                                            companyUseCase.execute(FunctionSubscriber<CompanyAPIModel>()
                                                    .onNext {
                                                        view!!.showBranchInfo(DBHelper().getBranchName(), it.companyCode)
                                                    }
                                                    .onError {
                                                        Log.e(TAG, "onGetUser: error")
                                                    }
                                            )

                                        }
                                        .onError {
                                            Log.e(TAG, "onGetUser: error")
                                        }
                                )
                            }
                            .onError {
                                Log.e(TAG, "onGetUser: error")
                            }
                    )
                    view!!.showWelcomeMessage(it.username)
                }
                .onError {
                    Log.e(TAG, "onGetUser: error")
                }
        )
    }
}