package com.fachreinrachim.data.apiservice

import com.fachreinrachim.data.models.ShareDataModel
import io.reactivex.Single
import retrofit2.http.GET

/**
 * @author M.Fachrein Rachim <fachreinrachim@gmail.com>
 * @since 08/05/20.
 */
interface ApiService {

    @GET("/share/")
    fun getSharingDetails(): Single<ShareDataModel>
}