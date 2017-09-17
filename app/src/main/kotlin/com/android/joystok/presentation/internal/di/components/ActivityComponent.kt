package com.android.joystok.presentation.internal.di.components

import com.android.joystok.presentation.internal.di.module.ActivityModule
import com.android.joystok.presentation.internal.di.scope.PerActivity
import com.android.joystok.presentation.ui.login.LoginActivity
import dagger.Component

/**
 * Created by Fauzi Arnami on 9/17/17.
 */

@PerActivity
@Component(dependencies = arrayOf(ApplicationComponent::class), modules = arrayOf(ActivityModule::class))
interface ActivityComponent {
    fun inject(loginActivity: LoginActivity)
}