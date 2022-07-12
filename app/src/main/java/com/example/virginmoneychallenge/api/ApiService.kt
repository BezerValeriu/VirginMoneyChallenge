package com.example.virginmoneychallenge.api

import com.example.virginmoneychallenge.model.people.People
import com.example.virginmoneychallenge.model.rooms.Room
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("/rooms")
    suspend fun getRoom() : Response<Room>

    @GET("/people")
    suspend fun getPeople() : Response<People>
}
