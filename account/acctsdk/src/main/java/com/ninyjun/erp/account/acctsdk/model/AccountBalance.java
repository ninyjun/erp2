package com.ninyjun.erp.account.acctsdk.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class AccountBalance {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACCOUNT_BALANCE.ACCT_BALANCE_ID
     *
     * @mbg.generated Sat Nov 30 11:41:45 CST 2019
     */
    private Long acctBalanceId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACCOUNT_BALANCE.ACCT_ID
     *
     * @mbg.generated Sat Nov 30 11:41:45 CST 2019
     */
    private Long acctId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACCOUNT_BALANCE.ACCT_BALANCE_TYPE_CODE
     *
     * @mbg.generated Sat Nov 30 11:41:45 CST 2019
     */
    private Integer acctBalanceTypeCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACCOUNT_BALANCE.ACCT_BALANCE
     *
     * @mbg.generated Sat Nov 30 11:41:45 CST 2019
     */
    private Long acctBalance;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACCOUNT_BALANCE.ACCT_BALANCE_INIT
     *
     * @mbg.generated Sat Nov 30 11:41:45 CST 2019
     */
    private Long acctBalanceInit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACCOUNT_BALANCE.VERSION_NO
     *
     * @mbg.generated Sat Nov 30 11:41:45 CST 2019
     */
    private Long versionNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACCOUNT_BALANCE.CREATE_TIME
     *
     * @mbg.generated Sat Nov 30 11:41:45 CST 2019
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACCOUNT_BALANCE.CREATE_EMP_ID
     *
     * @mbg.generated Sat Nov 30 11:41:45 CST 2019
     */
    private String createEmpId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACCOUNT_BALANCE.CREATE_DEPART_ID
     *
     * @mbg.generated Sat Nov 30 11:41:45 CST 2019
     */
    private String createDepartId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACCOUNT_BALANCE.ACCT_BALANCE_ID
     *
     * @return the value of ACCOUNT_BALANCE.ACCT_BALANCE_ID
     *
     * @mbg.generated Sat Nov 30 11:41:45 CST 2019
     */
    public Long getAcctBalanceId() {
        return acctBalanceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACCOUNT_BALANCE.ACCT_BALANCE_ID
     *
     * @param acctBalanceId the value for ACCOUNT_BALANCE.ACCT_BALANCE_ID
     *
     * @mbg.generated Sat Nov 30 11:41:45 CST 2019
     */
    public void setAcctBalanceId(Long acctBalanceId) {
        this.acctBalanceId = acctBalanceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACCOUNT_BALANCE.ACCT_ID
     *
     * @return the value of ACCOUNT_BALANCE.ACCT_ID
     *
     * @mbg.generated Sat Nov 30 11:41:45 CST 2019
     */
    public Long getAcctId() {
        return acctId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACCOUNT_BALANCE.ACCT_ID
     *
     * @param acctId the value for ACCOUNT_BALANCE.ACCT_ID
     *
     * @mbg.generated Sat Nov 30 11:41:45 CST 2019
     */
    public void setAcctId(Long acctId) {
        this.acctId = acctId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACCOUNT_BALANCE.ACCT_BALANCE_TYPE_CODE
     *
     * @return the value of ACCOUNT_BALANCE.ACCT_BALANCE_TYPE_CODE
     *
     * @mbg.generated Sat Nov 30 11:41:45 CST 2019
     */
    public Integer getAcctBalanceTypeCode() {
        return acctBalanceTypeCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACCOUNT_BALANCE.ACCT_BALANCE_TYPE_CODE
     *
     * @param acctBalanceTypeCode the value for ACCOUNT_BALANCE.ACCT_BALANCE_TYPE_CODE
     *
     * @mbg.generated Sat Nov 30 11:41:45 CST 2019
     */
    public void setAcctBalanceTypeCode(Integer acctBalanceTypeCode) {
        this.acctBalanceTypeCode = acctBalanceTypeCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACCOUNT_BALANCE.ACCT_BALANCE
     *
     * @return the value of ACCOUNT_BALANCE.ACCT_BALANCE
     *
     * @mbg.generated Sat Nov 30 11:41:45 CST 2019
     */
    public Long getAcctBalance() {
        return acctBalance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACCOUNT_BALANCE.ACCT_BALANCE
     *
     * @param acctBalance the value for ACCOUNT_BALANCE.ACCT_BALANCE
     *
     * @mbg.generated Sat Nov 30 11:41:45 CST 2019
     */
    public void setAcctBalance(Long acctBalance) {
        this.acctBalance = acctBalance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACCOUNT_BALANCE.ACCT_BALANCE_INIT
     *
     * @return the value of ACCOUNT_BALANCE.ACCT_BALANCE_INIT
     *
     * @mbg.generated Sat Nov 30 11:41:45 CST 2019
     */
    public Long getAcctBalanceInit() {
        return acctBalanceInit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACCOUNT_BALANCE.ACCT_BALANCE_INIT
     *
     * @param acctBalanceInit the value for ACCOUNT_BALANCE.ACCT_BALANCE_INIT
     *
     * @mbg.generated Sat Nov 30 11:41:45 CST 2019
     */
    public void setAcctBalanceInit(Long acctBalanceInit) {
        this.acctBalanceInit = acctBalanceInit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACCOUNT_BALANCE.VERSION_NO
     *
     * @return the value of ACCOUNT_BALANCE.VERSION_NO
     *
     * @mbg.generated Sat Nov 30 11:41:45 CST 2019
     */
    public Long getVersionNo() {
        return versionNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACCOUNT_BALANCE.VERSION_NO
     *
     * @param versionNo the value for ACCOUNT_BALANCE.VERSION_NO
     *
     * @mbg.generated Sat Nov 30 11:41:45 CST 2019
     */
    public void setVersionNo(Long versionNo) {
        this.versionNo = versionNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACCOUNT_BALANCE.CREATE_TIME
     *
     * @return the value of ACCOUNT_BALANCE.CREATE_TIME
     *
     * @mbg.generated Sat Nov 30 11:41:45 CST 2019
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    public Date getCreateTime() {
        return createTime;
    }

    @Override
    public String toString() {
        return "AccountBalance{" +
                "acctBalanceId=" + acctBalanceId +
                ", acctId=" + acctId +
                ", acctBalanceTypeCode=" + acctBalanceTypeCode +
                ", acctBalance=" + acctBalance +
                ", acctBalanceInit=" + acctBalanceInit +
                ", versionNo=" + versionNo +
                ", createTime=" + createTime +
                ", createEmpId='" + createEmpId + '\'' +
                ", createDepartId='" + createDepartId + '\'' +
                '}';
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACCOUNT_BALANCE.CREATE_TIME
     *
     * @param createTime the value for ACCOUNT_BALANCE.CREATE_TIME
     *
     * @mbg.generated Sat Nov 30 11:41:45 CST 2019
     */
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACCOUNT_BALANCE.CREATE_EMP_ID
     *
     * @return the value of ACCOUNT_BALANCE.CREATE_EMP_ID
     *
     * @mbg.generated Sat Nov 30 11:41:45 CST 2019
     */
    public String getCreateEmpId() {
        return createEmpId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACCOUNT_BALANCE.CREATE_EMP_ID
     *
     * @param createEmpId the value for ACCOUNT_BALANCE.CREATE_EMP_ID
     *
     * @mbg.generated Sat Nov 30 11:41:45 CST 2019
     */
    public void setCreateEmpId(String createEmpId) {
        this.createEmpId = createEmpId == null ? null : createEmpId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACCOUNT_BALANCE.CREATE_DEPART_ID
     *
     * @return the value of ACCOUNT_BALANCE.CREATE_DEPART_ID
     *
     * @mbg.generated Sat Nov 30 11:41:45 CST 2019
     */
    public String getCreateDepartId() {
        return createDepartId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACCOUNT_BALANCE.CREATE_DEPART_ID
     *
     * @param createDepartId the value for ACCOUNT_BALANCE.CREATE_DEPART_ID
     *
     * @mbg.generated Sat Nov 30 11:41:45 CST 2019
     */
    public void setCreateDepartId(String createDepartId) {
        this.createDepartId = createDepartId == null ? null : createDepartId.trim();
    }
}