package com.android.joystok.domain.model

import com.android.joystok.data.entity.VariantStockAPIEntity

/**
 * Created by Fauzi Arnami on 10/14/17.
 */

open class ItemVariantAPIModel {
    open var id: Int = 0
    open var itemId: Int = 0
    open var variantName: String = ""
    open var itemVariantStock: VariantStockAPIEntity? = VariantStockAPIEntity()
}