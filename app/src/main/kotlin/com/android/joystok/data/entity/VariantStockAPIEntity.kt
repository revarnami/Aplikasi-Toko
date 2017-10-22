package com.android.joystok.data.entity

import com.google.gson.annotations.Expose
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import io.realm.annotations.RealmClass

/**
 * Created by Fauzi Arnami on 10/14/17.
 */

@RealmClass
open class VariantStockAPIEntity : RealmObject() {
    @PrimaryKey
    @Expose
    open var id = 0

    @Expose
    open var itemVariantId = 0

    @Expose
    open var quantity = 0

    @Expose
    open var branchId = 0
}