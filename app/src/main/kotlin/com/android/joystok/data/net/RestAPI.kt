package com.android.joystok.data.net

import com.android.joystok.BuildConfig
import com.android.joystok.data.entity.*
import com.android.joystok.domain.model.CustomerAPIModel
import com.android.joystok.domain.model.ItemAPIModel
import com.android.joystok.domain.model.ItemCategoryAPIModel
import com.android.joystok.domain.model.ItemVariantAPIModel
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
    ): Observable<LoginAPIEntity> = service.postLogin(username, password)

    fun getUser(id: String): Observable<UserAPIEntity> = service.getUser(id)

    fun getUserInfo(id: String): Observable<UserAPIEntity> = service.getUserInfo(id)

    fun getCompany(auth: String, id: Int): Observable<CompanyAPIEntity> = service.getCompany(auth, id)

    fun getBranch(auth: String, id: Int): Observable<BranchAPIEntity> = service.getBranch(auth, id)

    fun getItemCategoryList(auth: String, filter: JSONObject): Observable<List<ItemCategoryAPIModel>> = service.getItemCategoryList(auth, filter)

    fun postCategory(auth: String, categoryName: String, remarks: String): Observable<ItemCategoryAPIEntity> = service.postCategory(auth, categoryName, remarks)

    fun postUpdateCategory(auth: String, where: JSONObject, data: JsonObject): Observable<ItemCategoryAPIEntity> = service.postUpdateCategory(auth, where, data)

    fun deleteCategory(auth: String, id: Int): Observable<ItemCategoryAPIEntity> = service.deleteCategory(auth, id)

    fun findCategoryName(auth: String, categoryName: JSONObject): Observable<List<ItemCategoryAPIModel>> = service.findCategoryName(auth, categoryName)

    fun getCustomerList(auth: String, filter: JSONObject): Observable<List<CustomerAPIModel>> = service.getCustomerList(auth, filter)

    fun postCustomer(auth: String, name: String, phone: String, address: String, remarks: String): Observable<CustomerAPIEntity> =
            service.postCustomer(auth, name, phone, address, remarks)

    fun postUpdateCustomer(auth: String, where: JSONObject, data: JsonObject): Observable<CustomerAPIEntity> = service.postUpdateCustomer(auth, where, data)

    fun deleteCustomer(auth: String, id: Int): Observable<CustomerAPIEntity> = service.deleteCustomer(auth, id)

    fun getItemList(auth: String, filter: JSONObject): Observable<List<ItemAPIModel>> = service.getItemList(auth, filter)

    fun postItem(auth: String, data: JsonObject): Observable<ItemAPIEntity> = service.postItem(auth, data)

    fun postItemVariant(auth: String, itemId: Int, variantName: String): Observable<ItemVariantAPIEntity> = service.postItemVariant(auth, itemId, variantName)

    fun postVariantStock(authorization: String,
                         itemVariantId: Int,
                         quantity: Int,
                         branchId: Int
    ): Observable<VariantStockAPIEntity> = service.postItemVariantStock(authorization, itemVariantId, quantity, branchId)

    fun getCategoryByItemId(auth: String, id: String): Observable<ItemCategoryAPIEntity> = service.getItemCategoryByItemId(auth, id)

    fun getVariantByItemId(auth: String, id: String): Observable<List<ItemVariantAPIModel>> = service.getVariantByItemId(auth, id)

    fun getStockByVariantId(auth: String, id: String): Observable<VariantStockAPIEntity> = service.getStockByVariantId(auth, id)
}