package com.android.joystok.presentation.ui.master_item

import com.android.joystok.domain.model.ItemAPIModel

/**
 * Created by Fauzi Arnami on 10/8/17.
 */

interface MasterItemView {
    fun showListItem(list: List<ItemAPIModel>)
}