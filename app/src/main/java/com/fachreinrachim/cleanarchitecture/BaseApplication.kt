package com.fachreinrachim.cleanarchitecture

import android.app.Application
import android.content.Context
import androidx.multidex.MultiDex
import com.fachreinrachim.cleanarchitecture.di.AppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

/**
 * @author M.Fachrein Rachim <fachreinrachim@gmail.com>
 * @since 09/05/20.
 */
class BaseApplication : DaggerApplication() {

    private lateinit var appComponent: AppComponent

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        appComponent = DaggerAppComponent.builder()
            .application(this)
            .build()
        return appComponent
    }
}