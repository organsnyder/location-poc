package com.snyder616.locationpoc;

import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface LocationClient {
  @GET("/")
  Call<List<LocationClientModel>> locations();
}
