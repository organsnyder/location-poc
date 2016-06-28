package com.snyder616.locationpoc;


import retrofit2.Retrofit;
import retrofit2.converter.wire.WireConverterFactory;

import java.io.IOException;

public class TestClient {

  public static void main(String[] arg) throws IOException {
    Retrofit retrofit = new Retrofit.Builder().baseUrl("http://localhost:8080").addConverterFactory(
        WireConverterFactory.create()).build();
    LocationClient client = retrofit.create(LocationClient.class);
    for (LocationClientModel l : client.locations().execute().body()) {
      System.out.println(l.getName());
    }
  }
}
