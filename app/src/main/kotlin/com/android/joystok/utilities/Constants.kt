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

    class IDS {
        val ADD_ID = -1
        val CATEGORY_ID_KEY = "CATEGORY_ID_KEY"
    }
}