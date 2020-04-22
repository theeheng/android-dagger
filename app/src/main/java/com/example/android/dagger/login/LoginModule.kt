package com.example.android.dagger.login

import com.example.android.dagger.di.ActivityScope
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class LoginModule {
    @ContributesAndroidInjector
    @ActivityScope
    abstract fun loginActivity(): LoginActivity
}