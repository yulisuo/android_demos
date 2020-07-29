package com.yulisuo.demos.utils;

import android.text.TextUtils;
import android.util.Log;

public class MLog {

    private static String DEFAULT_TAG = "demos-log";

    public static void i(String tag, String msg){
        if (TextUtils.isEmpty(tag)) {
            Log.i(DEFAULT_TAG, msg);
        } else {
            Log.i(tag, msg);
        }
    }

    public static void i(String tag, String msg, Object... args){
        String log = String.format(msg, args);
        if (TextUtils.isEmpty(tag)) {
            i(DEFAULT_TAG, log);
        } else {
            i(tag, log);
        }
    }
}
