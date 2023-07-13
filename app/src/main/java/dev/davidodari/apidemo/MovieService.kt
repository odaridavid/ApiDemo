package dev.davidodari.apidemo

import retrofit2.http.GET
import retrofit2.http.Query

interface MovieService {

    @GET("/3/discover/movie")
    suspend fun discoverMovies(
        @Query("language") language: String = "en-US",
        @Query("page") page: Int = 1
    ): DiscoverMovieResponse


}
