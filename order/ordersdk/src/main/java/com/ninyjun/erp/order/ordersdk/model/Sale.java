package com.ninyjun.erp.order.ordersdk.model;

import java.util.Date;

public class Sale {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALE.SALE_ID
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    private Long saleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALE.CUST_ID
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    private Long custId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALE.ACCT_ID
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    private Long acctId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALE.RECV_FEE
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    private Long recvFee;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALE.CHARGE_FEE
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    private Long chargeFee;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALE.CHECKOUT
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    private Integer checkout;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALE.SETTLE_ACCOUNT
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    private Integer settleAccount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALE.CREATE_TIME
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALE.CREATE_EMP_ID
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    private String createEmpId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALE.CREATE_DEPART_ID
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    private String createDepartId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALE.SALE_ID
     *
     * @return the value of SALE.SALE_ID
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    public Long getSaleId() {
        return saleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALE.SALE_ID
     *
     * @param saleId the value for SALE.SALE_ID
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    public void setSaleId(Long saleId) {
        this.saleId = saleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALE.CUST_ID
     *
     * @return the value of SALE.CUST_ID
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    public Long getCustId() {
        return custId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALE.CUST_ID
     *
     * @param custId the value for SALE.CUST_ID
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    public void setCustId(Long custId) {
        this.custId = custId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALE.ACCT_ID
     *
     * @return the value of SALE.ACCT_ID
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    public Long getAcctId() {
        return acctId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALE.ACCT_ID
     *
     * @param acctId the value for SALE.ACCT_ID
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    public void setAcctId(Long acctId) {
        this.acctId = acctId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALE.RECV_FEE
     *
     * @return the value of SALE.RECV_FEE
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    public Long getRecvFee() {
        return recvFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALE.RECV_FEE
     *
     * @param recvFee the value for SALE.RECV_FEE
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    public void setRecvFee(Long recvFee) {
        this.recvFee = recvFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALE.CHARGE_FEE
     *
     * @return the value of SALE.CHARGE_FEE
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    public Long getChargeFee() {
        return chargeFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALE.CHARGE_FEE
     *
     * @param chargeFee the value for SALE.CHARGE_FEE
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    public void setChargeFee(Long chargeFee) {
        this.chargeFee = chargeFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALE.CHECKOUT
     *
     * @return the value of SALE.CHECKOUT
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    public Integer getCheckout() {
        return checkout;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALE.CHECKOUT
     *
     * @param checkout the value for SALE.CHECKOUT
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    public void setCheckout(Integer checkout) {
        this.checkout = checkout;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALE.SETTLE_ACCOUNT
     *
     * @return the value of SALE.SETTLE_ACCOUNT
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    public Integer getSettleAccount() {
        return settleAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALE.SETTLE_ACCOUNT
     *
     * @param settleAccount the value for SALE.SETTLE_ACCOUNT
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    public void setSettleAccount(Integer settleAccount) {
        this.settleAccount = settleAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALE.CREATE_TIME
     *
     * @return the value of SALE.CREATE_TIME
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALE.CREATE_TIME
     *
     * @param createTime the value for SALE.CREATE_TIME
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALE.CREATE_EMP_ID
     *
     * @return the value of SALE.CREATE_EMP_ID
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    public String getCreateEmpId() {
        return createEmpId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALE.CREATE_EMP_ID
     *
     * @param createEmpId the value for SALE.CREATE_EMP_ID
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    public void setCreateEmpId(String createEmpId) {
        this.createEmpId = createEmpId == null ? null : createEmpId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALE.CREATE_DEPART_ID
     *
     * @return the value of SALE.CREATE_DEPART_ID
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    public String getCreateDepartId() {
        return createDepartId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALE.CREATE_DEPART_ID
     *
     * @param createDepartId the value for SALE.CREATE_DEPART_ID
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    public void setCreateDepartId(String createDepartId) {
        this.createDepartId = createDepartId == null ? null : createDepartId.trim();
    }
}