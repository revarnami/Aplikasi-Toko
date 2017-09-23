package com.android.joystok.presentation.ui.login

import android.content.Context

/**
 * Created by Fauzi Arnami on 9/17/17.
 */

interface LoginView {
    val contextView: Context
    fun loginSuccess(id: Int)
    fun loginFailed()
}