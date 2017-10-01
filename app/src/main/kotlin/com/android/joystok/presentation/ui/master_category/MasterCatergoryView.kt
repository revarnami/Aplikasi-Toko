package com.android.joystok.presentation.ui.master_category

import com.android.joystok.domain.model.ItemCategoryAPIModel

/**
 * Created by Fauzi Arnami on 9/24/17.
 */

interface MasterCatergoryView {
    fun showListCategory(list: List<ItemCategoryAPIModel>)
}