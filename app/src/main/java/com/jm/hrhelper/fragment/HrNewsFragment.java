package com.jm.hrhelper.fragment;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.xutils.x;
import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.Event;
import org.xutils.view.annotation.ViewInject;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ImageView.ScaleType;

import com.jm.hrhelper.R;
import com.umeng.analytics.MobclickAgent;

@ContentView(R.layout.fragment_hrnews)	
public class HrNewsFragment extends BaseFragment {

	private static final String TAG = "HrNewsFragment";
	
	
//		//模块标题
//		@ViewInject(R.id.title_text)
//		private TextView mTitle;
//		
//		//分类listview
//		@ViewInject(R.id.listview)
//		private ListView mListView;
//		
//		@ViewInject(R.id.my_lesson_layout)
//		private ListView mMyLessonLayout;
//		
		Handler handler = new Handler() {

			@Override
			public void handleMessage(Message msg) {
				super.handleMessage(msg);
				String result;
				switch (msg.what) {
				
				}
			}
		};
		
		@Override
		public void onViewCreated(View view, Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			super.onViewCreated(view, savedInstanceState);
			init();
		}
		
		@Override
		public void onResume() {
			// TODO Auto-generated method stub
			super.onResume();
			MobclickAgent.onPageStart(TAG);
		}
		
		void init(){
			
		}
		
//		@Event(R.id.my_lesson_layout)
		private void onClick(View view){
			switch (view.getId()) {
//			case R.id.my_lesson_layout:
//				Intent intent = new Intent(getActivity(), MyTrainingActivity.class);
//				startActivity(intent);
//				break;

			default:
				break;
			}
		}
		
		@Override
		public void onDestroy() {
			super.onDestroy();
		}
		
		@Override
		public void onStop() {
			super.onStop();
		}
		
		@Override
		public void onPause() {
			// TODO Auto-generated method stub
			super.onPause();
			MobclickAgent.onPageEnd(TAG);
		}
	}


