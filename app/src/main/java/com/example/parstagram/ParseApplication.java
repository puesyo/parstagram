package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;


public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("i6kTir0eO1n3ETULjnpm15krmLZWPMWV9Tbpqr3t")
                .clientKey("NjzsvQzyAKDnyB1CtmguZEVeegMxchPSl0TrB9rP")
                .server("https://parseapi.back4app.com")
                .build()
        );

    }
}
