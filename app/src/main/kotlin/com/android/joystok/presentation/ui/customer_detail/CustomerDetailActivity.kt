package com.android.joystok.presentation.ui.customer_detail

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.android.joystok.R
import com.android.joystok.presentation.AndroidApplication
import com.android.joystok.presentation.internal.di.components.ActivityComponent
import com.android.joystok.presentation.internal.di.components.DaggerActivityComponent
import com.android.joystok.presentation.internal.di.module.ActivityModule
import com.android.joystok.presentation.navigation.navigateBackToMasterCustomerPage
import com.android.joystok.utilities.Constants
import com.android.joystok.utilities.OnMessageAction
import com.android.joystok.utilities.Utils
import com.google.gson.JsonObject
import kotlinx.android.synthetic.main.activity_customer_detail.*
import org.json.JSONObject
import javax.inject.Inject

class CustomerDetailActivity : AppCompatActivity(), CustomerDetailView {
    private var customerId = 0
    private var name = ""
    private var phone = ""
    private var address = ""
    private var remarks = ""

    @Inject
    lateinit var presenter: CustomerDetailPresenter

    private val component: ActivityComponent
        get() = DaggerActivityComponent.builder()
                .applicationComponent((application as AndroidApplication).component)
                .activityModule(ActivityModule(this))
                .build()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_customer_detail)
        component.inject(this)
        presenter.view = this

        val extras = intent.extras
        customerId = extras.getInt(Constants.IDS().CUSTOMER_ID_KEY)
        name = extras.getString(Constants.IDS().CUSTOMER_NAME_KEY)
        phone = extras.getString(Constants.IDS().CUSTOMER_PHONE_KEY)
        address = extras.getString(Constants.IDS().CUSTOMER_ADDRESS_KEY)
        remarks = extras.getString(Constants.IDS().CUSTOMER_REMARKS_KEY)
        if (customerId == Constants.IDS().ADD_ID) {
            createUpdateCustomerBtn.text = getString(R.string.add)
            createUpdateCustomerBtn.setOnClickListener {
                name = customerDetailNameTV.text.toString()
                phone = customerDetailPhoneTV.text.toString()
                address = customerDetailAddressTV.text.toString()
                remarks = customerDetailRemarksTV.text.toString()
                presenter.addCustomer(name, phone, address, remarks)
            }
            deleteCustomerBtn.visibility = View.GONE
        } else {
            customerDetailNameTV.setText(name)
            customerDetailPhoneTV.setText(phone)
            customerDetailAddressTV.setText(address)
            customerDetailRemarksTV.setText(remarks)
            createUpdateCustomerBtn.text = getString(R.string.update)
            createUpdateCustomerBtn.setOnClickListener {
                name = customerDetailNameTV.text.toString()
                phone = customerDetailPhoneTV.text.toString()
                address = customerDetailAddressTV.text.toString()
                remarks = customerDetailRemarksTV.text.toString()
                val where = JSONObject()
                where.put("id", customerId)
                val data = JsonObject()
                data.addProperty("name", name)
                data.addProperty("phone", phone)
                data.addProperty("address", address)
                data.addProperty("remarks", remarks)
                presenter.updateCustomer(where, data)
            }
            deleteCustomerBtn.visibility = View.VISIBLE
            deleteCustomerBtn.setOnClickListener {
                presenter.deleteCategory(customerId)
            }
        }
    }

    override fun onBackPressed() {
        navigateBackToMasterCustomerPage(this)
    }

    override fun showMessage(message: String) {
        val onMessageAction = object : OnMessageAction {
            override fun onAction() {
                navigateBackToMasterCustomerPage(this@CustomerDetailActivity)
            }
        }
        Utils().snackBarMessageActionBlue(rootCustomerDetailCL, message, onMessageAction)
    }
}
