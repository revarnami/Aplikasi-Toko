package com.android.joystok.presentation.ui.item_detail

import com.android.joystok.domain.model.ItemCategoryAPIModel

/**
 * Created by Fauzi Arnami on 10/14/17.
 */

interface ItemDetailView {
    fun showMessage(message: String)
    fun insertComboBox(list: List<ItemCategoryAPIModel>)
    fun categorySetSelection(categoryName: String)
    fun showStock(quantity: Int)
}