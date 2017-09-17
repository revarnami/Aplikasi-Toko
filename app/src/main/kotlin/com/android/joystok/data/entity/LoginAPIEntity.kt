package com.android.joystok.data.entity

import com.google.gson.annotations.Expose
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import io.realm.annotations.RealmClass

/**
 * Created by Fauzi Arnami on 9/17/17.
 */

@RealmClass
open class LoginAPIEntity : RealmObject() {
    @PrimaryKey
    @Expose
    open var id = ""

    @Expose
    open var userId = 0

    @Expose
    open var ttl = 0

    @Expose
    open var created = ""
}