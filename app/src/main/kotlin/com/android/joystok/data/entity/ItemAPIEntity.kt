package com.android.joystok.data.entity

import com.google.gson.annotations.Expose
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import io.realm.annotations.RealmClass

/**
 * Created by Fauzi Arnami on 10/8/17.
 */

@RealmClass
open class ItemAPIEntity : RealmObject() {
    @PrimaryKey
    @Expose
    open var id: Int? = 0

    @Expose
    open var itemCode: String? = ""

    @Expose
    open var categoryId: Int? = 0

    @Expose
    open var itemName: String? = ""

    @Expose
    open var supplier: String? = ""

    @Expose
    open var basePrice: Int? = 0

    @Expose
    open var salePrice: Int? = 0

    @Expose
    open var stock: Int? = 0

    @Expose
    open var remarks: String? = ""

    @Expose
    open var isVariant: Boolean? = false

    @Expose
    open var inactive: Boolean? = false
}