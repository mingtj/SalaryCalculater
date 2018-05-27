package com.jm.hrhelper.greendao.dbmanager;

import android.content.Context;
import android.util.Log;

import com.jm.hrhelper.greendao.dao.SalaryDao;
import com.jm.hrhelper.greendao.entity.Staff;

import org.greenrobot.greendao.query.QueryBuilder;

import java.util.List;

/**
 * 完成对某一张数据表的具体操作，ORM操作
 *  Created by mingtingjie on 18/4/23.
 */

public class SalaryDaoUtils {
    private static final String TAG = SalaryDaoUtils.class.getSimpleName();
    private GreenDaoManager mManager;

    public SalaryDaoUtils(Context context) {
        mManager = GreenDaoManager.getInstance();
        mManager.init(context);
    }

    /**
     * 完成staff记录的插入，如果表未创建，先创建Staff表
     *
     * @param staff
     * @return
     */
    public boolean insertStaff(Staff staff) {
        boolean flag = false;

        flag = mManager.getDaoSession().getSalaryDao().insert(staff) == -1 ? false : true;
        Log.i(TAG, "insert Staff :" + flag + "-->" + staff.toString());

        return flag;
    }

    /**
     * 插入多条数据，在子线程操作
     * @param staffList
     * @return
     */
    public boolean insertStaffList(final List<Staff> staffList) {
        boolean flag = false;
        try {
            mManager.getDaoSession().runInTx(new Runnable() {
                @Override
                public void run() {
                    for (Staff staff : staffList) {
                        mManager.getDaoSession().insertOrReplace(staff);
                    }
                }
            });
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    /**
     * 修改一条数据
     * @param staff
     * @return
     */
    public boolean updateStaff(Staff staff){
        boolean flag = false;
        try {
            mManager.getDaoSession().update(staff);
            flag = true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    /**
     * 删除单条记录
     * @param staff
     * @return
     */
    public boolean deleteStaff(Staff staff){
        boolean flag = false;
        try {
            //按照id删除
            mManager.getDaoSession().delete(staff);
            flag = true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    /**
     * 删除所有记录
     * @return
     */
    public boolean deleteAll(){
        boolean flag = false;
        try {
            //按照id删除
            mManager.getDaoSession().deleteAll(Staff.class);
            flag = true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    /**
     * 查询所有记录
     * @return
     */
    public List<Staff> queryAllStaff(){
        return mManager.getDaoSession().loadAll(Staff.class);
    }

    /**
     * 根据主键id查询记录
     * @param key
     * @return
     */
    public Staff queryStaffById(long key){
        return mManager.getDaoSession().load(Staff.class, key);
    }

    /**
     * 使用native sql进行查询操作
     *
     */
    public List<Staff> queryStaffByNativeSql(String sql, String[] conditions){
        return mManager.getDaoSession().queryRaw(Staff.class, sql, conditions);
    }

    /**Salary
     * 使用queryBuilder进行查询
     * @return
     */
    public List<Staff> queryStaffByQueryBuilder(long id){
        QueryBuilder<Staff> queryBuilder = mManager.getDaoSession().queryBuilder(Staff.class);
        return queryBuilder.where(SalaryDao.Properties._id.eq(id)).list();
    }
}
