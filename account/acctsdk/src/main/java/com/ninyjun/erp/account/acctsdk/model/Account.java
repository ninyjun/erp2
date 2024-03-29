package com.ninyjun.erp.account.acctsdk.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Account {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACCOUNT.ACCT_ID
     *
     * @mbg.generated Sat Nov 30 11:41:45 CST 2019
     */
    private Long acctId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACCOUNT.ACCT_NAME
     *
     * @mbg.generated Sat Nov 30 11:41:45 CST 2019
     */
    private String acctName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACCOUNT.ACCT_DESCRIBE
     *
     * @mbg.generated Sat Nov 30 11:41:45 CST 2019
     */
    private String acctDescribe;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACCOUNT.CREATE_TIME
     *
     * @mbg.generated Sat Nov 30 11:41:45 CST 2019
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACCOUNT.CREATE_EMP_ID
     *
     * @mbg.generated Sat Nov 30 11:41:45 CST 2019
     */
    private String createEmpId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACCOUNT.CREATE_DEPART_ID
     *
     * @mbg.generated Sat Nov 30 11:41:45 CST 2019
     */
    private String createDepartId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACCOUNT.ACCT_ID
     *
     * @return the value of ACCOUNT.ACCT_ID
     *
     * @mbg.generated Sat Nov 30 11:41:45 CST 2019
     */
    public Long getAcctId() {
        return acctId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACCOUNT.ACCT_ID
     *
     * @param acctId the value for ACCOUNT.ACCT_ID
     *
     * @mbg.generated Sat Nov 30 11:41:45 CST 2019
     */
    public void setAcctId(Long acctId) {
        this.acctId = acctId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACCOUNT.ACCT_NAME
     *
     * @return the value of ACCOUNT.ACCT_NAME
     *
     * @mbg.generated Sat Nov 30 11:41:45 CST 2019
     */
    public String getAcctName() {
        return acctName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACCOUNT.ACCT_NAME
     *
     * @param acctName the value for ACCOUNT.ACCT_NAME
     *
     * @mbg.generated Sat Nov 30 11:41:45 CST 2019
     */
    public void setAcctName(String acctName) {
        this.acctName = acctName == null ? null : acctName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACCOUNT.ACCT_DESCRIBE
     *
     * @return the value of ACCOUNT.ACCT_DESCRIBE
     *
     * @mbg.generated Sat Nov 30 11:41:45 CST 2019
     */
    public String getAcctDescribe() {
        return acctDescribe;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACCOUNT.ACCT_DESCRIBE
     *
     * @param acctDescribe the value for ACCOUNT.ACCT_DESCRIBE
     *
     * @mbg.generated Sat Nov 30 11:41:45 CST 2019
     */
    public void setAcctDescribe(String acctDescribe) {
        this.acctDescribe = acctDescribe == null ? null : acctDescribe.trim();
    }

    @Override
    public String toString() {
        return "Account{" +
                "acctId=" + acctId +
                ", acctName='" + acctName + '\'' +
                ", acctDescribe='" + acctDescribe + '\'' +
                ", createTime=" + (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(createTime) +
                ", createEmpId='" + createEmpId + '\'' +
                ", createDepartId='" + createDepartId + '\'' +
                '}';
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACCOUNT.CREATE_TIME
     *
     * @return the value of ACCOUNT.CREATE_TIME
     *
     * @mbg.generated Sat Nov 30 11:41:45 CST 2019
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACCOUNT.CREATE_TIME
     *
     * @param createTime the value for ACCOUNT.CREATE_TIME
     *
     * @mbg.generated Sat Nov 30 11:41:45 CST 2019
     */
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACCOUNT.CREATE_EMP_ID
     *
     * @return the value of ACCOUNT.CREATE_EMP_ID
     *
     * @mbg.generated Sat Nov 30 11:41:45 CST 2019
     */
    public String getCreateEmpId() {
        return createEmpId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACCOUNT.CREATE_EMP_ID
     *
     * @param createEmpId the value for ACCOUNT.CREATE_EMP_ID
     *
     * @mbg.generated Sat Nov 30 11:41:45 CST 2019
     */
    public void setCreateEmpId(String createEmpId) {
        this.createEmpId = createEmpId == null ? null : createEmpId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACCOUNT.CREATE_DEPART_ID
     *
     * @return the value of ACCOUNT.CREATE_DEPART_ID
     *
     * @mbg.generated Sat Nov 30 11:41:45 CST 2019
     */
    public String getCreateDepartId() {
        return createDepartId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACCOUNT.CREATE_DEPART_ID
     *
     * @param createDepartId the value for ACCOUNT.CREATE_DEPART_ID
     *
     * @mbg.generated Sat Nov 30 11:41:45 CST 2019
     */
    public void setCreateDepartId(String createDepartId) {
        this.createDepartId = createDepartId == null ? null : createDepartId.trim();
    }
}