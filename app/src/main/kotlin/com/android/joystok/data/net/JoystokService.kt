package com.android.joystok.data.net

import com.android.joystok.data.entity.*
import com.android.joystok.domain.model.ItemCategoryAPIModel
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
            @Field("categoryName") categoryName: String,
            @Field("remarks") remarks: String
    ): Observable<ItemCategoryAPIEntity>

    @FormUrlEncoded
    @POST("ItemCategory/update")
    fun postUpdateCategory(
            @Field("id") id: Int,
            @Field("categoryName") categoryName: String,
            @Field("remarks") remarks: String
    ): Observable<ItemCategoryAPIEntity>

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
            @Header("authorization") authorization: String
    ): Observable<List<ItemCategoryAPIModel>>

    //Delete Section
    @DELETE("ItemCategory/{id}")
    fun deleteCategory(@Path("id") id: Int): Observable<ItemCategoryAPIEntity>
}