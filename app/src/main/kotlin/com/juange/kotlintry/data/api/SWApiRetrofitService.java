package com.juange.kotlintry.data.api;

import java.util.List;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface SWApiRetrofitService {

    @GET("people/{id}/")
    List<People> getPeopleById(@Path("id") String id);
}
