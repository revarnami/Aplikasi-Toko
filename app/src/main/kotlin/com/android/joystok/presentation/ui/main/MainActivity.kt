package com.android.joystok.presentation.ui.main

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.android.joystok.R
import com.android.joystok.presentation.AndroidApplication
import com.android.joystok.presentation.internal.di.components.ActivityComponent
import com.android.joystok.presentation.internal.di.components.DaggerActivityComponent
import com.android.joystok.presentation.internal.di.module.ActivityModule
import com.android.joystok.utilities.SessionManager
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
    lateinit var session: SessionManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        component.inject(this)
        presenter.view = this
        session = SessionManager(this)
        presenter.onGetUser(session.getUserId())
    }

    override fun showWelcomeMessage(username: String) {
        welcomeNameTV.text = getString(R.string.welcome) + ", " + username
    }
}