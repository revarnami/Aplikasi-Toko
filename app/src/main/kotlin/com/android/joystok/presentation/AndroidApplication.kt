package com.android.joystok.presentation

import android.app.Application
import com.android.joystok.presentation.internal.di.components.ApplicationComponent
import com.android.joystok.presentation.internal.di.components.DaggerApplicationComponent
import com.android.joystok.presentation.internal.di.module.ApplicationModule
import io.realm.Realm

/**
 * Created by Fauzi Arnami on 9/17/17.
 */

class AndroidApplication : Application() {
    private val TAG = "AndroidApplication"

    val component: ApplicationComponent
        get() = DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this))
                .build()

    lateinit var realm: Realm

    override fun onCreate() {
        super.onCreate()
        initRealm()
        component.inject(this)
    }

    private fun initRealm() {
        Realm.init(this)
//        try {
//            try {
//                val crypt = Encryptions()
//                val hashKey = crypt.SHA256(Encryptions.Keys.REALM_KEY, 64)
//                val key = hashKey.toByteArray()
//                val realmConfiguration = RealmConfiguration.Builder()
//                        .encryptionKey(key)
//                        .schemaVersion(2)
//                        .build()
//
//                // Start with a clean slate every time
//                Realm.deleteRealm(realmConfiguration)
//                Realm.setDefaultConfiguration(realmConfiguration)
//                // Open the Realm with encryption enabled
//                realm = Realm.getInstance(realmConfiguration)
//            } catch (e: Exception) {
//                e.printStackTrace()
//                Log.e(TAG, e.message)
//            }
//
//        } catch (ex: RealmMigrationNeededException) {
//            ex.printStackTrace()
//            Log.e(TAG, ex.message)
//        }
//        realm = Realm.getDefaultInstance()
    }
}