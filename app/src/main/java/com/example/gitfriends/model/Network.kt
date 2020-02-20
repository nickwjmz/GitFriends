package com.example.gitfriends.model

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

interface NetworkInterface {
    fun initRetrofit(): GithubAPI {
        var retrofit = Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        var api = retrofit.create(GithubAPI::class.java)
        return api
    }
}