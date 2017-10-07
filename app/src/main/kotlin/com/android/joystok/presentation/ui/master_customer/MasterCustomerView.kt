package com.android.joystok.presentation.ui.master_customer

import com.android.joystok.domain.model.CustomerAPIModel

/**
 * Created by Fauzi Arnami on 10/7/17.
 */

interface MasterCustomerView {
    fun showListCustomer(list: List<CustomerAPIModel>)
}