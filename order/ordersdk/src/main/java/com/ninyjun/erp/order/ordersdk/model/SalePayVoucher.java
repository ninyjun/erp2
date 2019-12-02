package com.ninyjun.erp.order.ordersdk.model;

import java.util.Date;

public class SalePayVoucher {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALE_PAY_VOUCHER.SALE_PAY_VOUCHER_ID
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    private Long salePayVoucherId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALE_PAY_VOUCHER.SALE_ID
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    private Long saleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALE_PAY_VOUCHER.PAY_MODE
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    private Integer payMode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALE_PAY_VOUCHER.PAY_VOUCHER_NO
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    private String payVoucherNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALE_PAY_VOUCHER.PAY_FEE
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    private Long payFee;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALE_PAY_VOUCHER.FINANCIAL_CODE
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    private String financialCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALE_PAY_VOUCHER.FINANCIAL_NAME
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    private String financialName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALE_PAY_VOUCHER.CARD_NO
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    private String cardNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALE_PAY_VOUCHER.INVALID_DATE
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    private Date invalidDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALE_PAY_VOUCHER.SALE_PAY_VOUCHER_ID
     *
     * @return the value of SALE_PAY_VOUCHER.SALE_PAY_VOUCHER_ID
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    public Long getSalePayVoucherId() {
        return salePayVoucherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALE_PAY_VOUCHER.SALE_PAY_VOUCHER_ID
     *
     * @param salePayVoucherId the value for SALE_PAY_VOUCHER.SALE_PAY_VOUCHER_ID
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    public void setSalePayVoucherId(Long salePayVoucherId) {
        this.salePayVoucherId = salePayVoucherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALE_PAY_VOUCHER.SALE_ID
     *
     * @return the value of SALE_PAY_VOUCHER.SALE_ID
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    public Long getSaleId() {
        return saleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALE_PAY_VOUCHER.SALE_ID
     *
     * @param saleId the value for SALE_PAY_VOUCHER.SALE_ID
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    public void setSaleId(Long saleId) {
        this.saleId = saleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALE_PAY_VOUCHER.PAY_MODE
     *
     * @return the value of SALE_PAY_VOUCHER.PAY_MODE
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    public Integer getPayMode() {
        return payMode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALE_PAY_VOUCHER.PAY_MODE
     *
     * @param payMode the value for SALE_PAY_VOUCHER.PAY_MODE
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    public void setPayMode(Integer payMode) {
        this.payMode = payMode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALE_PAY_VOUCHER.PAY_VOUCHER_NO
     *
     * @return the value of SALE_PAY_VOUCHER.PAY_VOUCHER_NO
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    public String getPayVoucherNo() {
        return payVoucherNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALE_PAY_VOUCHER.PAY_VOUCHER_NO
     *
     * @param payVoucherNo the value for SALE_PAY_VOUCHER.PAY_VOUCHER_NO
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    public void setPayVoucherNo(String payVoucherNo) {
        this.payVoucherNo = payVoucherNo == null ? null : payVoucherNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALE_PAY_VOUCHER.PAY_FEE
     *
     * @return the value of SALE_PAY_VOUCHER.PAY_FEE
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    public Long getPayFee() {
        return payFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALE_PAY_VOUCHER.PAY_FEE
     *
     * @param payFee the value for SALE_PAY_VOUCHER.PAY_FEE
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    public void setPayFee(Long payFee) {
        this.payFee = payFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALE_PAY_VOUCHER.FINANCIAL_CODE
     *
     * @return the value of SALE_PAY_VOUCHER.FINANCIAL_CODE
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    public String getFinancialCode() {
        return financialCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALE_PAY_VOUCHER.FINANCIAL_CODE
     *
     * @param financialCode the value for SALE_PAY_VOUCHER.FINANCIAL_CODE
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    public void setFinancialCode(String financialCode) {
        this.financialCode = financialCode == null ? null : financialCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALE_PAY_VOUCHER.FINANCIAL_NAME
     *
     * @return the value of SALE_PAY_VOUCHER.FINANCIAL_NAME
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    public String getFinancialName() {
        return financialName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALE_PAY_VOUCHER.FINANCIAL_NAME
     *
     * @param financialName the value for SALE_PAY_VOUCHER.FINANCIAL_NAME
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    public void setFinancialName(String financialName) {
        this.financialName = financialName == null ? null : financialName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALE_PAY_VOUCHER.CARD_NO
     *
     * @return the value of SALE_PAY_VOUCHER.CARD_NO
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALE_PAY_VOUCHER.CARD_NO
     *
     * @param cardNo the value for SALE_PAY_VOUCHER.CARD_NO
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALE_PAY_VOUCHER.INVALID_DATE
     *
     * @return the value of SALE_PAY_VOUCHER.INVALID_DATE
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    public Date getInvalidDate() {
        return invalidDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALE_PAY_VOUCHER.INVALID_DATE
     *
     * @param invalidDate the value for SALE_PAY_VOUCHER.INVALID_DATE
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    public void setInvalidDate(Date invalidDate) {
        this.invalidDate = invalidDate;
    }
}