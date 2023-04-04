package com.example.dagger_hilt

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import javax.inject.Named

@InstallIn(FragmentComponent::class)  // Where we use Module we have to use InstallIn also

// Module use in Fragment so we use FragmentComponent otherwise When we use Retrofit  , Rdbms so we use Singleton Component in Application
// Singleton Component points to only one database, Retrofit etc.
@Module  // Module -> Module give the object when the consumer will not able to give field Injection and constructor class , @Inject

abstract class UserModule {

    // Provides ->  give the Object of FireBaseRepository
    // Bind -> Bind the interface UserRepository with Object of sqlRepository

    @Binds  // Bind -> is used to bind the user Repository and Sql Repository we can call User Repository and parameter is sqlRepository
    // Bind Annotation always in Abstract , there is no return type
    // we can Bind use if we are not using @Provides.
    abstract fun bindsUserRepository(sqlRepository: SQLRepository): UserRepository


    @Named("sql")  //@Named Annotation is used to point a Tag to reach the Object in Module
    @Provides
    // Provides gives the object of Sql Repository
    // Provides used in Module
    fun provideSQLRepository(sqlRepository: SQLRepository) : UserRepository{
        return sqlRepository
    }



    // @Named("firebase") //@Named Annotation is used to point a Tag to reach the Object in Module
    @FirebaseQualifier  // We can create typo which we aware by mistakes so we are making Qualifiers to the place of @Named
    @Provides
    fun provideFirebaseRepository() : UserRepository{
        return FireBaseRepository()
    }

}