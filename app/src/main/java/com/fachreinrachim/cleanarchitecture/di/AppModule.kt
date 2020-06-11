package com.fachreinrachim.cleanarchitecture.di

import android.app.Application
import android.content.Context
import com.fachreinrachim.cleanarchitecture.rx.SchedulersFacade
import com.fachreinrachim.cleanarchitecture.rx.SchedulersProvider
import dagger.Binds
import dagger.Module

/**
 * @author M.Fachrein Rachim <fachreinrachim@gmail.com>
 * @since 09/05/20.
 */
@Module
abstract class AppModule {

    @Binds
    abstract fun bindContext(application: Application): Context

    @Binds
    abstract fun providerScheduler(schedulersFacade: SchedulersFacade): SchedulersProvider
}