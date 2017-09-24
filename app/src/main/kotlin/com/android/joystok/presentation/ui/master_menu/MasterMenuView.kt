package com.android.joystok.presentation.ui.master_menu

import android.content.Context

/**
 * Created by Fauzi Arnami on 9/23/17.
 */

interface MasterMenuView {
    val contextView: Context
    fun showWelcomeMessage(username: String)
}