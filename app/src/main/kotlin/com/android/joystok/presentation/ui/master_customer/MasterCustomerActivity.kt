package com.android.joystok.presentation.ui.master_customer

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.SearchView
import android.view.Menu
import android.view.View
import com.android.joystok.R
import com.android.joystok.domain.model.CustomerAPIModel
import com.android.joystok.presentation.AndroidApplication
import com.android.joystok.presentation.internal.di.components.ActivityComponent
import com.android.joystok.presentation.internal.di.components.DaggerActivityComponent
import com.android.joystok.presentation.internal.di.module.ActivityModule
import com.android.joystok.presentation.navigation.navigateBackToMasterMenu
import com.android.joystok.presentation.navigation.navigateToCustomerDetail
import com.android.joystok.utilities.Constants
import kotlinx.android.synthetic.main.activity_master_customer.*
import org.json.JSONObject
import javax.inject.Inject

class MasterCustomerActivity : AppCompatActivity(), MasterCustomerView {
    private val TAG = "MasterCategoryActivity"

    @Inject
    lateinit var presenter: MasterCustomerPresenter

    private val component: ActivityComponent
        get() = DaggerActivityComponent.builder()
                .applicationComponent((application as AndroidApplication).component)
                .activityModule(ActivityModule(this))
                .build()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_master_customer)
        component.inject(this)
        presenter.view = this
        val filter = JSONObject()
        filter.put("name", "")
        presenter.onGetList(filter)
        setupToolbar()

        masterCustomerFAB.setOnClickListener {
            navigateToCustomerDetail(this, Constants.IDS().ADD_ID, "", "", "", "")
        }
    }

    override fun onBackPressed() {
        navigateBackToMasterMenu(this)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.master_customer_menu, menu)
        val myActionMenuItem = menu?.findItem(R.id.search)
        val searchView = myActionMenuItem?.actionView as SearchView
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String): Boolean {
                if (!searchView.isIconified) {
                    searchView.isIconified = true
                }
                myActionMenuItem.collapseActionView()
                val filter = JSONObject()
                filter.put("name", query)
                presenter.onGetList(filter)
                return false
            }

            override fun onQueryTextChange(s: String): Boolean {
                //Do Search
                return false
            }
        })
        return true
    }

    override fun showListCustomer(list: List<CustomerAPIModel>) {
        masterCustomerRV.visibility = View.VISIBLE
        masterCustomerRV.setHasFixedSize(true)
        val llm = LinearLayoutManager(this)
        masterCustomerRV.layoutManager = llm
        val adapter = MasterCustomerRVAdapter(this, list)
        masterCustomerRV.adapter = adapter
    }

    private fun setupToolbar() {
        setSupportActionBar(masterCustomerToolbar)
        supportActionBar?.setDisplayShowTitleEnabled(true)
        title = getString(R.string.master_customer)
    }
}
