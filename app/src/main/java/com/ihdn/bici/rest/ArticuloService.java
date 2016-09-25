package com.ihdn.bici.rest;

import retrofit.Callback;
import retrofit.client.Response;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Query;

/**
 * Created by root on 24/09/16.
 */

public interface ArticuloService {
    @FormUrlEncoded
    @POST("/articulo/monitorear")
    void monitorearArticulo(@Field("email") String email,
                            @Field("id_articulo") String id,
                            @Field("activo") Boolean activo,
                            Callback<Response> callback);

    @GET("/articulo/alertar")
    void alertarArticulo(@Query("email") String email,
                       @Query("id_articulo") String id,
                       Callback<Response> callback);
}
