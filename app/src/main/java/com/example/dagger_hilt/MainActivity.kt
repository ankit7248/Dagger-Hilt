package com.example.dagger_hilt


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject


// Theory

// Consumer -> @Inject
// Producer -> @Module, @Provides , @Binds
// Connector -> Component

// When Consumer Find out Object by @Inject (Field Injection) then it will not go in Constructor class

//Consumer contact with component for Object from Constructor class (Module1 , Module 2, Module 3)


@AndroidEntryPoint // for all class has same "Annotation" but not for UserApplication class

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}