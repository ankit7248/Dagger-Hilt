package com.example.dagger_hilt

import android.app.Application
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp // for Application only

class UserApplication : Application(){    //UserApplication ->  we create globally objects here and give access

//    @Inject -> yaha mujhe User Repository ke Object chaiye

    @Inject
    lateinit var userRepository: UserRepository  // we create the object of User Repository

    override fun onCreate() {
        super.onCreate() // super.onCreate -> Intialize the Inject Object
        userRepository.saveUser("ankitddkumar@gmail.com","8123471")
    }
}

