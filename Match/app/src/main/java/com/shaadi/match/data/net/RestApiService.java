package com.shaadi.match.data.net;

import com.shaadi.match.data.model.MatchWrapper;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RestApiService {

    @GET("api/?results=10")
    Call<MatchWrapper> getMatchList();
}
