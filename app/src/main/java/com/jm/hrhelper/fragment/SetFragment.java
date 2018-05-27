package com.jm.hrhelper.fragment;


import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.Event;

import com.jm.hrhelper.activity.SetBumenActivity;
import com.jm.hrhelper.activity.SetBuzhuActivity;
import com.jm.hrhelper.activity.SetEmailformatActivity;
import com.jm.hrhelper.activity.SetJianglActivity;
import com.jm.hrhelper.activity.SetKoukActivity;
import com.jm.hrhelper.activity.SetZhiwActivity;
import com.jm.hrhelper.activity.UserZengjianActivity;
import com.jm.hrhelper.utils.Utils;
import com.umeng.analytics.MobclickAgent;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;

import com.jm.hrhelper.R;

/**
 * 
 * @author mingtingjie
 * @description 设置，个人中心
 */

@ContentView(R.layout.fragment_set)
public class SetFragment extends BaseFragment {
	
	private static final String TAG = "SetFragment";
//
//	@ViewInject(R.id.btn)
//	private Button btn;
	
	private static final int MSG_GET_USRE_INFO = 201;
	private static final int MSG_GET_USRE_LOGIN_OUT = 202;
	private static final int READ_CACHE_SIZE = 203;
	
	private Handler mHandler = new Handler(){
		public void handleMessage(Message msg) {
			super.handleMessage(msg);
			String result = "";
			switch (msg.what) {
			case MSG_GET_USRE_INFO:
				result = msg.getData().getString("result");
				
				break;
			case MSG_GET_USRE_LOGIN_OUT:
				userExist();
				break;
			case READ_CACHE_SIZE:
//				//缓存大小   songs, imageCache, image, imagefnd
//				double doubleUpdateCache = Utils.getFormatFileSize(new File(Constant.AppFilePath.updateFilePath));
//				double doubleCrash = Utils.getFormatFileSize(new File(Constant.AppFilePath.crashFilePath));
//				double tempCache =  doubleUpdateCache+doubleCrash;
//				/**
//				 * BigDecimal.setScale用于格式化小数点 
//					setScale(1)表示保留以为小数，默认用四舍五入方式 
//					setScale(1,BigDecimal.ROUND_DOWN)直接删除多余的小数位，如2.35会变成2.3 
//					setScale(1,BigDecimal.ROUND_UP)进位处理，2.35变成2.4 
//					setScale(1,BigDecimal.ROUND_HALF_UP)四舍五入，2.35变成2.4
//					setScaler(1,BigDecimal.ROUND_HALF_DOWN)四舍五入，2.35变成2.3，如果是5则向下舍
//				 */
//				BigDecimal   b  =  new   BigDecimal(tempCache);  
//				double  totalCache  =   b.setScale(2,   BigDecimal.ROUND_HALF_UP).doubleValue();  
//				mCacheSize.setText(totalCache+"MB");
				break;
			default:
				break;
			}
		}
	};
	
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}
	
	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onViewCreated(view, savedInstanceState);
		initView();
//		getUserInfo();
		mHandler.sendEmptyMessageAtTime(READ_CACHE_SIZE, 3000);
	}
	
	@Override
	public void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		MobclickAgent.onPageStart(TAG);
	}
	
	void initView(){

	}
	
	@Event(value = {R.id.group_layout_user,R.id.group_layout_bumen,R.id.group_layout_bz,R.id.group_layout_emailformat,
			R.id.group_layout_jl,R.id.group_layout_kk,R.id.group_layout_zw},type = View.OnClickListener.class)
	private void FunctionOnclick(View view){
//		Intent intent = null;

		switch (view.getId()) {
		case R.id.group_layout_user:
			Utils.ToastMsg("user");
			UserZengjianActivity.intentTo(getActivity());
			break;
		case R.id.group_layout_bumen:
			Utils.ToastMsg("bumen");
			SetBumenActivity.intentTo(getActivity());
			break;
		case R.id.group_layout_zw:
			Utils.ToastMsg("zhiwu");
			SetZhiwActivity.intentTo(getActivity());
//			//退出登录
//			DbUtils dbUtils = DbUtils.getInstance(getActivity());
//			dbUtils.deleteUserInfo();
//
//			SharedPreferencesUtils.setParam(getActivity(), Constant.SharedKey.UserToken, "");
//
//			//发送用户退出广播
//			intent = new Intent();
//			intent.setPackage(getActivity().getPackageName());
//		    intent.setAction(Constant.User_LoginOut);
//		    getActivity().sendBroadcast(intent);
//
//				intent = new Intent(getActivity(),LoginActivity.class);
//				startActivity(intent);
//				getActivity().finish();
//
//			userLoginOut();
//			userExist();
			break;
		case R.id.group_layout_emailformat:
			Utils.ToastMsg("email");
			SetEmailformatActivity.intentTo(getActivity());
			break;
		case R.id.group_layout_bz:
			Utils.ToastMsg("buzhu");
			SetBuzhuActivity.intentTo(getActivity());
			break;
		case R.id.group_layout_kk:
			Utils.ToastMsg("koukuan");
			SetKoukActivity.intentTo(getActivity());
			break;
			case R.id.group_layout_jl:
				SetJianglActivity.intentTo(getActivity());
				Utils.ToastMsg("jiangli");
				break;
		default:
			break;
		}
	}
	
//	private void clearCache(){
//		Utils.deleteDir(Constant.AppFilePath.updateFilePath);  //update
//		Utils.deleteDir(Constant.AppFilePath.crashFilePath);  //imagefind
//		mCacheSize.setText("0.0MB");
//	}
	
	/**
	 * 用户退出
	 */
	private void userExist(){
//		//clear token 
//		SharedPreferencesUtils.setParam(getActivity(), Constant.SharedKey.UserToken, "");
//		
//		//发送用户退出广播
//		Intent intent = new Intent();
//		intent.setPackage(getActivity().getPackageName());
//	    intent.setAction(Constant.User_LoginOut);
//	    getActivity().sendBroadcast(intent);
//		
//		intent = new Intent(getActivity(),LoginActivity.class);
//		startActivity(intent);
//		getActivity().finish();
	}
	
	
	
	@Override
	public void onDestroyView() {
		super.onDestroyView();
	}
	
	
	@Override
	public void onDestroy() {
		super.onDestroy();
	}
	
	@Override
	public void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		MobclickAgent.onPageEnd(TAG);
	}

}
