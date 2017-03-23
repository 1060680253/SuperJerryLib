package com.ch.jerrylib.image.interfaces;

import android.content.Context;

import com.ch.jerrylib.image.config.SingleConfig;

import java.io.File;

/**
 * Created by Administrator on 2017/3/14 0014.
 */

public interface ILoader {

    void init(Context context, int cacheSizeInM);

    void request(SingleConfig config);

    void pause();

    void resume();

    void clearDiskCache();

    void clearCacheByUrl(String url);

    File getFileFromDiskCache(String url);

   boolean  isCached(String url);


}
