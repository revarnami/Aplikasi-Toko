package com.android.joystok.data.net

import com.android.joystok.data.entity.BranchAPIEntity
import com.android.joystok.data.entity.CompanyAPIEntity
import com.android.joystok.data.entity.LoginAPIEntity
import com.android.joystok.data.entity.UserAPIEntity
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
}