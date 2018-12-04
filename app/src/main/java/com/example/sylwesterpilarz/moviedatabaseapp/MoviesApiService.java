package com.example.sylwesterpilarz.moviedatabaseapp;

import retrofit.Callback;
import retrofit.http.GET;

public interface MoviesApiService {
    @GET("/movie/popular")
    void getPopularMovies(Callback<Movie.MovieResult> cb);
}