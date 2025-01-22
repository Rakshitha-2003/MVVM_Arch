package com.example.myapplication1

import retrofit2.Call
import retrofit2.http.GET

interface FakeStoreApiService {
    @GET("products")
    fun getAllProducts(): Call<List<Product>>
}
