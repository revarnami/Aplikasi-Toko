package com.android.joystok.presentation.ui.item_detail

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.android.joystok.R
import com.android.joystok.data.cache.DBHelper
import com.android.joystok.domain.model.ItemAPIModel
import com.android.joystok.domain.model.ItemCategoryAPIModel
import com.android.joystok.domain.model.ItemVariantAPIModel
import com.android.joystok.presentation.AndroidApplication
import com.android.joystok.presentation.internal.di.components.ActivityComponent
import com.android.joystok.presentation.internal.di.components.DaggerActivityComponent
import com.android.joystok.presentation.internal.di.module.ActivityModule
import com.android.joystok.presentation.navigation.navigateBackToMasterItemPage
import com.android.joystok.utilities.Constants
import com.android.joystok.utilities.OnMessageAction
import com.android.joystok.utilities.Utils
import com.google.gson.JsonArray
import com.google.gson.JsonObject
import kotlinx.android.synthetic.main.activity_item_detail.*
import org.json.JSONObject
import javax.inject.Inject

class ItemDetailActivity : AppCompatActivity(), ItemDetailView, AdapterView.OnItemSelectedListener {
    private val TAG = "ItemDetailActivity"
    private var itemId: Int = 0
    private var itemCode: String = ""
    private var categoryId: Int = 1
    private var itemName: String = ""
    private var basePrice: Int = 0
    private var salePrice: Int = 0
    private var isVariant: Boolean = false
    private var inactive: Boolean = true
    private var remarks: String = ""
    private var quantity: Int = 0
    private var itemModel: ItemAPIModel = ItemAPIModel()

    @Inject
    lateinit var presenter: ItemDetailPresenter
    lateinit var categories: Array<String>

    private val component: ActivityComponent
        get() = DaggerActivityComponent.builder()
                .applicationComponent((application as AndroidApplication).component)
                .activityModule(ActivityModule(this))
                .build()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item_detail)
        component.inject(this)
        presenter.view = this
        val filter = JSONObject()
        filter.put("categoryName", "")
//        presenter.getCategoryList(filter)
        val extras = intent.extras
        itemModel = extras.getSerializable(Constants.IDS().ITEM_MODEL_KEY) as ItemAPIModel
        itemId = itemModel.id!!
        Log.e(TAG, "onCreate: itemId = ${itemModel.id}")
        if (itemId == Constants.IDS().ADD_ID) {
            isVariantItemDetailCB.visibility = View.GONE
            addItemVariantBtn.visibility = View.GONE
            itemVarianDetailRV.visibility = View.GONE
            stockItemDetailET.visibility = View.VISIBLE
            addUpdateItemBtn.text = getString(R.string.add_item)
        } else {
            Log.e(TAG, "onCreate: itemCode = ${itemModel.itemCode}")
            itemCodeItemDetailET.setText(itemModel.itemCode)
            itemNameItemDetailET.setText(itemModel.itemName)
            //combobox
            salePriceItemDetailET.setText(itemModel.salePrice.toString())
            basePriceItemDetailET.setText(itemModel.basePrice.toString())
            addUpdateItemBtn.text = getString(R.string.update_item)
//            isVariantItemDetailCB.visibility = View.VISIBLE
            isVariantItemDetailCB.setOnCheckedChangeListener { compoundButton, isChecked ->
                if (isChecked) {
                    stockItemDetailET.visibility = View.GONE
                    addItemVariantBtn.visibility = View.VISIBLE
                    itemVarianDetailRV.visibility = View.VISIBLE
                } else {
                    stockItemDetailET.visibility = View.VISIBLE
                    addItemVariantBtn.visibility = View.GONE
                    itemVarianDetailRV.visibility = View.GONE
                }
            }
            stockItemDetailET.setText(itemModel.stock.toString())
            supplierItemDetailET.setText(itemModel.supplier)
            isVariantItemDetailCB.isChecked = itemModel.isVariant!!
        }

        addUpdateItemBtn.setOnClickListener {
            itemCode = itemCodeItemDetailET.text.toString()
            itemName = itemNameItemDetailET.text.toString()
            basePrice = basePriceItemDetailET.text.toString().toInt()
            salePrice = salePriceItemDetailET.text.toString().toInt()
            quantity = stockItemDetailET.text.toString().toInt()
            val itemVariantStock = JsonObject()
            itemVariantStock.addProperty("branchId", DBHelper().getBranchId())
            itemVariantStock.addProperty("quantity", quantity)
            val itemVariantObj = JsonObject()
            itemVariantObj.addProperty("variantName", "")
            itemVariantObj.add("itemVariantStock", itemVariantStock)
            val itemVariants = JsonArray()
            itemVariants.add(itemVariantObj)
            val data = JsonObject()
            data.addProperty("itemCode", itemCode)
            data.addProperty("itemName", itemName)
            data.addProperty("categoryId", 33)
            data.addProperty("basePrice", basePrice)
            data.addProperty("salePrice", salePrice)
            data.addProperty("remarks", remarks)
            data.addProperty("inactive", true)
            isVariant = isVariantItemDetailCB.isChecked
            data.addProperty("isVariant", isVariant)
            data.add("itemVariant", itemVariants)
            presenter.addItem(data)
        }
    }

    override fun onBackPressed() {
        navigateBackToMasterItemPage(this)
    }

    override fun showMessage(message: String) {
        val onMessageAction = object : OnMessageAction {
            override fun onAction() {
                navigateBackToMasterItemPage(this@ItemDetailActivity)
            }
        }
        Utils().snackBarMessageActionBlue(rootItemDetailCL, message, onMessageAction)
    }

    override fun insertComboBox(list: List<ItemCategoryAPIModel>) {
        categories = Array<String>(list.size, { i -> list[i].categoryName })
        val categoryAdapter = ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, categories)
        categoryAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        itemCategoryItemDetailSP.adapter = categoryAdapter
        itemCategoryItemDetailSP.onItemSelectedListener = this
        if (itemId >= 0) {
            presenter.categoryByItemId(itemId.toString())
        }
    }

    override fun categorySetSelection(categoryName: String) {
        val i = categories.indexOf(categoryName)
        itemCategoryItemDetailSP.setSelection(i)
        presenter.variantByItemId(itemId.toString())
    }

    override fun showStock(quantity: Int) {
        stockItemDetailET.setText(quantity.toString())
    }

    override fun showVariantList(list: List<ItemVariantAPIModel>) {
        itemVarianDetailRV.visibility = View.VISIBLE
        itemVarianDetailRV.setHasFixedSize(true)
        val llm = LinearLayoutManager(this)
        itemVarianDetailRV.layoutManager = llm
        val adapter = VariantRVAdapter(this, list)
        itemVarianDetailRV.adapter = adapter
    }

    override fun onNothingSelected(p0: AdapterView<*>?) {

    }

    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
        Log.e(TAG, "onItemSelected: index = $p2")
    }
}
