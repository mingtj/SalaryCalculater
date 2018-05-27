package com.jm.hrhelper.activity;


import org.xutils.x;


import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.util.Log;

import com.jm.hrhelper.Constant;
import com.jm.hrhelper.MyApplication;


/**
 * @author mingtingjie
 * @version v1.0
 */
public class BaseActivity extends FragmentActivity {

	public MyApplication myApplication;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		/**xutils3.0布局注解初始化**/
		x.view().inject(this);

//		if (myApplication == null)
//			myApplication = (MyApplication) getApplication();
//		if (myApplication.activeActivityList.contains(this)) {
//			myApplication.activeActivityList.set(myApplication.activeActivityList.indexOf(this), this);
//		}else {
//			myApplication.activeActivityList.add(this);
//		}

	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		//重写注掉防止程序崩溃，自重启保存状态
//		super.onSaveInstanceState(outState);
	}

	@Override
	public void onAttachFragment(Fragment fragment) {
		super.onAttachFragment(fragment);
		System.out.println("onAttachFragment");
	}
	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		System.out.println("onStart");
	}

	@Override
	protected void onStop() {
		super.onStop();
		System.out.println("onstop");
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();

		if(loginOutReveiver!=null)
		unregisterReceiver(loginOutReveiver);
//		myApplication.activeActivityList.remove(this);

	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}

	@Override
	public void onLowMemory() {
		// TODO Auto-generated method stub
		super.onLowMemory();
	}

	@Override
	public void onTrimMemory(int level) {
		if (level >= ComponentCallbacks2.TRIM_MEMORY_MODERATE) {
			// Clear the caches. Note all pending requests will be removed too.
		}
	}

	UserLoginOutReceiver loginOutReveiver = null;

	public void registerUserLoginOutBroadcast() {
        // 注册广播接收者
		loginOutReveiver = new UserLoginOutReceiver();
        IntentFilter filter = new IntentFilter();
        filter.addAction(Constant.User_LoginOut);
        registerReceiver(loginOutReveiver,filter);
    }


	class UserLoginOutReceiver extends BroadcastReceiver {

		@Override
		public void onReceive(Context context, Intent intent) {
			// TODO Auto-generated method stub
			if(intent.getAction().equals(Constant.User_LoginOut)){
	            Log.e("321","退出登陆");
	            finish();
	        }
		}

	}

	 private boolean isExit ;

	    public boolean isExit() {
	        return isExit;
	    }

	    public void setExit(boolean isExit) {
	        this.isExit = isExit;
	    }
}
