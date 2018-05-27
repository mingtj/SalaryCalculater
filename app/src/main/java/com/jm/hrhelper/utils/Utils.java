package com.jm.hrhelper.utils;

import android.widget.Toast;

import org.xutils.x;

/**
 * Created by mingtingjie on 18/4/13.
 */

/**
 * utils.list
 * 1.ToastMsg
 * 2.
 */
public class Utils {
    public static void ToastMsg(String msg){
        Toast.makeText(x.app(),msg,Toast.LENGTH_SHORT).show();
    }

}
