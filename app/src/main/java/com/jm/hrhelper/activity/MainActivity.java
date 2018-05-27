package com.jm.hrhelper.activity;

import com.jm.hrhelper.Constant;
import com.jm.hrhelper.MyApplication;
import com.jm.hrhelper.R;
import com.jm.hrhelper.activity.BaseActivity;
import com.jm.hrhelper.fragment.HrNewsFragment;
import com.jm.hrhelper.fragment.SalaryFragment;
import com.jm.hrhelper.fragment.SetFragment;
import com.umeng.analytics.MobclickAgent;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * @author mingtingjie
 *
 */
public class MainActivity extends BaseActivity {

	
	protected static final String TAG = "MainActivity";

    private Fragment[] fragments;
    
    private SetFragment setFragment;
    private SalaryFragment salaryFragment;
    private HrNewsFragment hrNewsFragment;
    
    private ImageView[] imagebuttons;
    private TextView[] textviews;
    private int index;
    // 当前fragment的index
    private int currentTabIndex;
    private boolean isConflictDialogShow;
    private boolean isAccountRemovedDialogShow;
    // 账号在别处登录
    public boolean isConflict = false;
    // 账号被移除
    private boolean isCurrentAccountRemoved = false;


    /**
     * 检查当前用户是否被删除
     */
    public boolean getCurrentAccountRemoved() {
        return isCurrentAccountRemoved;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null
                && savedInstanceState.getBoolean(Constant.ACCOUNT_REMOVED,
                        false)) {
            // 防止被移除后，没点确定按钮然后按了home键，长期在后台又进app导致的crash
            // 三个fragment里加的判断同理
//            finish();
//            startActivity(new Intent(this, LoginActivity.class));//LoginActivity
//            return;
        } else if (savedInstanceState != null
                && savedInstanceState.getBoolean("isConflict", false)) {
            // 防止被T后，没点确定按钮然后按了home键，长期在后台又进app导致的crash
            // 三个fragment里加的判断同理
//            finish();
//            startActivity(new Intent(this, LoginActivity.class));//LoginActivity
//            return;
        }
        setContentView(R.layout.activity_main);
        //退出时用
        MyApplication.mContext = this;
		
        initView();

        if (getIntent().getBooleanExtra("conflict", false)
                && !isConflictDialogShow) {
        	
        } else if (getIntent().getBooleanExtra(Constant.ACCOUNT_REMOVED, false)
                && !isAccountRemovedDialogShow) {
        	
        }
    }

    private void initView() {

    	hrNewsFragment = new HrNewsFragment();
        salaryFragment = new SalaryFragment();
        setFragment = new SetFragment();
        
        fragments = new Fragment[]{hrNewsFragment,salaryFragment,setFragment};//meFragment
        imagebuttons = new ImageView[3];
        imagebuttons[0] = (ImageView) findViewById(R.id.ib_training_img);
        imagebuttons[1] = (ImageView) findViewById(R.id.ib_mytraining_img);
        imagebuttons[2] = (ImageView) findViewById(R.id.ib_me_img);

        imagebuttons[0].setSelected(true);
        textviews = new TextView[3];
        textviews[0] = (TextView) findViewById(R.id.ib_training_txt);
        textviews[1] = (TextView) findViewById(R.id.ib_mytraining_txt);
        textviews[2] = (TextView) findViewById(R.id.ib_me_txt);
        textviews[0].setTextColor(Color.parseColor("#46a3ff"));
        // 添加显示第一个fragment
        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragment_container, hrNewsFragment)
                .add(R.id.fragment_container, salaryFragment)
                .add(R.id.fragment_container, setFragment)//meFragment2
                .hide(salaryFragment).hide(setFragment)//meFragment2
                .show(hrNewsFragment).commit();
    }

    public void onTabClicked(View view) {
        switch (view.getId()) {
        case R.id.ib_training_layout:
            index = 0;
            break;
        case R.id.ib_mytraining_layout:
            index = 1;
            break;
        case R.id.ib_me_layout:
            index = 2;
            break;
        }

        if (currentTabIndex != index) {
            FragmentTransaction trx = getSupportFragmentManager()
                    .beginTransaction();
            trx.hide(fragments[currentTabIndex]);
            if (!fragments[index].isAdded()) {
                trx.add(R.id.fragment_container, fragments[index]);
            }
            trx.show(fragments[index]).commit();
        }
        imagebuttons[currentTabIndex].setSelected(false);
        // 把当前tab设为选中状态
        imagebuttons[index].setSelected(true);
        textviews[currentTabIndex].setTextColor(0xFF999999);//0xFF999999
        textviews[index].setTextColor(Color.parseColor("#1cb0f6"));//0xFF45C01A
        currentTabIndex = index;
    }
	
    @Override
    protected void onResume() {
        super.onResume();
        if (!isConflict || !isCurrentAccountRemoved) {
        }
        MobclickAgent.onPageStart(TAG);
        MobclickAgent.onResume(this);
    }
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		
		super.onPause();
		MobclickAgent.onPageEnd(TAG);
	    MobclickAgent.onPause(this);
	}
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putBoolean("isConflict", isConflict);
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (getIntent().getBooleanExtra("conflict", false)
                && !isConflictDialogShow) {
        	
        } 
//        else if (getIntent().getBooleanExtra(Constant.ACCOUNT_REMOVED, false)
//                && !isAccountRemovedDialogShow) {
//        	
//        }
    }

    private long exitTime = 0;
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK
                && event.getAction() == KeyEvent.ACTION_DOWN) {
            if ((System.currentTimeMillis() - exitTime) > 2000) {
                Toast.makeText(getApplicationContext(), "再按一次退出程序",
                        Toast.LENGTH_SHORT).show();
                exitTime = System.currentTimeMillis();
            } else {
            	
                moveTaskToBack(false);
                finish();
                
                android.os.Process.killProcess(android.os.Process.myPid());  
                System.exit(0);
                
//             for (Activity activity : MyApplication.activeActivityList) {
//					activity.finish();
//				}
            }
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
    
    
	
	
	/**
	 * calculate 公积金
	 * @param baseNumber :缴费基数
	 * 精确到小数点2位？，单位元
	 */
	private void calculatePublicFund(int baseNumber){
		
	}
	
	/**
	 * calculate 社保
	 * @param baseNumber :缴费基数
	 * 精确到小数点2位，单位元
	 */
	private void calculateSocialSecurity(int baseNumber){
		
	}
	
	
	/**
	 * calculate 个税
	 * @param baseNumber :缴费基数
	 * 精确到小数点2位，单位元
	 */
	private void calculatPersonIncomeTax(int baseNumber){
		
	}
	
}
