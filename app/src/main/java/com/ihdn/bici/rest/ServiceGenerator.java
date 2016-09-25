package com.ihdn.bici.rest;

import com.squareup.okhttp.OkHttpClient;

import retrofit.RestAdapter;
import retrofit.client.OkClient;

/**
 * Created by root on 24/09/16.
 */

public class ServiceGenerator {

    public static final String API_BASE_URL = "https://api-bicicare.herokuapp.com";
//    public static final String API_BASE_URL_LOCAL = "http://localhost:8080";


    private static final RestAdapter REST_ADAPTER = new RestAdapter.Builder()
            .setEndpoint(API_BASE_URL)
            .setLogLevel(RestAdapter.LogLevel.FULL)
            .setClient(new OkClient(new OkHttpClient()))
            .build();

    private static final ArticuloService USER_SERVICE = REST_ADAPTER.create(ArticuloService.class);
    public static ArticuloService getArticuloService() {
        return USER_SERVICE;
    }

}
