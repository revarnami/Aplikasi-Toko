package com.android.joystok.presentation.ui.main

import android.content.Context
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import com.android.joystok.R
import com.android.joystok.data.cache.DBHelper
import com.android.joystok.presentation.AndroidApplication
import com.android.joystok.presentation.internal.di.components.ActivityComponent
import com.android.joystok.presentation.internal.di.components.DaggerActivityComponent
import com.android.joystok.presentation.internal.di.module.ActivityModule
import com.android.joystok.presentation.navigation.navigateToMasterMenu
import com.android.joystok.utilities.Utils
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

/**
 * Created by Fauzi Arnami on 9/23/17.
 */

class MainActivity : AppCompatActivity(), MainView {

    override val contextView: Context
        get() = this

    private val component: ActivityComponent
        get() = DaggerActivityComponent.builder()
                .applicationComponent((application as AndroidApplication).component)
                .activityModule(ActivityModule(this))
                .build()

    @Inject
    lateinit var presenter: MainPresenter
    private var doubleBackToExitPressedOnce = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        component.inject(this)
        presenter.view = this
        presenter.onGetUser(DBHelper().getUserId())

        masterDataBtn.setOnClickListener {
            navigateToMasterMenu(this)
        }
    }

    override fun onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            finish()
            return
        }
        this.doubleBackToExitPressedOnce = true
        Utils().snackBarNoAction(rootMainCL, getString(R.string.backpress_message))
        Handler().postDelayed({ doubleBackToExitPressedOnce = false }, 2000)
    }

    override fun showWelcomeMessage(username: String) {
        welcomeNameTV.text = getString(R.string.welcome) + ", " + username
    }

    override fun showBranchInfo(branchName: String, company: String) {
        storeNameTV.text = branchName + ", " + company
    }
}