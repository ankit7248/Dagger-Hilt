package com.example.dagger_hilt


import java.lang.annotation.Documented
import javax.inject.Qualifier


@Qualifier
@Documented
@Retention(AnnotationRetention.RUNTIME)
annotation class FirebaseQualifier()
