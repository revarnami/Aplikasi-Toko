package com.android.joystok.data.net

import com.android.joystok.data.entity.LoginAPIEntity
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST
import rx.Observable

/**
 * Created by Fauzi Arnami on 9/16/17.
 */

interface JoystokService {
    @FormUrlEncoded
    @POST("Users/login")
    fun postLogin(
            @Field("username") username: String,
            @Field("password") password: String
    ): Observable<LoginAPIEntity>

}