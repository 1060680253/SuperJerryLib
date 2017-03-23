package com.ch.jerrylib;

import android.app.Application;

import com.ch.jerrylib.image.ImageLoader;

/**
 * Created by chenghuan on 2017/3/23.
 * on phyt company
 */

public class BaseApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ImageLoader.init(getApplicationContext(), 40);
    }

}
