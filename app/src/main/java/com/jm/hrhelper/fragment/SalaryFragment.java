package com.jm.hrhelper.fragment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.xutils.x;
import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;

import com.alibaba.fastjson.JSONObject;
import com.umeng.analytics.MobclickAgent;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.format.DateUtils;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import com.jm.hrhelper.R;

/**
 * 
 * @author mingtingjie
 * @description 
 */
@ContentView(R.layout.fragment_salary)
public class SalaryFragment extends BaseFragment {
	
	private static final String TAG  = "SalaryFragment";
	
//	//模块标题
//	@ViewInject(R.id.title_text)
//	private TextView mTitle;
	
	
	
	private static final int MSG_GET_USRE_LESSONS_DATA = 10;
	//页码
	private int page=1;
	
	private Handler mHandler = new Handler(){
		public void handleMessage(Message msg) {
			super.handleMessage(msg);
			String result = "";
			switch (msg.what) {
			case MSG_GET_USRE_LESSONS_DATA:
				result = msg.getData().getString("result");
				break;

			default:
				break;
			}
		}
	};
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		Log.e(TAG, "onActivityCreated");
	}
	
	@Override
	public void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		Log.e(TAG, "onresume");
		MobclickAgent.onPageStart(TAG);
	}
	
	public void onViewCreated(View view, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onViewCreated(view, savedInstanceState);
		Log.e(TAG, "onViewCreated");
		initView();
//		setListener();
		//用户已经购买的课程
		getUserCourses(page);
		
	}
	
	void initView(){
		
//		myLessonsAdapter = new MyLessonsAdapter(getActivity(), myLessons).setTrainItemClickListener(trainItemClickCallBack);
//		pullToRefreshListView.setAdapter(myLessonsAdapter);
//		
//		/**设置pulllisview属性**/
//		/***
//		 * Mode.BOTH：同时支持上拉下拉  监听需要设置 OnRefreshListener2
//			Mode.PULL_FROM_START：只支持下拉Pulling Down 
//			Mode.PULL_FROM_END：只支持上拉Pulling Up
//		 */
//		pullToRefreshListView.setMode(Mode.BOTH);//有上拉也有下拉，监听需要设置 OnRefreshListener2
//		
//		/**下拉刷新***/
//		ILoadingLayout startLabels = pullToRefreshListView.getLoadingLayoutProxy(true, false);    
//        startLabels.setPullLabel("下拉刷新...");// 刚下拉时，显示的提示    
////        startLabels.setRefreshingLabel("mtj正在载入...");// 刷新时
//        String label = DateUtils.formatDateTime(x.app(), System.currentTimeMillis(),  
//                DateUtils.FORMAT_SHOW_TIME | DateUtils.FORMAT_SHOW_DATE | DateUtils.FORMAT_ABBREV_ALL);  
//        startLabels.setRefreshingLabel("刷新时间:"+label);// 刷新时
//        startLabels.setReleaseLabel("放开刷新...");// 下来达到一定距离时，显示的提示  
//        
//        
//        /**上拉刷新***/
//        ILoadingLayout endLabels = pullToRefreshListView.getLoadingLayoutProxy(false, true);    
//        endLabels.setPullLabel("上拉刷新...");// 刚下拉时，显示的提示    
//        endLabels.setRefreshingLabel("正在载入...");// 刷新时    
//        endLabels.setReleaseLabel("放开刷新...");// 下来达到一定距离时，显示的提示 
	}
	
	
//	/**设置listview监听***/
//	void setListener(){
//		pullToRefreshListView.setOnRefreshListener(new PullToRefreshBase.OnRefreshListener2<ListView>(){  
//	            public void onPullDownToRefresh(  
//	                    PullToRefreshBase<ListView> refreshView) {  
//	                // TODO Auto-generated method stub  
////	            	 addToBottom();
//	            	
//	            	//下拉重新请求接口数据
//	                getUserCourses(1);
//	                
//	                 new FinishRefresh().execute();  
//	            }  
//	              
//	            public void onPullUpToRefresh(PullToRefreshBase<ListView> refreshView) {  
//	                // TODO Auto-generated method stub  
////	            	addToTop();
//	            	page = page+1;
//	            	getUserCourses(page);
//	                new FinishRefresh().execute();  
//	            }  
//	        });  
//	}

	
//	private class FinishRefresh extends AsyncTask<Void, Void, Void> {
//		   @Override
//		   protected Void doInBackground(Void... params) {
//		     try {
//		       Thread.sleep(1000);
//		     } catch (InterruptedException e) {
//		 
//		     }
//		     return null;
//		   }
//		 
//		   @Override
//		   protected void onPostExecute(Void aVoid) {
//		     pullToRefreshListView.onRefreshComplete();
//		     myLessonsAdapter.notifyDataSetChanged();
//		   }
//		 }
//	
	
//	private TrainingItemClickCallBack trainItemClickCallBack = new TrainingItemClickCallBack() {
//		
//		@Override
//		public void trainItemClick(Course training) {
//			Intent intent = new Intent(getActivity(), UserSaledLessonActivity.class);
//			intent.putExtra(Constant.CourseID, training.getCourseId());
//			intent.putExtra(Constant.CourseName, training.getCourseTitle());
//			startActivity(intent);
//			
//		}
//	};
	

	
	/***
	 * 用户已经购买课程列表接口
	 * @param page  页码
	 */
	private void getUserCourses(int page) {
		
		
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
