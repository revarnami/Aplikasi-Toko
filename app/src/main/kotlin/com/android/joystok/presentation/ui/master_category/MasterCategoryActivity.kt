package com.android.joystok.presentation.ui.master_category

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.SearchView
import android.view.Menu
import android.view.View
import com.android.joystok.R
import com.android.joystok.domain.model.ItemCategoryAPIModel
import com.android.joystok.presentation.AndroidApplication
import com.android.joystok.presentation.internal.di.components.ActivityComponent
import com.android.joystok.presentation.internal.di.components.DaggerActivityComponent
import com.android.joystok.presentation.internal.di.module.ActivityModule
import com.android.joystok.presentation.navigation.navigateToCategoryDetail
import com.android.joystok.utilities.Constants
import kotlinx.android.synthetic.main.activity_master_category.*
import javax.inject.Inject

class MasterCategoryActivity : AppCompatActivity(), MasterCatergoryView {
    private val TAG = "MasterCategoryActivity"

    @Inject
    lateinit var presenter: MasterCategoryPresenter

    private val component: ActivityComponent
        get() = DaggerActivityComponent.builder()
                .applicationComponent((application as AndroidApplication).component)
                .activityModule(ActivityModule(this))
                .build()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_master_category)
        component.inject(this)
        presenter.view = this
        presenter.onGetList()
        setupToolbar()

        masterCategoryFAB.setOnClickListener {
            navigateToCategoryDetail(this, Constants.IDS().ADD_ID)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.master_category_menu, menu)
        val myActionMenuItem = menu?.findItem(R.id.search)
        val searchView = myActionMenuItem?.actionView as SearchView
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String): Boolean {
                if (!searchView.isIconified) {
                    searchView.isIconified = true
                }
                myActionMenuItem.collapseActionView()
                return false
            }

            override fun onQueryTextChange(s: String): Boolean {
                //Do Search
                return false
            }
        })
        return true
    }

    override fun showListCategory(list: List<ItemCategoryAPIModel>) {
        masterCategoryRV.visibility = View.VISIBLE
        masterCategoryRV.setHasFixedSize(true)
        val llm = LinearLayoutManager(this)
        masterCategoryRV.layoutManager = llm
        val adapter = MasterCategoryRVAdapter(this, list)
        masterCategoryRV.adapter = adapter
    }

    private fun setupToolbar() {
        setSupportActionBar(masterCategoryToolbar)
        supportActionBar?.setDisplayShowTitleEnabled(true)
        title = getString(R.string.master_category)
    }
}
