package com.android.joystok.utilities

/**
 * Created by Fauzi Arnami on 9/17/17.
 */

class Constants {
    private object Holder {
        val INSTANCE = Constants()
    }

    companion object {
        val instance: Constants by lazy { Holder.INSTANCE }
    }

    val PrefKey = "SessionJoyStok"
}