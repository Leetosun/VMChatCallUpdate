package com.vmloft.develop.app.demo.call;

import android.content.Context;
import android.support.multidex.MultiDexApplication;

/**
 * Created by lzan13 on 2017/4/13.
 * 这里继承自MultiDex的Application，解决项目方法数超过65536问题
 */
public class VMApplication extends MultiDexApplication {

    // 全局的上下文对象
    protected static Context context;


    @Override public void onCreate() {
        super.onCreate();

        context = this;
    }

    public static Context getContext() {
        return context;
    }

}
