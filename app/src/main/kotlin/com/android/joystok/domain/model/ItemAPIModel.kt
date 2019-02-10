package com.android.joystok.domain.model

import java.io.Serializable

/**
 * Created by Fauzi Arnami on 10/8/17.
 */

open class ItemAPIModel : Serializable {
    open var id: Int? = -1
    open var itemCode: String? = ""
    open var categoryId: Int? = 0
    open var itemName: String? = ""
    open var supplier: String? = ""
    open var stock: Int? = 0
    open var basePrice: Int? = 0
    open var salePrice: Int? = 0
    open var remarks: String? = ""
    open var isVariant: Boolean? = false
    open var inactive: Boolean? = false
}