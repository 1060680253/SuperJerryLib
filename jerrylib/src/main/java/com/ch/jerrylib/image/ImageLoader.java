package com.ch.jerrylib.image;

import android.content.Context;

import com.ch.jerrylib.image.config.GlobalConfig;
import com.ch.jerrylib.image.config.SingleConfig;


/**
 * Created by Administrator on 2017/3/14 0014.
 */


//   https://github.com/hss01248/ImageLoader
public class ImageLoader {

    //public static Context context;

    public static void init(final Context context, int cacheSizeInM){
        //ImageLoader.context = context;

        GlobalConfig.context = context;
        GlobalConfig.getLoader().init(context,cacheSizeInM);


    }

    public static SingleConfig.ConfigBuilder with(Context context){
        return new SingleConfig.ConfigBuilder(context);
    }


}
