package com.udacity.gradle.builditbigger;

/**
 * Created by Hasnaa on 4/6/2017.
 */

import android.test.AndroidTestCase;
import android.util.Log;
public class AsyncTest extends AndroidTestCase {

    private final String LOG_TAG = this.getClass().getSimpleName();

    @SuppressWarnings("unchecked")
    public void test() {
        // You can test this from androidTest -> Run 'All Tests'
        Log.v(LOG_TAG, "Testing AsyncTask ..");
        String result = null;
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask();
        endpointsAsyncTask.execute();
        try {
            result = endpointsAsyncTask.get();
            Log.d(LOG_TAG, "AsyncTask has retrieved  non-empty string (" + result+")");
        } catch (Exception e) {
            e.printStackTrace();
            Log.e(LOG_TAG,e.getMessage());

        }
        assertNotNull(result);
    }

}