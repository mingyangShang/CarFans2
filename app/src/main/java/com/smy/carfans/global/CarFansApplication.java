package com.smy.carfans.global;

import android.app.Application;

/**
 * Created by smy on 2014/12/5.
 */
public class CarFansApplication extends Application{

    private static final CarFansApplication application = new CarFansApplication();
    public static CarFansApplication getApplication() {
        return application;
    }


    @Override
    public void onCreate(){
        super.onCreate();
//        ImageLoadConfig
    }
}
