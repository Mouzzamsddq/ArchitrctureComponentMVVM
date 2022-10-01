package com.example.androidarchitecturemvvm.data

import com.example.androidarchitecturemvvm.api.UnsplashApi
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UnsplashRepository @Inject constructor(
    private val unsplashApi: UnsplashApi
)