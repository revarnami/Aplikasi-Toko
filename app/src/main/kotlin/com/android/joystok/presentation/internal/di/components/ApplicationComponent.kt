package com.android.joystok.presentation.internal.di.components

import android.content.Context
import android.content.SharedPreferences
import com.android.joystok.domain.executor.PostExecutionThread
import com.android.joystok.domain.executor.ThreadExecutor
import com.android.joystok.domain.repository.LoginRepository
import com.android.joystok.domain.repository.UserRepository
import com.android.joystok.presentation.AndroidApplication
import com.android.joystok.presentation.internal.di.module.ApplicationModule
import com.android.joystok.presentation.navigation.Navigator
import dagger.Component
import javax.inject.Singleton

/**
 * Created by Fauzi Arnami on 9/17/17.
 */

@Singleton // Constraints this component to one-per-application or unscoped bindings.
@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {

    fun inject(androidApplication: AndroidApplication)

    val androidApplication: AndroidApplication

    fun context(): Context

    fun sharedPreferences(): SharedPreferences

    fun sharedPreferencesEditor(): SharedPreferences.Editor

    fun navigator(): Navigator

    fun threadExecutor(): ThreadExecutor

    fun postExecutionThread(): PostExecutionThread

    fun loginRepository(): LoginRepository

    fun userRepository(): UserRepository
}