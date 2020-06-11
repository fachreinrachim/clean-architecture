package com.fachreinrachim.data.di

import com.fachreinrachim.data.apiservice.ApiService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

/**
 * @author M.Fachrein Rachim <fachreinrachim@gmail.com>
 * @since 08/05/20.
 */
@Module(includes = [NetworkModule::class])
class ApiModule {

    @Provides
    fun bindApiService(retrofit: Retrofit): ApiService {
        return retrofit.create(ApiService::class.java)
    }
}