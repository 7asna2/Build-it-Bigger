/*
   For step-by-step instructions on connecting your Android application to this backend module,
   see "App Engine Java Endpoints Module" template documentation at
   https://github.com/GoogleCloudPlatform/gradle-appengine-templates/tree/master/HelloEndpoints
*/

package com.example.Hasnaa.myapplication.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.udacity.gradle.jokes.Joker;

import javax.inject.Named;

/** An endpoint class we are exposing */
@Api(
  name = "myApi",
  version = "v1",
  namespace = @ApiNamespace(
    ownerDomain = "backend.myapplication.Hasnaa.example.com",
    ownerName = "backend.myapplication.Hasnaa.example.com",
    packagePath=""
  )
)
public class MyEndpoint {

    @ApiMethod(name = "sayJoke")
    public MyBean sayJoke() {
        MyBean response = new MyBean();

        response.setData("Hi, " + new Joker().getJoke());

        return response;
    }

}
