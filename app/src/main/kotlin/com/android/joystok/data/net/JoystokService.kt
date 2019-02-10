package com.android.joystok.data.net

import com.android.joystok.data.entity.*
import com.android.joystok.domain.model.CustomerAPIModel
import com.android.joystok.domain.model.ItemAPIModel
import com.android.joystok.domain.model.ItemCategoryAPIModel
import com.android.joystok.domain.model.ItemVariantAPIModel
import com.google.gson.JsonObject
import org.json.JSONObject
import retrofit2.http.*
import rx.Observable

/**
 * Created by Fauzi Arnami on 9/16/17.
 */

interface JoystokService {
    //POST Section
    @FormUrlEncoded
    @POST("Users/login")
    fun postLogin(
            @Field("username") username: String,
            @Field("password") password: String
    ): Observable<LoginAPIEntity>

    @FormUrlEncoded
    @POST("ItemCategory")
    fun postCategory(
            @Header("authorization") authorization: String,
            @Field("categoryName") categoryName: String,
            @Field("remarks") remarks: String
    ): Observable<ItemCategoryAPIEntity>

    @Headers("Content-Type: application/json")
    @POST("ItemCategory/update")
    fun postUpdateCategory(
            @Header("authorization") authorization: String,
            @Query("where") where: JSONObject,
            @Body data: JsonObject
    ): Observable<ItemCategoryAPIEntity>

    @FormUrlEncoded
    @POST("Customer")
    fun postCustomer(
            @Header("authorization") authorization: String,
            @Field("name") name: String,
            @Field("phone") phone: String,
            @Field("address") address: String,
            @Field("remarks") remarks: String
    ): Observable<CustomerAPIEntity>

    @Headers("Content-Type: application/json")
    @POST("Customer/update")
    fun postUpdateCustomer(
            @Header("authorization") authorization: String,
            @Query("where") where: JSONObject,
            @Body data: JsonObject
    ): Observable<CustomerAPIEntity>

    @Headers("Content-Type: application/json")
    @POST("Item")
    fun postItem(
            @Header("authorization") authorization: String,
            @Body data: JsonObject
    ): Observable<ItemAPIEntity>

    @FormUrlEncoded
    @POST("ItemVariant")
    fun postItemVariant(
            @Header("authorization") authorization: String,
            @Field("itemId") itemId: Int,
            @Field("variantName") variantName: String
    ): Observable<ItemVariantAPIEntity>

    @FormUrlEncoded
    @POST("ItemVariantStock")
    fun postItemVariantStock(
            @Header("authorization") authorization: String,
            @Field("itemVariantId") itemVariantId: Int,
            @Field("quantity") quantity: Int,
            @Field("branchId") branchId: Int
    ): Observable<VariantStockAPIEntity>

    //Get Section
    @GET("Users/{id}")
    fun getUser(
            @Path("id") id: String
    ): Observable<UserAPIEntity>

    @GET("UserInfo/{userId}")
    fun getUserInfo(
            @Path("userId") id: String
    ): Observable<UserAPIEntity>

    @GET("Company/{id}")
    fun getCompany(
            @Header("authorization") authorization: String,
            @Path("id") id: Int
    ): Observable<CompanyAPIEntity>

    @GET("Branch/{id}")
    fun getBranch(
            @Header("authorization") authorization: String,
            @Path("id") id: Int
    ): Observable<BranchAPIEntity>

    @GET("ItemCategory")
    fun getItemCategoryList(
            @Header("authorization") authorization: String,
            @Query("where") filter: JSONObject
    ): Observable<List<ItemCategoryAPIModel>>

    @GET("ItemCategory/findOne")
    fun findCategoryName(
            @Header("authorization") authorization: String,
            @Query("categoryName") categoryName: JSONObject
    ): Observable<List<ItemCategoryAPIModel>>

    @GET("Customer")
    fun getCustomerList(
            @Header("authorization") authorization: String,
            @Query("where") filter: JSONObject
    ): Observable<List<CustomerAPIModel>>

    @GET("Item")
    fun getItemList(
            @Header("authorization") authorization: String,
            @Query("filter") filter: JSONObject
    ): Observable<List<ItemAPIModel>>

    @GET("Item/{id}/itemCategory")
    fun getItemCategoryByItemId(
            @Header("authorization") authorization: String,
            @Path("id") id: String
    ): Observable<ItemCategoryAPIEntity>

    @GET("Item/{id}/itemVariant")
    fun getVariantByItemId(
            @Header("authorization") authorization: String,
            @Path("id") id: String
    ): Observable<List<ItemVariantAPIModel>>

    @GET("ItemVariant/{id}/itemVariantStock")
    fun getStockByVariantId(
            @Header("authorization") authorization: String,
            @Path("id") id: String
    ): Observable<VariantStockAPIEntity>

    //Delete Section
    @DELETE("ItemCategory/{id}")
    fun deleteCategory(
            @Header("authorization") authorization: String,
            @Path("id") id: Int
    ): Observable<ItemCategoryAPIEntity>

    @DELETE("Customer/{id}")
    fun deleteCustomer(
            @Header("authorization") authorization: String,
            @Path("id") id: Int
    ): Observable<CustomerAPIEntity>

    @DELETE("Customer")
    fun deleteItem(
            @Header("authorization") authorization: String,
            @Path("id") id: Int
    ): Observable<CustomerAPIEntity>
}