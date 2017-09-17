package com.android.joystok.data.entity

import io.realm.RealmObject
import io.realm.annotations.RealmClass

/**
 * Created by Fauzi Arnami on 9/16/17.
 */

@RealmClass
open class LoginAPIEntity : RealmObject() {
    open var id = ""
}