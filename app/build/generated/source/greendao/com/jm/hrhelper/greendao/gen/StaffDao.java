package com.jm.hrhelper.greendao.gen;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.jm.hrhelper.greendao.entity.Staff;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "STAFF".
*/
public class StaffDao extends AbstractDao<Staff, Long> {

    public static final String TABLENAME = "STAFF";

    /**
     * Properties of entity Staff.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property _id = new Property(0, Long.class, "_id", true, "_id");
        public final static Property StaffNO = new Property(1, String.class, "StaffNO", false, "STAFF_NO");
        public final static Property StaffName = new Property(2, String.class, "StaffName", false, "STAFF_NAME");
        public final static Property StaffCardNo = new Property(3, String.class, "StaffCardNo", false, "STAFF_CARD_NO");
        public final static Property StaffEmail = new Property(4, String.class, "StaffEmail", false, "STAFF_EMAIL");
        public final static Property StaffTel = new Property(5, String.class, "StaffTel", false, "STAFF_TEL");
        public final static Property StaffCompany = new Property(6, String.class, "StaffCompany", false, "STAFF_COMPANY");
        public final static Property StaffBumen = new Property(7, String.class, "StaffBumen", false, "STAFF_BUMEN");
        public final static Property StaffZhiwu = new Property(8, String.class, "StaffZhiwu", false, "STAFF_ZHIWU");
        public final static Property StaffGrade = new Property(9, String.class, "StaffGrade", false, "STAFF_GRADE");
        public final static Property StaffBaseSalary = new Property(10, int.class, "StaffBaseSalary", false, "STAFF_BASE_SALARY");
        public final static Property StaffSheBaoBase = new Property(11, int.class, "StaffSheBaoBase", false, "STAFF_SHE_BAO_BASE");
        public final static Property StaffPublicFundBase = new Property(12, int.class, "StaffPublicFundBase", false, "STAFF_PUBLIC_FUND_BASE");
        public final static Property StaffSubsidyGrade = new Property(13, String.class, "StaffSubsidyGrade", false, "STAFF_SUBSIDY_GRADE");
        public final static Property StaffBaseEatSubsidy = new Property(14, int.class, "StaffBaseEatSubsidy", false, "STAFF_BASE_EAT_SUBSIDY");
        public final static Property StaffBaseHouseSubsidy = new Property(15, int.class, "StaffBaseHouseSubsidy", false, "STAFF_BASE_HOUSE_SUBSIDY");
        public final static Property StaffBaseTelSubsidy = new Property(16, int.class, "StaffBaseTelSubsidy", false, "STAFF_BASE_TEL_SUBSIDY");
        public final static Property StaffBaseTrafficSubsidy = new Property(17, int.class, "StaffBaseTrafficSubsidy", false, "STAFF_BASE_TRAFFIC_SUBSIDY");
        public final static Property StaffReserved1 = new Property(18, String.class, "StaffReserved1", false, "STAFF_RESERVED1");
        public final static Property StaffReserved2 = new Property(19, String.class, "StaffReserved2", false, "STAFF_RESERVED2");
        public final static Property StaffReserved3 = new Property(20, String.class, "StaffReserved3", false, "STAFF_RESERVED3");
        public final static Property StaffReserved4 = new Property(21, String.class, "StaffReserved4", false, "STAFF_RESERVED4");
        public final static Property StaffReserved5 = new Property(22, String.class, "StaffReserved5", false, "STAFF_RESERVED5");
    }


    public StaffDao(DaoConfig config) {
        super(config);
    }
    
    public StaffDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"STAFF\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: _id
                "\"STAFF_NO\" TEXT," + // 1: StaffNO
                "\"STAFF_NAME\" TEXT NOT NULL ," + // 2: StaffName
                "\"STAFF_CARD_NO\" TEXT," + // 3: StaffCardNo
                "\"STAFF_EMAIL\" TEXT," + // 4: StaffEmail
                "\"STAFF_TEL\" TEXT," + // 5: StaffTel
                "\"STAFF_COMPANY\" TEXT," + // 6: StaffCompany
                "\"STAFF_BUMEN\" TEXT," + // 7: StaffBumen
                "\"STAFF_ZHIWU\" TEXT," + // 8: StaffZhiwu
                "\"STAFF_GRADE\" TEXT," + // 9: StaffGrade
                "\"STAFF_BASE_SALARY\" INTEGER NOT NULL ," + // 10: StaffBaseSalary
                "\"STAFF_SHE_BAO_BASE\" INTEGER NOT NULL ," + // 11: StaffSheBaoBase
                "\"STAFF_PUBLIC_FUND_BASE\" INTEGER NOT NULL ," + // 12: StaffPublicFundBase
                "\"STAFF_SUBSIDY_GRADE\" TEXT," + // 13: StaffSubsidyGrade
                "\"STAFF_BASE_EAT_SUBSIDY\" INTEGER NOT NULL ," + // 14: StaffBaseEatSubsidy
                "\"STAFF_BASE_HOUSE_SUBSIDY\" INTEGER NOT NULL ," + // 15: StaffBaseHouseSubsidy
                "\"STAFF_BASE_TEL_SUBSIDY\" INTEGER NOT NULL ," + // 16: StaffBaseTelSubsidy
                "\"STAFF_BASE_TRAFFIC_SUBSIDY\" INTEGER NOT NULL ," + // 17: StaffBaseTrafficSubsidy
                "\"STAFF_RESERVED1\" TEXT," + // 18: StaffReserved1
                "\"STAFF_RESERVED2\" TEXT," + // 19: StaffReserved2
                "\"STAFF_RESERVED3\" TEXT," + // 20: StaffReserved3
                "\"STAFF_RESERVED4\" TEXT," + // 21: StaffReserved4
                "\"STAFF_RESERVED5\" TEXT);"); // 22: StaffReserved5
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"STAFF\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Staff entity) {
        stmt.clearBindings();
 
        Long _id = entity.get_id();
        if (_id != null) {
            stmt.bindLong(1, _id);
        }
 
        String StaffNO = entity.getStaffNO();
        if (StaffNO != null) {
            stmt.bindString(2, StaffNO);
        }
        stmt.bindString(3, entity.getStaffName());
 
        String StaffCardNo = entity.getStaffCardNo();
        if (StaffCardNo != null) {
            stmt.bindString(4, StaffCardNo);
        }
 
        String StaffEmail = entity.getStaffEmail();
        if (StaffEmail != null) {
            stmt.bindString(5, StaffEmail);
        }
 
        String StaffTel = entity.getStaffTel();
        if (StaffTel != null) {
            stmt.bindString(6, StaffTel);
        }
 
        String StaffCompany = entity.getStaffCompany();
        if (StaffCompany != null) {
            stmt.bindString(7, StaffCompany);
        }
 
        String StaffBumen = entity.getStaffBumen();
        if (StaffBumen != null) {
            stmt.bindString(8, StaffBumen);
        }
 
        String StaffZhiwu = entity.getStaffZhiwu();
        if (StaffZhiwu != null) {
            stmt.bindString(9, StaffZhiwu);
        }
 
        String StaffGrade = entity.getStaffGrade();
        if (StaffGrade != null) {
            stmt.bindString(10, StaffGrade);
        }
        stmt.bindLong(11, entity.getStaffBaseSalary());
        stmt.bindLong(12, entity.getStaffSheBaoBase());
        stmt.bindLong(13, entity.getStaffPublicFundBase());
 
        String StaffSubsidyGrade = entity.getStaffSubsidyGrade();
        if (StaffSubsidyGrade != null) {
            stmt.bindString(14, StaffSubsidyGrade);
        }
        stmt.bindLong(15, entity.getStaffBaseEatSubsidy());
        stmt.bindLong(16, entity.getStaffBaseHouseSubsidy());
        stmt.bindLong(17, entity.getStaffBaseTelSubsidy());
        stmt.bindLong(18, entity.getStaffBaseTrafficSubsidy());
 
        String StaffReserved1 = entity.getStaffReserved1();
        if (StaffReserved1 != null) {
            stmt.bindString(19, StaffReserved1);
        }
 
        String StaffReserved2 = entity.getStaffReserved2();
        if (StaffReserved2 != null) {
            stmt.bindString(20, StaffReserved2);
        }
 
        String StaffReserved3 = entity.getStaffReserved3();
        if (StaffReserved3 != null) {
            stmt.bindString(21, StaffReserved3);
        }
 
        String StaffReserved4 = entity.getStaffReserved4();
        if (StaffReserved4 != null) {
            stmt.bindString(22, StaffReserved4);
        }
 
        String StaffReserved5 = entity.getStaffReserved5();
        if (StaffReserved5 != null) {
            stmt.bindString(23, StaffReserved5);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Staff entity) {
        stmt.clearBindings();
 
        Long _id = entity.get_id();
        if (_id != null) {
            stmt.bindLong(1, _id);
        }
 
        String StaffNO = entity.getStaffNO();
        if (StaffNO != null) {
            stmt.bindString(2, StaffNO);
        }
        stmt.bindString(3, entity.getStaffName());
 
        String StaffCardNo = entity.getStaffCardNo();
        if (StaffCardNo != null) {
            stmt.bindString(4, StaffCardNo);
        }
 
        String StaffEmail = entity.getStaffEmail();
        if (StaffEmail != null) {
            stmt.bindString(5, StaffEmail);
        }
 
        String StaffTel = entity.getStaffTel();
        if (StaffTel != null) {
            stmt.bindString(6, StaffTel);
        }
 
        String StaffCompany = entity.getStaffCompany();
        if (StaffCompany != null) {
            stmt.bindString(7, StaffCompany);
        }
 
        String StaffBumen = entity.getStaffBumen();
        if (StaffBumen != null) {
            stmt.bindString(8, StaffBumen);
        }
 
        String StaffZhiwu = entity.getStaffZhiwu();
        if (StaffZhiwu != null) {
            stmt.bindString(9, StaffZhiwu);
        }
 
        String StaffGrade = entity.getStaffGrade();
        if (StaffGrade != null) {
            stmt.bindString(10, StaffGrade);
        }
        stmt.bindLong(11, entity.getStaffBaseSalary());
        stmt.bindLong(12, entity.getStaffSheBaoBase());
        stmt.bindLong(13, entity.getStaffPublicFundBase());
 
        String StaffSubsidyGrade = entity.getStaffSubsidyGrade();
        if (StaffSubsidyGrade != null) {
            stmt.bindString(14, StaffSubsidyGrade);
        }
        stmt.bindLong(15, entity.getStaffBaseEatSubsidy());
        stmt.bindLong(16, entity.getStaffBaseHouseSubsidy());
        stmt.bindLong(17, entity.getStaffBaseTelSubsidy());
        stmt.bindLong(18, entity.getStaffBaseTrafficSubsidy());
 
        String StaffReserved1 = entity.getStaffReserved1();
        if (StaffReserved1 != null) {
            stmt.bindString(19, StaffReserved1);
        }
 
        String StaffReserved2 = entity.getStaffReserved2();
        if (StaffReserved2 != null) {
            stmt.bindString(20, StaffReserved2);
        }
 
        String StaffReserved3 = entity.getStaffReserved3();
        if (StaffReserved3 != null) {
            stmt.bindString(21, StaffReserved3);
        }
 
        String StaffReserved4 = entity.getStaffReserved4();
        if (StaffReserved4 != null) {
            stmt.bindString(22, StaffReserved4);
        }
 
        String StaffReserved5 = entity.getStaffReserved5();
        if (StaffReserved5 != null) {
            stmt.bindString(23, StaffReserved5);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Staff readEntity(Cursor cursor, int offset) {
        Staff entity = new Staff( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // _id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // StaffNO
            cursor.getString(offset + 2), // StaffName
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // StaffCardNo
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // StaffEmail
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // StaffTel
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // StaffCompany
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // StaffBumen
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // StaffZhiwu
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // StaffGrade
            cursor.getInt(offset + 10), // StaffBaseSalary
            cursor.getInt(offset + 11), // StaffSheBaoBase
            cursor.getInt(offset + 12), // StaffPublicFundBase
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // StaffSubsidyGrade
            cursor.getInt(offset + 14), // StaffBaseEatSubsidy
            cursor.getInt(offset + 15), // StaffBaseHouseSubsidy
            cursor.getInt(offset + 16), // StaffBaseTelSubsidy
            cursor.getInt(offset + 17), // StaffBaseTrafficSubsidy
            cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18), // StaffReserved1
            cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19), // StaffReserved2
            cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20), // StaffReserved3
            cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21), // StaffReserved4
            cursor.isNull(offset + 22) ? null : cursor.getString(offset + 22) // StaffReserved5
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Staff entity, int offset) {
        entity.set_id(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setStaffNO(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setStaffName(cursor.getString(offset + 2));
        entity.setStaffCardNo(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setStaffEmail(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setStaffTel(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setStaffCompany(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setStaffBumen(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setStaffZhiwu(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setStaffGrade(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setStaffBaseSalary(cursor.getInt(offset + 10));
        entity.setStaffSheBaoBase(cursor.getInt(offset + 11));
        entity.setStaffPublicFundBase(cursor.getInt(offset + 12));
        entity.setStaffSubsidyGrade(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setStaffBaseEatSubsidy(cursor.getInt(offset + 14));
        entity.setStaffBaseHouseSubsidy(cursor.getInt(offset + 15));
        entity.setStaffBaseTelSubsidy(cursor.getInt(offset + 16));
        entity.setStaffBaseTrafficSubsidy(cursor.getInt(offset + 17));
        entity.setStaffReserved1(cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18));
        entity.setStaffReserved2(cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19));
        entity.setStaffReserved3(cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20));
        entity.setStaffReserved4(cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21));
        entity.setStaffReserved5(cursor.isNull(offset + 22) ? null : cursor.getString(offset + 22));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Staff entity, long rowId) {
        entity.set_id(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Staff entity) {
        if(entity != null) {
            return entity.get_id();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Staff entity) {
        return entity.get_id() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
