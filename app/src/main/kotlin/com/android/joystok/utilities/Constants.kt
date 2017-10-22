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
        val CATEGORY_NAME_KEY = "CATEGORY_NAME_KEY"
        val CATEGORY_REMARKS_KEY = "CATEGORY_REMARKS_KEY"

        val CUSTOMER_ID_KEY = "CUSTOMER_ID_KEY"
        val CUSTOMER_NAME_KEY = "CUSTOMER_NAME_KEY"
        val CUSTOMER_PHONE_KEY = "CUSTOMER_PHONE_KEY"
        val CUSTOMER_ADDRESS_KEY = "CUSTOMER_ADDRESS_KEY"
        val CUSTOMER_REMARKS_KEY = "CUSTOMER_REMARKS_KEY"

        val ITEM_MODEL_KEY = "ITEM_MODEL_KEY"
    }
}