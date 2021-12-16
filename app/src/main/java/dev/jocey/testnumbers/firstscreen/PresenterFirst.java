package dev.jocey.testnumbers.firstscreen;

import android.text.Editable;
import android.util.Log;

import dev.jocey.testnumbers.model.retrofit.NumFetcher;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class PresenterFirst {
    private NumFetcher numFetcher;

    public PresenterFirst() {
        numFetcher = new NumFetcher();

    }

    public void getRandomFact() {
        numFetcher.getRandomFact()
                .subscribeOn(Schedulers.io())
                .subscribe(entity -> {
                    Log.d("myLog", "Number: " + entity.getNumber() + " Text: " + entity.getText());
                });
    }

    public void getFact(Editable text) {
        numFetcher.getFact(String.valueOf(text))
                .subscribeOn(Schedulers.io())
                .subscribe(entity -> Log.d("myLog", entity.getNumber()+" "+entity.getText()));
    }
}

