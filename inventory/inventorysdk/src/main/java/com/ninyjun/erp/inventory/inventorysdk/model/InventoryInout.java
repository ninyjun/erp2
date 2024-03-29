package com.ninyjun.erp.inventory.inventorysdk.model;

import java.util.Date;

public class InventoryInout {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INVENTORY_INOUT.INVENTORY_INOUT_ID
     *
     * @mbg.generated Mon Dec 02 16:05:08 CST 2019
     */
    private Long inventoryInoutId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INVENTORY_INOUT.INVENTORY_NO
     *
     * @mbg.generated Mon Dec 02 16:05:08 CST 2019
     */
    private String inventoryNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INVENTORY_INOUT.INOUT_TYPE
     *
     * @mbg.generated Mon Dec 02 16:05:08 CST 2019
     */
    private Integer inoutType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INVENTORY_INOUT.PRODUCT_CODE
     *
     * @mbg.generated Mon Dec 02 16:05:08 CST 2019
     */
    private Integer productCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INVENTORY_INOUT.INVENTORY_BATCH_NO_ID
     *
     * @mbg.generated Mon Dec 02 16:05:08 CST 2019
     */
    private Integer inventoryBatchNoId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INVENTORY_INOUT.AMOUNT
     *
     * @mbg.generated Mon Dec 02 16:05:08 CST 2019
     */
    private Long amount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INVENTORY_INOUT.INVENTORY_ID
     *
     * @mbg.generated Mon Dec 02 16:05:08 CST 2019
     */
    private Long inventoryId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INVENTORY_INOUT.STOREHOUSE_CODE
     *
     * @mbg.generated Mon Dec 02 16:05:08 CST 2019
     */
    private Integer storehouseCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INVENTORY_INOUT.VERSION_NO
     *
     * @mbg.generated Mon Dec 02 16:05:08 CST 2019
     */
    private Long versionNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INVENTORY_INOUT.INVENTORY_AMOUNT
     *
     * @mbg.generated Mon Dec 02 16:05:08 CST 2019
     */
    private Long inventoryAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INVENTORY_INOUT.CREATE_TIME
     *
     * @mbg.generated Mon Dec 02 16:05:08 CST 2019
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INVENTORY_INOUT.CREATE_EMP_ID
     *
     * @mbg.generated Mon Dec 02 16:05:08 CST 2019
     */
    private String createEmpId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INVENTORY_INOUT.CREATE_DEPART_ID
     *
     * @mbg.generated Mon Dec 02 16:05:08 CST 2019
     */
    private String createDepartId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INVENTORY_INOUT.INVENTORY_INOUT_ID
     *
     * @return the value of INVENTORY_INOUT.INVENTORY_INOUT_ID
     *
     * @mbg.generated Mon Dec 02 16:05:08 CST 2019
     */
    public Long getInventoryInoutId() {
        return inventoryInoutId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INVENTORY_INOUT.INVENTORY_INOUT_ID
     *
     * @param inventoryInoutId the value for INVENTORY_INOUT.INVENTORY_INOUT_ID
     *
     * @mbg.generated Mon Dec 02 16:05:08 CST 2019
     */
    public void setInventoryInoutId(Long inventoryInoutId) {
        this.inventoryInoutId = inventoryInoutId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INVENTORY_INOUT.INVENTORY_NO
     *
     * @return the value of INVENTORY_INOUT.INVENTORY_NO
     *
     * @mbg.generated Mon Dec 02 16:05:08 CST 2019
     */
    public String getInventoryNo() {
        return inventoryNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INVENTORY_INOUT.INVENTORY_NO
     *
     * @param inventoryNo the value for INVENTORY_INOUT.INVENTORY_NO
     *
     * @mbg.generated Mon Dec 02 16:05:08 CST 2019
     */
    public void setInventoryNo(String inventoryNo) {
        this.inventoryNo = inventoryNo == null ? null : inventoryNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INVENTORY_INOUT.INOUT_TYPE
     *
     * @return the value of INVENTORY_INOUT.INOUT_TYPE
     *
     * @mbg.generated Mon Dec 02 16:05:08 CST 2019
     */
    public Integer getInoutType() {
        return inoutType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INVENTORY_INOUT.INOUT_TYPE
     *
     * @param inoutType the value for INVENTORY_INOUT.INOUT_TYPE
     *
     * @mbg.generated Mon Dec 02 16:05:08 CST 2019
     */
    public void setInoutType(Integer inoutType) {
        this.inoutType = inoutType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INVENTORY_INOUT.PRODUCT_CODE
     *
     * @return the value of INVENTORY_INOUT.PRODUCT_CODE
     *
     * @mbg.generated Mon Dec 02 16:05:08 CST 2019
     */
    public Integer getProductCode() {
        return productCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INVENTORY_INOUT.PRODUCT_CODE
     *
     * @param productCode the value for INVENTORY_INOUT.PRODUCT_CODE
     *
     * @mbg.generated Mon Dec 02 16:05:08 CST 2019
     */
    public void setProductCode(Integer productCode) {
        this.productCode = productCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INVENTORY_INOUT.INVENTORY_BATCH_NO_ID
     *
     * @return the value of INVENTORY_INOUT.INVENTORY_BATCH_NO_ID
     *
     * @mbg.generated Mon Dec 02 16:05:08 CST 2019
     */
    public Integer getInventoryBatchNoId() {
        return inventoryBatchNoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INVENTORY_INOUT.INVENTORY_BATCH_NO_ID
     *
     * @param inventoryBatchNoId the value for INVENTORY_INOUT.INVENTORY_BATCH_NO_ID
     *
     * @mbg.generated Mon Dec 02 16:05:08 CST 2019
     */
    public void setInventoryBatchNoId(Integer inventoryBatchNoId) {
        this.inventoryBatchNoId = inventoryBatchNoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INVENTORY_INOUT.AMOUNT
     *
     * @return the value of INVENTORY_INOUT.AMOUNT
     *
     * @mbg.generated Mon Dec 02 16:05:08 CST 2019
     */
    public Long getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INVENTORY_INOUT.AMOUNT
     *
     * @param amount the value for INVENTORY_INOUT.AMOUNT
     *
     * @mbg.generated Mon Dec 02 16:05:08 CST 2019
     */
    public void setAmount(Long amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INVENTORY_INOUT.INVENTORY_ID
     *
     * @return the value of INVENTORY_INOUT.INVENTORY_ID
     *
     * @mbg.generated Mon Dec 02 16:05:08 CST 2019
     */
    public Long getInventoryId() {
        return inventoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INVENTORY_INOUT.INVENTORY_ID
     *
     * @param inventoryId the value for INVENTORY_INOUT.INVENTORY_ID
     *
     * @mbg.generated Mon Dec 02 16:05:08 CST 2019
     */
    public void setInventoryId(Long inventoryId) {
        this.inventoryId = inventoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INVENTORY_INOUT.STOREHOUSE_CODE
     *
     * @return the value of INVENTORY_INOUT.STOREHOUSE_CODE
     *
     * @mbg.generated Mon Dec 02 16:05:08 CST 2019
     */
    public Integer getStorehouseCode() {
        return storehouseCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INVENTORY_INOUT.STOREHOUSE_CODE
     *
     * @param storehouseCode the value for INVENTORY_INOUT.STOREHOUSE_CODE
     *
     * @mbg.generated Mon Dec 02 16:05:08 CST 2019
     */
    public void setStorehouseCode(Integer storehouseCode) {
        this.storehouseCode = storehouseCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INVENTORY_INOUT.VERSION_NO
     *
     * @return the value of INVENTORY_INOUT.VERSION_NO
     *
     * @mbg.generated Mon Dec 02 16:05:08 CST 2019
     */
    public Long getVersionNo() {
        return versionNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INVENTORY_INOUT.VERSION_NO
     *
     * @param versionNo the value for INVENTORY_INOUT.VERSION_NO
     *
     * @mbg.generated Mon Dec 02 16:05:08 CST 2019
     */
    public void setVersionNo(Long versionNo) {
        this.versionNo = versionNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INVENTORY_INOUT.INVENTORY_AMOUNT
     *
     * @return the value of INVENTORY_INOUT.INVENTORY_AMOUNT
     *
     * @mbg.generated Mon Dec 02 16:05:08 CST 2019
     */
    public Long getInventoryAmount() {
        return inventoryAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INVENTORY_INOUT.INVENTORY_AMOUNT
     *
     * @param inventoryAmount the value for INVENTORY_INOUT.INVENTORY_AMOUNT
     *
     * @mbg.generated Mon Dec 02 16:05:08 CST 2019
     */
    public void setInventoryAmount(Long inventoryAmount) {
        this.inventoryAmount = inventoryAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INVENTORY_INOUT.CREATE_TIME
     *
     * @return the value of INVENTORY_INOUT.CREATE_TIME
     *
     * @mbg.generated Mon Dec 02 16:05:08 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INVENTORY_INOUT.CREATE_TIME
     *
     * @param createTime the value for INVENTORY_INOUT.CREATE_TIME
     *
     * @mbg.generated Mon Dec 02 16:05:08 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INVENTORY_INOUT.CREATE_EMP_ID
     *
     * @return the value of INVENTORY_INOUT.CREATE_EMP_ID
     *
     * @mbg.generated Mon Dec 02 16:05:08 CST 2019
     */
    public String getCreateEmpId() {
        return createEmpId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INVENTORY_INOUT.CREATE_EMP_ID
     *
     * @param createEmpId the value for INVENTORY_INOUT.CREATE_EMP_ID
     *
     * @mbg.generated Mon Dec 02 16:05:08 CST 2019
     */
    public void setCreateEmpId(String createEmpId) {
        this.createEmpId = createEmpId == null ? null : createEmpId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INVENTORY_INOUT.CREATE_DEPART_ID
     *
     * @return the value of INVENTORY_INOUT.CREATE_DEPART_ID
     *
     * @mbg.generated Mon Dec 02 16:05:08 CST 2019
     */
    public String getCreateDepartId() {
        return createDepartId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INVENTORY_INOUT.CREATE_DEPART_ID
     *
     * @param createDepartId the value for INVENTORY_INOUT.CREATE_DEPART_ID
     *
     * @mbg.generated Mon Dec 02 16:05:08 CST 2019
     */
    public void setCreateDepartId(String createDepartId) {
        this.createDepartId = createDepartId == null ? null : createDepartId.trim();
    }
}