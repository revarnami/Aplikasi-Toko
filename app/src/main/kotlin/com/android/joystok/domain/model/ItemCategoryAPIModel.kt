package com.android.joystok.domain.model

import com.google.gson.annotations.Expose

/**
 * Created by Fauzi Arnami on 9/27/17.
 */

open class ItemCategoryAPIModel {
    open var id = 0

    @Expose
    open var categoryName = ""

    @Expose
    open var remarks = ""
}