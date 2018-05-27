package com.jm.hrhelper.greendao.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Keep;
import org.greenrobot.greendao.annotation.NotNull;

/**
 * Created by mingtingjie on 18/4/24.
 * 员工对象
 */

@Entity
public class Staff {
    @Id(autoincrement = true)
    private Long _id;
    private String StaffNO;//员工编号
    @NotNull
    private String StaffName;//员工Name
    private String StaffCardNo;//员工身份证号码
    private String StaffEmail;//邮箱
    private String StaffTel;//员工手机号码
    private String StaffCompany;//员工隶属的的子公司名称,或者隶属的分公司名称
    private String StaffBumen;//部门
    private String StaffZhiwu;//职务
    private String StaffGrade;//职务等级
    private int StaffBaseSalary;//员工基本薪酬
    private int StaffSheBaoBase;//社保缴费基数
    private int StaffPublicFundBase;//公积金缴纳基数
    private String StaffSubsidyGrade;//补助标准级别  大企业，老国企，央企可能用到吧
    private int StaffBaseEatSubsidy;//饭补：元/餐
    private int StaffBaseHouseSubsidy;//住房补助：元/月
    private int StaffBaseTelSubsidy;//电话补助：元/月
    private int StaffBaseTrafficSubsidy;//交通补助： 元/月
    private String StaffReserved1;//预留字段1
    private String StaffReserved2;//预留字段2
    private String StaffReserved3;//预留字段3
    private String StaffReserved4;//预留字段4
    private String StaffReserved5;//预留字段5

    @Keep
    public Staff(Long _id,String StaffNO,@NotNull String StaffName,String StaffCardNo,String StaffEmail,String StaffTel,
                 String StaffCompany,String StaffBumen,String StaffZhiwu,String StaffGrade,int StaffBaseSalary,
                 int StaffSheBaoBase,int StaffPublicFundBase,String StaffSubsidyGrade,int StaffBaseEatSubsidy,
                 int StaffBaseHouseSubsidy,int StaffBaseTelSubsidy,int StaffBaseTrafficSubsidy,String StaffReserved1,
                 String StaffReserved2,String StaffReserved3,String StaffReserved4,String StaffReserved5){

        this._id = _id; this.StaffNO = StaffNO;  this.StaffName = StaffName;  this.StaffCardNo = StaffCardNo;
        this.StaffEmail = StaffEmail;  this.StaffTel = StaffTel;  this.StaffCompany = StaffCompany;
        this.StaffBumen = StaffBumen;  this.StaffZhiwu = StaffZhiwu;  this.StaffGrade = StaffGrade;
        this.StaffBaseSalary = StaffBaseSalary;  this.StaffSheBaoBase = StaffSheBaoBase; this.StaffPublicFundBase = StaffPublicFundBase;
        this.StaffSubsidyGrade = StaffSubsidyGrade; this.StaffBaseEatSubsidy = StaffBaseEatSubsidy; this.StaffBaseHouseSubsidy = StaffBaseHouseSubsidy;
        this.StaffBaseTelSubsidy = StaffBaseTelSubsidy;  this.StaffBaseTrafficSubsidy = StaffBaseTrafficSubsidy; this.StaffReserved1 = StaffReserved1;
        this.StaffReserved2 = StaffReserved2; this.StaffReserved3 = StaffReserved3; this.StaffReserved4 = StaffReserved4; this.StaffReserved5 = StaffReserved5;

    }
    @Keep
    public Staff(){
    }


    public Long get_id() {
        return _id;
    }

    public void set_id(Long _id) {
        this._id = _id;
    }

    public String getStaffNO() {
        return StaffNO;
    }

    public void setStaffNO(String staffNO) {
        StaffNO = staffNO;
    }

    public String getStaffName() {
        return StaffName;
    }

    public void setStaffName(String staffName) {
        StaffName = staffName;
    }

    public String getStaffCardNo() {
        return StaffCardNo;
    }

