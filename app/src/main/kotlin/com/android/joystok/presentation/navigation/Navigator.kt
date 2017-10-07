package com.android.joystok.presentation.navigation

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.android.joystok.R.anim.*
import com.android.joystok.presentation.ui.category_detail.CategoryDetailActivity
import com.android.joystok.presentation.ui.customer_detail.CustomerDetailActivity
import com.android.joystok.presentation.ui.main.MainActivity
import com.android.joystok.presentation.ui.master_category.MasterCategoryActivity
import com.android.joystok.presentation.ui.master_customer.MasterCustomerActivity
import com.android.joystok.presentation.ui.master_menu.MasterMenuActivity
import com.android.joystok.utilities.Constants
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

fun navigateToMasterMenu(context: Context?) {
    if (context != null && context is Activity) {
        val activity = context
        val flags = context.flags(Intent.FLAG_ACTIVITY_NEW_TASK, Intent.FLAG_ACTIVITY_CLEAR_TOP)
        activity.start<MasterMenuActivity>(flags, right_in, left_out)
    }
}

fun navigateToMasterCategory(context: Context?) {
    if (context != null && context is Activity) {
        val activity = context
        val flags = context.flags(Intent.FLAG_ACTIVITY_NEW_TASK, Intent.FLAG_ACTIVITY_CLEAR_TOP)
        activity.start<MasterCategoryActivity>(flags, right_in, left_out)
    }
}

fun navigateToCategoryDetail(context: Context?, categoryId: Int, categoryName: String, remarks: String) {
    if (context != null && context is Activity) {
        val activity = context
        val flags = context.flags(Intent.FLAG_ACTIVITY_NEW_TASK, Intent.FLAG_ACTIVITY_CLEAR_TOP)
        val extras = Bundle()
        extras.putInt(Constants.IDS().CATEGORY_ID_KEY, categoryId)
        extras.putString(Constants.IDS().CATEGORY_NAME_KEY, categoryName)
        extras.putString(Constants.IDS().CATEGORY_REMARKS_KEY, remarks)
        activity.start<CategoryDetailActivity>(extras, flags, right_in, left_out)
    }
}

fun navigateToMasterCustomer(context: Context?) {
    if (context != null && context is Activity) {
        val activity = context
        val flags = context.flags(Intent.FLAG_ACTIVITY_NEW_TASK, Intent.FLAG_ACTIVITY_CLEAR_TOP)
        activity.start<MasterCustomerActivity>(flags, right_in, left_out)
    }
}

fun navigateToCustomerDetail(context: Context?, customerId: Int, name: String, phone: String, address: String, remarks: String) {
    if (context != null && context is Activity) {
        val activity = context
        val flags = context.flags(Intent.FLAG_ACTIVITY_NEW_TASK, Intent.FLAG_ACTIVITY_CLEAR_TOP)
        val extras = Bundle()
        extras.putInt(Constants.IDS().CUSTOMER_ID_KEY, customerId)
        extras.putString(Constants.IDS().CUSTOMER_NAME_KEY, name)
        extras.putString(Constants.IDS().CUSTOMER_PHONE_KEY, phone)
        extras.putString(Constants.IDS().CUSTOMER_ADDRESS_KEY, address)
        extras.putString(Constants.IDS().CUSTOMER_REMARKS_KEY, remarks)
        activity.start<CustomerDetailActivity>(extras, flags, right_in, left_out)
    }
}


//Navigate back
fun navigateBackToMainPage(context: Context?) {
    if (context != null && context is Activity) {
        val activity = context
        val flags = context.flags(Intent.FLAG_ACTIVITY_NEW_TASK, Intent.FLAG_ACTIVITY_CLEAR_TOP)
        activity.start<MainActivity>(flags, left_in, right_out)
    }
}

fun navigateBackToMasterMenu(context: Context?) {
    if (context != null && context is Activity) {
        val activity = context
        val flags = context.flags(Intent.FLAG_ACTIVITY_NEW_TASK, Intent.FLAG_ACTIVITY_CLEAR_TOP)
        activity.start<MasterMenuActivity>(flags, left_in, right_out)
    }
}

fun navigateBackToMasterCategoryPage(context: Context?) {
    if (context != null && context is Activity) {
        val activity = context
        val flags = context.flags(Intent.FLAG_ACTIVITY_NEW_TASK, Intent.FLAG_ACTIVITY_CLEAR_TOP)
        activity.start<MasterCategoryActivity>(flags, left_in, right_out)
    }
}

fun navigateBackToMasterCustomerPage(context: Context?) {
    if (context != null && context is Activity) {
        val activity = context
        val flags = context.flags(Intent.FLAG_ACTIVITY_NEW_TASK, Intent.FLAG_ACTIVITY_CLEAR_TOP)
        activity.start<MasterCustomerActivity>(flags, left_in, right_out)
    }
}