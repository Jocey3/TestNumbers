package dev.jocey.testnumbers.model.retrofit;

import io.reactivex.rxjava3.core.Single;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class NumFetcher {
    private Api api;

    public NumFetcher() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://numbersapi.com/")
                .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        api = retrofit.create(Api.class);
    }

    public Single<Entity> getFact(String num) {
        return api.getFact(num);
    }

    public Single<Entity> getRandomFact() {
        return api.getRandomFact();
    }
}