    public void setStaffCardNo(String staffCardNo) {
        StaffCardNo = staffCardNo;
    }

    public String getStaffEmail() {
        return StaffEmail;
    }

    public void setStaffEmail(String staffEmail) {
        StaffEmail = staffEmail;
    }

    public String getStaffTel() {
        return StaffTel;
    }

    public void setStaffTel(String staffTel) {
        StaffTel = staffTel;
    }

    public String getStaffCompany() {
        return StaffCompany;
    }

    public void setStaffCompany(String staffCompany) {
        StaffCompany = staffCompany;
    }

    public String getStaffBumen() {
        return StaffBumen;
    }

    public void setStaffBumen(String staffBumen) {
        StaffBumen = staffBumen;
    }

    public String getStaffZhiwu() {
        return StaffZhiwu;
    }

    public void setStaffZhiwu(String staffZhiwu) {
        StaffZhiwu = staffZhiwu;
    }

    public String getStaffGrade() {
        return StaffGrade;
    }

    public void setStaffGrade(String staffGrade) {
        StaffGrade = staffGrade;
    }

    public int getStaffBaseSalary() {
        return StaffBaseSalary;
    }

    public void setStaffBaseSalary(int staffBaseSalary) {
        StaffBaseSalary = staffBaseSalary;
    }

    public int getStaffSheBaoBase() {
        return StaffSheBaoBase;
    }

    public void setStaffSheBaoBase(int staffSheBaoBase) {
        StaffSheBaoBase = staffSheBaoBase;
    }

    public int getStaffPublicFundBase() {
        return StaffPublicFundBase;
    }

    public void setStaffPublicFundBase(int staffPublicFundBase) {
        StaffPublicFundBase = staffPublicFundBase;
    }

    public String getStaffSubsidyGrade() {
        return StaffSubsidyGrade;
    }

    public void setStaffSubsidyGrade(String staffSubsidyGrade) {
        StaffSubsidyGrade = staffSubsidyGrade;
    }

    public int getStaffBaseEatSubsidy() {
        return StaffBaseEatSubsidy;
    }

    public void setStaffBaseEatSubsidy(int staffBaseEatSubsidy) {
        StaffBaseEatSubsidy = staffBaseEatSubsidy;
    }

    public int getStaffBaseHouseSubsidy() {
        return StaffBaseHouseSubsidy;
    }

    public void setStaffBaseHouseSubsidy(int staffBaseHouseSubsidy) {
        StaffBaseHouseSubsidy = staffBaseHouseSubsidy;
    }

    public int getStaffBaseTelSubsidy() {
        return StaffBaseTelSubsidy;
    }

    public void setStaffBaseTelSubsidy(int staffBaseTelSubsidy) {
        StaffBaseTelSubsidy = staffBaseTelSubsidy;
    }

    public int getStaffBaseTrafficSubsidy() {
        return StaffBaseTrafficSubsidy;
    }

    public void setStaffBaseTrafficSubsidy(int staffBaseTrafficSubsidy) {
        StaffBaseTrafficSubsidy = staffBaseTrafficSubsidy;
    }

    public String getStaffReserved1() {
        return StaffReserved1;
    }

    public void setStaffReserved1(String staffReserved1) {
        StaffReserved1 = staffReserved1;
    }

    public String getStaffReserved2() {
        return StaffReserved2;
    }

    public void setStaffReserved2(String staffReserved2) {
        StaffReserved2 = staffReserved2;
    }

    public String getStaffReserved3() {
        return StaffReserved3;
    }

    public void setStaffReserved3(String staffReserved3) {
        StaffReserved3 = staffReserved3;
    }

    public String getStaffReserved4() {
        return StaffReserved4;
    }

    public void setStaffReserved4(String staffReserved4) {
        StaffReserved4 = staffReserved4;
    }

    public String getStaffReserved5() {
        return StaffReserved5;
    }

    public void setStaffReserved5(String staffReserved5) {
        StaffReserved5 = staffReserved5;
    }
}
