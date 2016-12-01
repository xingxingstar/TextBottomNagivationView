package com.phone.textbottomnagivationview.application;

import android.app.Application;
import android.content.Context;

/**
 * Created by Lenovo-SXX on 2016/11/20.
 */
public class App extends Application {

    public static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

}
