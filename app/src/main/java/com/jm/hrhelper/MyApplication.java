
package com.jm.hrhelper;


import org.xutils.x;

import com.tencent.bugly.crashreport.CrashReport;

import android.app.Application;
import android.content.Context;

public class MyApplication extends Application {
	public static  Context mContext;;
	@Override
	public void onCreate() {
		super.onCreate();
		mContext = this;
		/***xutils 3的初始化----start----**/
		x.Ext.init(this);
		
		/**
		 * tencent bugly 
		 * the crash collect platfrom
		 * init bugly
		 */
		CrashReport.initCrashReport(getApplicationContext());
	}
	
	
	

}
