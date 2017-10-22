package com.android.joystok.data.entity

import com.google.gson.annotations.Expose
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import io.realm.annotations.RealmClass

/**
 * Created by Fauzi Arnami on 10/8/17.
 */

@RealmClass
open class ItemVariantAPIEntity : RealmObject() {
    @PrimaryKey
    @Expose
    open var id: Int = 0

    @Expose
    open var itemId: Int = 0

    @Expose
    open var variantName: String = ""

    @Expose
    open var itemVariantStock: VariantStockAPIEntity? = VariantStockAPIEntity()
}