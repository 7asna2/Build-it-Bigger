package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.util.Pair;
import android.widget.Toast;

import com.example.hasnaa.myapplication.backend.myApi.MyApi;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;
import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.googleapis.services.GoogleClientRequestInitializer;

import java.io.IOException;

/**
 * Created by Hasnaa on 4/6/2017.
 */


class EndpointsAsyncTask extends AsyncTask<Pair<Context, String>, Void, String> {
    private static MyApi myApiService = null;
//    private Context context;

    @Override
    protected String doInBackground(Pair<Context, String>... params) {
        if(myApiService == null) {

            MyApi.Builder builder = new MyApi.Builder(AndroidHttp.newCompatibleTransport(), new AndroidJsonFactory(), null)
                    .setRootUrl("https://joke-163815.appspot.com/_ah/api/");

            myApiService = builder.build();
        }

        try {
            return myApiService.sayJoke().execute().getData();

        } catch (IOException e) {
            Log.e(getClass().getSimpleName(),e.getMessage());
            return e.getMessage();
        }catch (NullPointerException e) {
            Log.e(getClass().getSimpleName(), e.getMessage());
            return e.getMessage();
        }

    }

}
