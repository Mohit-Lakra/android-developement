package com.example.firstapplication.JetpackCompose.C8_Navigation

import kotlinx.serialization.Serializable

@Serializable
sealed class MyNavClass {
    @Serializable
    object LoginScreen: MyNavClass()
    @Serializable
    object HomeScreen: MyNavClass()
}