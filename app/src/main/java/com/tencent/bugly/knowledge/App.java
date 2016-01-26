package com.tencent.bugly.knowledge;

import android.app.Application;

import com.tencent.bugly.crashreport.CrashReport;

/**
 * Created by HiWin10 on 2016/1/21.
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        CrashReport.initCrashReport(this, "900018418",true);

    }
}
