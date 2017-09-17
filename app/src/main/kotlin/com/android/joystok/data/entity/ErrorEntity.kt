package com.android.joystok.domain.model

import com.google.gson.annotations.Expose
import io.realm.RealmObject
import io.realm.annotations.RealmClass

/**
 * Created by Fauzi Arnami on 9/17/17.
 */

@RealmClass
open class ErrorEntity : RealmObject() {
    @Expose
    open var id = 0

    @Expose
    open var statusCode = 0

    @Expose
    open var name = ""

    @Expose
    open var message = ""

    @Expose
    open var code = ""
}