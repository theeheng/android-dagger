package com.example.android.dagger.registration

import com.example.android.dagger.registration.enterdetails.EnterDetailsFragment
import com.example.android.dagger.registration.termsandconditions.TermsAndConditionsFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class RegistrationFragmentModule {

    @ContributesAndroidInjector
    abstract fun enterDetailsFragment(): EnterDetailsFragment

    @ContributesAndroidInjector
    abstract fun termsAndConditionsFragment(): TermsAndConditionsFragment
}