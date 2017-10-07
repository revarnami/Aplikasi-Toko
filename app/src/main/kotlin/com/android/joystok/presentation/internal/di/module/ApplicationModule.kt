package com.android.joystok.presentation.internal.di.module

import android.content.Context
import android.content.SharedPreferences
import com.android.joystok.data.executor.JobExecutor
import com.android.joystok.data.repository.*
import com.android.joystok.domain.executor.PostExecutionThread
import com.android.joystok.domain.executor.ThreadExecutor
import com.android.joystok.domain.repository.*
import com.android.joystok.presentation.AndroidApplication
import com.android.joystok.presentation.UIThread
import com.android.joystok.utilities.Constants
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by Fauzi Arnami on 9/17/17.
 */

@Module
class ApplicationModule(private val androidApplication: AndroidApplication) {
    @Provides
    @Singleton
    fun application(): AndroidApplication {
        return androidApplication
    }

    @Provides
    @Singleton
    fun provideApplicationContext(): Context {
        return androidApplication
    }

    @Provides
    @Singleton
    fun provideSharedPreferences(): SharedPreferences {
        return androidApplication.getSharedPreferences(Constants().PrefKey, Context.MODE_APPEND)
    }

    @Provides
    @Singleton
    fun provideSharedPreferencesEditor(): SharedPreferences.Editor {
        return androidApplication.getSharedPreferences(Constants().PrefKey, Context.MODE_APPEND).edit()
    }

    @Provides
    @Singleton
    fun provideThreadExecutor(jobExecutor: JobExecutor): ThreadExecutor {
        return jobExecutor
    }

    @Provides
    @Singleton
    fun providePostExecutionThread(uiThread: UIThread): PostExecutionThread {
        return uiThread
    }

    @Provides
    @Singleton
    fun provideLoginRepository(dataRepository: LoginDataRepository): LoginRepository {
        return dataRepository
    }

    @Provides
    @Singleton
    fun provideUserRepository(dataRepository: UserDataRepository): UserRepository {
        return dataRepository
    }

    @Provides
    @Singleton
    fun provideCompanyRepository(dataRepository: CompanyDataRepository): CompanyRepository {
        return dataRepository
    }

    @Provides
    @Singleton
    fun provideBranchRepository(dataRepository: BranchDataRepository): BranchRepository {
        return dataRepository
    }

    @Provides
    @Singleton
    fun provideItemCategoryRepository(dataRepository: CategoryDataRepository): ItemCategoryRepository {
        return dataRepository
    }

    @Provides
    @Singleton
    fun provideCustomerRepository(dataRepository: CustomerDataRepository): CustomerRepository {
        return dataRepository
    }
}