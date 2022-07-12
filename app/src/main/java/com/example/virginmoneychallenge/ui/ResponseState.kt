package com.example.virginmoneychallenge.ui

sealed class ResponseState{
    object Loading : ResponseState()
    class SUCCESS<T>(val response : T) : ResponseState()
    class ERROR (val error: Exception) : ResponseState()
}