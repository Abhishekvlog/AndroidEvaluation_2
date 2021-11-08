package com.example.androidevaluation_2.model.room

import okhttp3.Response
import retrofit2.Call
import retrofit2.http.GET

interface Api {
    @GET("api/")
    fun getData(): Call<Response>
}