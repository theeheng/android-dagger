package com.example.android.dagger.registration

import com.example.android.dagger.di.ActivityScope
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class RegistrationModule {
    @ActivityScope
    @ContributesAndroidInjector(modules = [RegistrationFragmentModule::class])
    abstract fun registrationActivity(): RegistrationActivity
}