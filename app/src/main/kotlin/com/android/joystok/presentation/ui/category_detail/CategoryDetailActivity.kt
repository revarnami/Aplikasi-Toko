package com.android.joystok.presentation.ui.category_detail

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.android.joystok.R
import com.android.joystok.presentation.AndroidApplication
import com.android.joystok.presentation.internal.di.components.ActivityComponent
import com.android.joystok.presentation.internal.di.components.DaggerActivityComponent
import com.android.joystok.presentation.internal.di.module.ActivityModule
import com.android.joystok.presentation.navigation.navigateBackToMasterCategoryPage
import com.android.joystok.utilities.Constants
import com.android.joystok.utilities.Utils
import kotlinx.android.synthetic.main.activity_category_detail.*
import javax.inject.Inject

class CategoryDetailActivity : AppCompatActivity(), CategoryDetailView {
    private val TAG = "CategoryDetailActivity"
    private var categoryId = 0
    private var categoryName = ""
    private var remarks = ""

    @Inject
    lateinit var presenter: CategoryDetailPresenter

    private val component: ActivityComponent
        get() = DaggerActivityComponent.builder()
                .applicationComponent((application as AndroidApplication).component)
                .activityModule(ActivityModule(this))
                .build()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category_detail)
        component.inject(this)
        presenter.view = this

        val extras = intent.extras
        categoryId = extras.getInt(Constants.IDS().CATEGORY_ID_KEY)
        categoryName = categoryDetailNameTV.text.toString()
        remarks = categoryDetailRemarksTV.text.toString()
        if (categoryId == Constants.IDS().ADD_ID) {
            createUpdateCategoryBtn.text = getString(R.string.add)
            createUpdateCategoryBtn.setOnClickListener {
                presenter.addCategory(categoryName, remarks)
            }
            deleteCategoryBtn.visibility = View.GONE
        } else {
            createUpdateCategoryBtn.text = getString(R.string.update)
            createUpdateCategoryBtn.setOnClickListener {
                presenter.updateCategory(categoryId, categoryName, remarks)
            }
            deleteCategoryBtn.visibility = View.VISIBLE
            deleteCategoryBtn.setOnClickListener {
                presenter.deleteCategory(categoryId)
            }
        }
    }

    override fun onBackPressed() {
        navigateBackToMasterCategoryPage(this)
    }

    override fun showMessage(message: String) {
        Utils().snackBarNoAction(rootCategoryDetailCL, message)
    }
}
