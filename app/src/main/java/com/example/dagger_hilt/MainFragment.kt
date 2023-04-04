package com.example.dagger_hilt

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

@AndroidEntryPoint  // Agar mene AndroidEntryPoint fragment me use kiya toh mereko Main Activity me bhi use karna hoga
class MainFragment : Fragment() {

    @Inject
    @FirebaseQualifier
    @Named("sql") // we call the Module object in fragment
    lateinit var userRepository: UserRepository       // Field Injection

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        userRepository.saveUser("ankitddkumar@gmail.com","8123471")
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }
}