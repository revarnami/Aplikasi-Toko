package com.android.joystok.data.net

import com.android.joystok.BuildConfig
import com.android.joystok.data.entity.*
import com.android.joystok.domain.model.ItemCategoryAPIModel
import com.google.gson.Gson
import com.google.gson.JsonObject
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.json.JSONObject
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import rx.Observable
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by Fauzi Arnami on 9/16/17.
 */

@Singleton
class RestAPI
@Inject
constructor() {
    private val service: JoystokService

    init {
        val builder = OkHttpClient.Builder().addInterceptor(getLogginInterceptor())
        val retro = Retrofit.Builder().baseUrl(BuildConfig.SERVER_URL)
                .addConverterFactory(GsonConverterFactory.create(Gson()))
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(builder.build()).build()
        service = retro.create(JoystokService::class.java)
    }

    fun getLogginInterceptor(): Interceptor {
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY
        return interceptor
    }

    fun postLogin(username: String,
                  password: String
    ): Observable<LoginAPIEntity> {
        return service.postLogin(username, password)
    }

    fun getUser(id: String): Observable<UserAPIEntity> {
        return service.getUser(id)
    }

    fun getUserInfo(id: String): Observable<UserAPIEntity> {
        return service.getUserInfo(id)
    }

    fun getCompany(auth: String, id: Int): Observable<CompanyAPIEntity> {
        return service.getCompany(auth, id)
    }

    fun getBranch(auth: String, id: Int): Observable<BranchAPIEntity> {
        return service.getBranch(auth, id)
    }

    fun getItemCategoryList(auth: String, filter: JSONObject): Observable<List<ItemCategoryAPIModel>> {
        return service.getItemCategoryList(auth, filter)
    }

    fun postCategory(auth: String, categoryName: String, remarks: String): Observable<ItemCategoryAPIEntity> {
        return service.postCategory(auth, categoryName, remarks)
    }

    fun postUpdateCategory(auth: String, where: JSONObject, data: JsonObject): Observable<ItemCategoryAPIEntity> {
        return service.postUpdateCategory(auth, where, data)
    }

    fun deleteCategory(auth: String, id: Int): Observable<ItemCategoryAPIEntity> {
        return service.deleteCategory(auth, id)
    }

    fun findCategoryName(auth: String, categoryName: JSONObject): Observable<List<ItemCategoryAPIModel>> {
        return service.findCategoryName(auth, categoryName)
    }
}