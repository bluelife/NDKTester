package com.tencent.bugly.knowledge;

/**
 * Created by slomka.jin on 2016/1/26.
 */
public class Native {
    static {
        System.loadLibrary("native");
    }
    public native String SetVersionCode();
}
