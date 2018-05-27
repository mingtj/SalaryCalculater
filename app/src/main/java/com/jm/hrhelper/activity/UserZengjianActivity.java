package com.jm.hrhelper.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.jm.hrhelper.R;
import com.jm.hrhelper.greendao.dao.SalaryDao;
import com.jm.hrhelper.greendao.dbmanager.SalaryDaoUtils;
import com.jm.hrhelper.greendao.entity.Staff;

import java.util.List;

public class UserZengjianActivity extends BaseActivity {

    private static final String TAG = "UserZjActivity";
    SalaryDaoUtils DaoUtils ;


    public static Intent newIntent(Context context) {
        Intent intent = new Intent(context, UserZengjianActivity.class);
//        intent.putExtra("videoPath", videoPath);
//        intent.putExtra("videoTitle", videoTitle);
        return intent;
    }

    public static void intentTo(Context context) {
        context.startActivity(newIntent(context));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_zengjian);

        DaoUtils = new SalaryDaoUtils(this);

        testGreenDaoAdd();

    }



    void testGreenDaoAdd(){
        Staff staff = new Staff();
        staff.setStaffNO("2");
        staff.setStaffName("mtk");

        staff.setStaffReserved1("");
        staff.setStaffReserved2("");
        staff.setStaffReserved3("");
        staff.setStaffReserved4("");
        staff.setStaffReserved5("");

        staff.setStaffBaseTrafficSubsidy(0);
        staff.setStaffBaseTelSubsidy(0);
        staff.setStaffBaseHouseSubsidy(0);
        staff.setStaffBaseEatSubsidy(0);

        staff.setStaffSubsidyGrade("2等");
        staff.setStaffPublicFundBase(0);
        staff.setStaffSheBaoBase(0);
        staff.setStaffBaseSalary(1000);
        staff.setStaffGrade("T5");
        staff.setStaffZhiwu("工程师");
        staff.setStaffBumen("研发部");
        staff.setStaffCompany("baidu");
        staff.setStaffEmail("mingtingjie@huan.tv");
        staff.setStaffTel("18667155226");
        staff.setStaffCardNo("420222199107246789");


        boolean status = DaoUtils.insertStaff(staff);
        System.out.println("insert status:"+status);

        testQueryStaff();
    }

    void testQueryStaff(){
        List<Staff> s = DaoUtils.queryAllStaff();
        for (int i=0;i<s.size();i++){
            System.out.println("=index:"+i+"==name:"+s.get(i).getStaffName());
        }

    }

    void updateStaff(){

    }

}
