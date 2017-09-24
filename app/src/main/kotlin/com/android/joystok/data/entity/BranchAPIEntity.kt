package com.android.joystok.data.entity

import com.google.gson.annotations.Expose
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import io.realm.annotations.RealmClass

/**
 * Created by Fauzi Arnami on 9/24/17.
 */

@RealmClass
open class BranchAPIEntity : RealmObject() {
    @PrimaryKey
    @Expose
    open var id = 0

    @Expose
    open var companyId = 0

    @Expose
    open var name = ""

    @Expose
    open var address = ""

    @Expose
    open var remarks = ""

    @Expose
    open var phone = ""
}