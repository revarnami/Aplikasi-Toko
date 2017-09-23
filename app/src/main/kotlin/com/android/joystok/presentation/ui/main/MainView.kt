package com.android.joystok.presentation.ui.main

import android.content.Context

/**
 * Created by Fauzi Arnami on 9/23/17.
 */

interface MainView {
    val contextView: Context
    fun showWelcomeMessage(username: String)
}