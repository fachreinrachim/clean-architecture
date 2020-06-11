package com.fachreinrachim.cleanarchitecture.di

import android.app.Application
import com.fachreinrachim.cleanarchitecture.BaseApplication
import com.fachreinrachim.data.di.ApiModule
import com.fachreinrachim.data.di.NetworkModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * @author M.Fachrein Rachim <fachreinrachim@gmail.com>
 * @since 09/05/20.
 */
@Singleton
@Component(
    modules = [
        NetworkModule::class,
        ApiModule::class,
        AppModule::class,
        AndroidSupportInjectionModule::class,
        AndroidInjectionModule::class,
        ActivityBindingModule::class]
)
interface AppComponent : AndroidInjector<BaseApplication> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }
}