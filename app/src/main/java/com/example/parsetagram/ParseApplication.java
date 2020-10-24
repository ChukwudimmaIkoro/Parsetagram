package com.example.parsetagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("e4uTOcHHlCFmr3mlJTUJd9yJOGbrrrX4Qq3Tr2FJ")
                .clientKey("pVo6uw86qfyn3qUffdKrVa4fIjysLEfmEZ0VhrSG")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
