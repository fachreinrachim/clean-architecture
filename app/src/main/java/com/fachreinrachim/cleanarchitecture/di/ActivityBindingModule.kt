package com.fachreinrachim.cleanarchitecture.di

import com.fachreinrachim.cleanarchitecture.features.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * @author M.Fachrein Rachim <fachreinrachim@gmail.com>
 * @since 09/05/20.
 */
@Module(includes = [ViewModelModule::class])
abstract class ActivityBindingModule {

    @ContributesAndroidInjector
    abstract fun bindMainScreenActivity(): MainActivity

}