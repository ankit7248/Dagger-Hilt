package com.example.dagger_hilt

import android.util.Log
import javax.inject.Inject


const val TAG = "Ankit kumar"

// Mainly we use Interface for Third party things
interface UserRepository{   //Interface which we use in multiple classes

    fun saveUser(email: String,password: String)
    // make the save user
}
class SQLRepository @Inject constructor() : UserRepository{ // Inject -> we call the object of User Repository

   override fun saveUser(email: String , password: String)
    {

        Log.d(TAG,"User saved in DB")
    }

    // user can access SQLRepository when he want the class

}
class FireBaseRepository : UserRepository{
    override fun saveUser(email: String, password: String) {
        Log.d(TAG,"User saved in Firebase")
    }
    // user can access FireBaseRepository when he want the class
}
//
//class UserRepository@Inject constructor(val loggerService: LoggerService){   // Logger service -> Logger service in constructor behave like a constructor injection
//      LOGGER SERVICE request to logger service class for Object
//
//    fun saveUser(email: String,password: String){
//     loggerService.log("User saved in DB")
//    }
//}