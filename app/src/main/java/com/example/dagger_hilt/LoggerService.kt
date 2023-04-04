package com.example.dagger_hilt

import android.provider.ContactsContract.CommonDataKinds.Email
import android.util.Log
import javax.inject.Inject

class LoggerService @Inject constructor(){

    fun log(message: String){
        Log.d(TAG,message)
    }
}

