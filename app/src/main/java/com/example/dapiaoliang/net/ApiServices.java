package com.example.dapiaoliang.net;

import java.util.HashMap;


public interface ApiServices {

    @GET
    Observable<ResponseBody> get(@Url String url);

    @FormUrlEncoded
    @POST
    Observable<ResponseBody> post(@Url String url);

    @FormUrlEncoded
    @POST
    Observable<ResponseBody> post(@Url String url, @FieldMap HashMap<String,String> map);

}
