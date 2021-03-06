package com.android.joystok.presentation.internal.di.components

import com.android.joystok.presentation.internal.di.module.ActivityModule
import com.android.joystok.presentation.internal.di.scope.PerActivity
import com.android.joystok.presentation.ui.category_detail.CategoryDetailActivity
import com.android.joystok.presentation.ui.customer_detail.CustomerDetailActivity
import com.android.joystok.presentation.ui.item_detail.ItemDetailActivity
import com.android.joystok.presentation.ui.login.LoginActivity
import com.android.joystok.presentation.ui.main.MainActivity
import com.android.joystok.presentation.ui.master_category.MasterCategoryActivity
import com.android.joystok.presentation.ui.master_customer.MasterCustomerActivity
import com.android.joystok.presentation.ui.master_item.MasterItemActivity
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
    fun inject(masterCategoryActivity: MasterCategoryActivity)
    fun inject(masterCategoryActivity: MasterCustomerActivity)
    fun inject(masterItemActivity: MasterItemActivity)
    fun inject(categoryDetailActivity: CategoryDetailActivity)
    fun inject(customerDetailActivity: CustomerDetailActivity)
    fun inject(itemDetailActivity: ItemDetailActivity)
}