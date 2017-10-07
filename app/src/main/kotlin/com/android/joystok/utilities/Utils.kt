package com.android.joystok.utilities

import android.graphics.Color
import android.support.design.widget.Snackbar
import android.support.v4.content.ContextCompat
import android.view.View

/**
 * Created by Fauzi Arnami on 9/17/17.
 */

class Utils {
    private var TAG = "Utils"
    private var snackbarMessage: Snackbar? = null

    private object Holder {
        val INSTANCE = Utils()
    }

    companion object {
        val INSTANCE: Utils by lazy { Holder.INSTANCE }
    }

    fun snackBarMessage(rootview: View, message: String) {
        if (!message.isNullOrBlank()) {
            snackbarMessage = Snackbar.make(rootview, message, Snackbar.LENGTH_INDEFINITE)
            snackbarMessage!!.setActionTextColor(Color.RED)
            snackbarMessage!!.setAction("OK", {
                snackbarMessage!!.dismiss()
            })
            snackbarMessage!!.show()
        } else {
            snackbarMessage = Snackbar.make(rootview, "null error message", Snackbar.LENGTH_INDEFINITE)
            snackbarMessage!!.setActionTextColor(Color.RED)
            snackbarMessage!!.setAction("OK", {
                snackbarMessage!!.dismiss()
            })
            snackbarMessage!!.show()
        }
    }

    fun dismissSnackbarMessage() {
        if (snackbarMessage != null) {
            snackbarMessage!!.dismiss()
        }
    }

    fun snackBarNoAction(rootview: View, message: String) {
        val snackbarMessage = Snackbar.make(rootview, message, Snackbar.LENGTH_LONG)
        snackbarMessage.show()
    }

    fun snackBarMessageActionBlue(rootview: View, message: String, onMessageAction: OnMessageAction) {
        val snackbarMessage = Snackbar.make(rootview, message, Snackbar.LENGTH_INDEFINITE)
        snackbarMessage.setActionTextColor(ContextCompat.getColor(rootview.context, android.R.color.holo_blue_light))
        snackbarMessage.setAction("OK", {
            snackbarMessage.dismiss()
            onMessageAction.onAction()
        })
        snackbarMessage.show()
    }
}