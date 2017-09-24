package com.android.joystok.presentation.internal.di.components

import com.android.joystok.presentation.internal.di.module.ActivityModule
import com.android.joystok.presentation.internal.di.scope.PerActivity
import com.android.joystok.presentation.ui.login.LoginActivity
import com.android.joystok.presentation.ui.main.MainActivity
import com.android.joystok.presentation.ui.master_menu.MasterMenuActivity
import dagger.Component

/**
 * Created by Fauzi Arnami on 9/17/17.
 */

@PerActivity
@Component(dependencies = arrayOf(ApplicationComponent::class), modules = arrayOf(ActivityModule::class))
interface ActivityComponent {
    fun inject(loginActivity: LoginActivity)
    fun inject(mainActivity: MainActivity)
    fun inject(masterMenuActivity: MasterMenuActivity)
}