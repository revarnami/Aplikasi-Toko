package com.android.joystok.data.entity

import com.google.gson.annotations.Expose
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import io.realm.annotations.RealmClass

/**
 * Created by Fauzi Arnami on 10/7/17.
 */

@RealmClass
open class CustomerAPIEntity : RealmObject() {
    @PrimaryKey
    @Expose
    open var id = 0

    @Expose
    open var name = ""

    @Expose
    open var address = ""

    @Expose
    open var phone = ""

    @Expose
    open var remarks = ""
}