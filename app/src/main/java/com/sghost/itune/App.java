package com.sghost.itune;

import android.app.Application;

import com.google.android.exoplayer2.core.BuildConfig;

import timber.log.Timber;


public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        if (BuildConfig.DEBUG) Timber.plant(new Timber.DebugTree());
    }
}
