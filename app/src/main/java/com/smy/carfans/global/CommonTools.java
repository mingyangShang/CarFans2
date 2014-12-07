package com.smy.carfans.global;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by smy on 2014/12/5.
 */
public class CommonTools {
    private static CarFansApplication application = CarFansApplication.getApplication();

    //弹出Toast的信息提示框
    public static void showMsg(Context context,String msg){
        Toast.makeText(context,msg,Toast.LENGTH_SHORT).show();
    }
}
