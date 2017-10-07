package com.android.joystok.presentation.ui.master_menu

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.android.joystok.R
import com.android.joystok.data.cache.DBHelper
import com.android.joystok.presentation.AndroidApplication
import com.android.joystok.presentation.internal.di.components.ActivityComponent
import com.android.joystok.presentation.internal.di.components.DaggerActivityComponent
import com.android.joystok.presentation.internal.di.module.ActivityModule
import com.android.joystok.presentation.navigation.navigateBackToMainPage
import com.android.joystok.presentation.navigation.navigateToMasterCategory
import com.android.joystok.presentation.navigation.navigateToMasterCustomer
import kotlinx.android.synthetic.main.activity_master_menu.*
import javax.inject.Inject

class MasterMenuActivity : AppCompatActivity(), MasterMenuView {

    @Inject
    lateinit var presenter: MasterMenuPresenter

    override val contextView: Context
        get() = this

    private val component: ActivityComponent
        get() = DaggerActivityComponent.builder()
                .applicationComponent((application as AndroidApplication).component)
                .activityModule(ActivityModule(this))
                .build()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_master_menu)
        component.inject(this)
        presenter.view = this
        presenter.onGetUser(DBHelper().getUserId())

        masterCategoryBtn.setOnClickListener {
            navigateToMasterCategory(this)
        }
        masterCustomerBtn.setOnClickListener {
            navigateToMasterCustomer(this)
        }
    }

    override fun onBackPressed() {
        navigateBackToMainPage(this)
    }

    override fun showWelcomeMessage(username: String) {
        welcomeNameTV.text = getString(R.string.welcome) + ", " + username
    }

    override fun showBranchInfo(branchName: String, company: String) {
        storeNameTV.text = "$branchName, $company"
    }
}
