package com.android.joystok.data.cache

import com.android.joystok.data.entity.BranchAPIEntity
import com.android.joystok.data.entity.CompanyAPIEntity
import com.android.joystok.data.entity.LoginAPIEntity
import com.android.joystok.data.entity.UserAPIEntity
import com.android.joystok.utilities.Utils
import io.realm.Realm
import io.realm.RealmConfiguration
import io.realm.RealmQuery

/**
 * Created by djuarez on 16/6/16.
 */

class DBHelper {

    private object Holder {
        val INSTANCE = Utils()
    }

    companion object {
        val INSTANCE: Utils by lazy { Holder.INSTANCE }
    }

    lateinit var realm: Realm

    init {
        val config = RealmConfiguration.Builder()
                .name("JoyStik.realm")
                .schemaVersion(2)
                .deleteRealmIfMigrationNeeded()
                .build()

        realm = Realm.getInstance(config)
    }

    fun saveLogin(login: LoginAPIEntity) {
        realm.beginTransaction()
        realm.copyToRealmOrUpdate(login)
        realm.commitTransaction()
    }

    fun saveCompany(company: CompanyAPIEntity) {
        realm.beginTransaction()
        realm.copyToRealmOrUpdate(company)
        realm.commitTransaction()
    }

    fun saveUser(user: UserAPIEntity) {
        realm.beginTransaction()
        realm.copyToRealmOrUpdate(user)
        realm.commitTransaction()
    }

    fun saveBranch(branch: BranchAPIEntity) {
        realm.beginTransaction()
        realm.copyToRealmOrUpdate(branch)
        realm.commitTransaction()
    }

    fun updateUserInfo(companyId: Int, branchId: Int) {
        realm.beginTransaction()
        val user = realm.where(UserAPIEntity::class.java).findFirst()
        user.companyId = companyId
        user.branchId = branchId
        realm.commitTransaction()
    }

    fun getToken(): String {
        val savedUser: LoginAPIEntity? = RealmQuery.createQuery(realm, LoginAPIEntity::class.java)
                .findFirst()
        if (savedUser != null) {
            return savedUser.id
        }
        else {
            return ""
        }
    }

    fun getUserId(): Int {
        val savedUser: LoginAPIEntity? = RealmQuery.createQuery(realm, LoginAPIEntity::class.java)
                .findFirst()
        if (savedUser != null) {
            return savedUser.userId
        }
        else {
            return 0
        }
    }

    fun getBranchName(): String {
        val savedBranch: BranchAPIEntity? = RealmQuery.createQuery(realm, BranchAPIEntity::class.java)
                .findFirst()
        if (savedBranch != null) {
            return savedBranch.name
        }
        else {
            return ""
        }
    }
}
