package com.lunzn.netcamera;

import android.util.Log;

/**
 * @desc: TODO
 * @author: Major
 * @since: 2018/6/21 22:06
 */
public class SL {

    private static final String TAG = "tag_sl";

    public static void i(Object obj) {
        Log.i(TAG, obj == null ? null : obj.toString());
    }

    public static void e(Object obj) {
        Log.e(TAG, obj == null ? null : obj.toString());
    }
}
