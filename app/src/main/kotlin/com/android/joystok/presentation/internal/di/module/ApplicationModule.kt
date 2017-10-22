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
    fun application(): AndroidApplication = androidApplication

    @Provides
    @Singleton
    fun provideApplicationContext(): Context = androidApplication

    @Provides
    @Singleton
    fun provideSharedPreferences(): SharedPreferences = androidApplication.getSharedPreferences(Constants().PrefKey, Context.MODE_APPEND)

    @Provides
    @Singleton
    fun provideSharedPreferencesEditor(): SharedPreferences.Editor = androidApplication.getSharedPreferences(Constants().PrefKey, Context.MODE_APPEND).edit()

    @Provides
    @Singleton
    fun provideThreadExecutor(jobExecutor: JobExecutor): ThreadExecutor = jobExecutor

    @Provides
    @Singleton
    fun providePostExecutionThread(uiThread: UIThread): PostExecutionThread = uiThread

    @Provides
    @Singleton
    fun provideLoginRepository(dataRepository: LoginDataRepository): LoginRepository = dataRepository

    @Provides
    @Singleton
    fun provideUserRepository(dataRepository: UserDataRepository): UserRepository = dataRepository

    @Provides
    @Singleton
    fun provideCompanyRepository(dataRepository: CompanyDataRepository): CompanyRepository = dataRepository

    @Provides
    @Singleton
    fun provideBranchRepository(dataRepository: BranchDataRepository): BranchRepository = dataRepository

    @Provides
    @Singleton
    fun provideItemCategoryRepository(dataRepository: CategoryDataRepository): ItemCategoryRepository = dataRepository

    @Provides
    @Singleton
    fun provideCustomerRepository(dataRepository: CustomerDataRepository): CustomerRepository = dataRepository

    @Provides
    @Singleton
    fun provideItemRepository(dataRepository: ItemDataRepository): ItemRepository = dataRepository

    @Provides
    @Singleton
    fun provideItemVariantRepository(dataRepository: ItemVariantDataRepository): ItemVariantRepository = dataRepository

    @Provides
    @Singleton
    fun provideVariantStockRepository(dataRepository: VariantStockDataRepository): VariantStockRepository = dataRepository
}