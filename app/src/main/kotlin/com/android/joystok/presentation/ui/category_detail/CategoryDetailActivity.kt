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
import com.android.joystok.utilities.OnMessageAction
import com.android.joystok.utilities.Utils
import kotlinx.android.synthetic.main.activity_category_detail.*
import org.json.JSONObject
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
        categoryName = extras.getString(Constants.IDS().CATEGORY_NAME_KEY)
        remarks = extras.getString(Constants.IDS().REMARKS_KEY)
        if (categoryId == Constants.IDS().ADD_ID) {
            createUpdateCategoryBtn.text = getString(R.string.add)
            createUpdateCategoryBtn.setOnClickListener {
                categoryName = categoryDetailNameTV.text.toString()
                remarks = categoryDetailRemarksTV.text.toString()
                categoryName = categoryDetailNameTV.text.toString()
                presenter.addCategory(categoryName, remarks)
            }
            deleteCategoryBtn.visibility = View.GONE
        } else {
            categoryDetailNameTV.setText(categoryName)
            categoryDetailRemarksTV.setText(remarks)
            createUpdateCategoryBtn.text = getString(R.string.update)
            createUpdateCategoryBtn.setOnClickListener {
                categoryName = categoryDetailNameTV.text.toString()
                remarks = categoryDetailRemarksTV.text.toString()
                val where = JSONObject()
                where.put("id", categoryId)
                presenter.updateCategory(where, categoryName, remarks, categoryId)
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
        val onMessageAction = object : OnMessageAction {
            override fun onAction() {
                navigateBackToMasterCategoryPage(this@CategoryDetailActivity)
            }
        }
        Utils().snackBarMessageActionBlue(rootCategoryDetailCL, message, onMessageAction)
    }
}
