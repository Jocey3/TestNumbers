package dev.jocey.testnumbers.model.retrofit;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Api {
    @GET("/{num}/?json")
    Single<Entity> getFact(@Path("num") String num);

    @GET("/random/math?json")
    Single<Entity> getRandomFact();
}
