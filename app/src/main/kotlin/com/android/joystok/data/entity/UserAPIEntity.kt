package com.android.joystok.data.entity

import com.google.gson.annotations.Expose
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import io.realm.annotations.RealmClass

/**
 * Created by Fauzi Arnami on 9/23/17.
 */

@RealmClass
open class UserAPIEntity : RealmObject() {
    @PrimaryKey
    @Expose
    open var id = 0

    @Expose
    open var username = ""

    @Expose
    open var email = ""
}