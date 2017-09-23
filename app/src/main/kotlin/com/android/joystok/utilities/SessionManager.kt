package com.android.joystok.utilities

import android.content.Context
import android.content.SharedPreferences

/**
 * Created by Fauzi Arnami on 9/23/17.
 */

class SessionManager(context: Context) {
    private var pref: SharedPreferences
    private var editor: SharedPreferences.Editor
    private var _context: Context

    init {
        _context = context
        pref = _context.getSharedPreferences(Constants().PrefKey, Context.MODE_APPEND)
        editor = pref.edit()
    }

    private val keyUserId = "keyUserId"

    fun getUserId(): Int {
        return pref.getInt(keyUserId, 0)
    }

    fun setUserId(userId: Int) {
        editor.putInt(keyUserId, userId)
        editor.apply()
    }
}