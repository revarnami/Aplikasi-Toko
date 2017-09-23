package com.android.joystok.presentation.navigation

import android.app.Activity
import android.content.Context
import android.content.Intent
import com.android.joystok.R.anim.left_out
import com.android.joystok.R.anim.right_in
import com.android.joystok.presentation.ui.main.MainActivity
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by Fauzi Arnami on 9/17/17.
 */

@Singleton
class Navigator
@Inject
constructor()

/**
 * Goes to the user list screen.

 * @param context A Context needed to open the destiny activity.
 */

fun navigateToMainPage(context: Context?) {
    if (context != null && context is Activity) {
        val activity = context
        val flags = context.flags(Intent.FLAG_ACTIVITY_NEW_TASK, Intent.FLAG_ACTIVITY_CLEAR_TOP)
        activity.start<MainActivity>(flags, right_in, left_out)
    }
}