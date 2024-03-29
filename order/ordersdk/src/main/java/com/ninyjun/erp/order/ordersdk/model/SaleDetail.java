package com.ninyjun.erp.order.ordersdk.model;

public class SaleDetail {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALE_DETAIL.SALE_DETAIL_ID
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    private Long saleDetailId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALE_DETAIL.SALE_ID
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    private Long saleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALE_DETAIL.INVENTORY_ID
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    private Long inventoryId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALE_DETAIL.PRODUCT_CODE
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    private Integer productCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALE_DETAIL.BATCH_NO
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    private String batchNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALE_DETAIL.PRICE
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    private Integer price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALE_DETAIL.QUANTITY
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    private Integer quantity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALE_DETAIL.DISCOUNT
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    private Integer discount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALE_DETAIL.INVENTORY_OUTIN_ID
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    private Long inventoryOutinId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALE_DETAIL.SALE_DETAIL_ID
     *
     * @return the value of SALE_DETAIL.SALE_DETAIL_ID
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    public Long getSaleDetailId() {
        return saleDetailId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALE_DETAIL.SALE_DETAIL_ID
     *
     * @param saleDetailId the value for SALE_DETAIL.SALE_DETAIL_ID
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    public void setSaleDetailId(Long saleDetailId) {
        this.saleDetailId = saleDetailId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALE_DETAIL.SALE_ID
     *
     * @return the value of SALE_DETAIL.SALE_ID
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    public Long getSaleId() {
        return saleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALE_DETAIL.SALE_ID
     *
     * @param saleId the value for SALE_DETAIL.SALE_ID
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    public void setSaleId(Long saleId) {
        this.saleId = saleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALE_DETAIL.INVENTORY_ID
     *
     * @return the value of SALE_DETAIL.INVENTORY_ID
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    public Long getInventoryId() {
        return inventoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALE_DETAIL.INVENTORY_ID
     *
     * @param inventoryId the value for SALE_DETAIL.INVENTORY_ID
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    public void setInventoryId(Long inventoryId) {
        this.inventoryId = inventoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALE_DETAIL.PRODUCT_CODE
     *
     * @return the value of SALE_DETAIL.PRODUCT_CODE
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    public Integer getProductCode() {
        return productCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALE_DETAIL.PRODUCT_CODE
     *
     * @param productCode the value for SALE_DETAIL.PRODUCT_CODE
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    public void setProductCode(Integer productCode) {
        this.productCode = productCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALE_DETAIL.BATCH_NO
     *
     * @return the value of SALE_DETAIL.BATCH_NO
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    public String getBatchNo() {
        return batchNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALE_DETAIL.BATCH_NO
     *
     * @param batchNo the value for SALE_DETAIL.BATCH_NO
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo == null ? null : batchNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALE_DETAIL.PRICE
     *
     * @return the value of SALE_DETAIL.PRICE
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALE_DETAIL.PRICE
     *
     * @param price the value for SALE_DETAIL.PRICE
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALE_DETAIL.QUANTITY
     *
     * @return the value of SALE_DETAIL.QUANTITY
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALE_DETAIL.QUANTITY
     *
     * @param quantity the value for SALE_DETAIL.QUANTITY
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALE_DETAIL.DISCOUNT
     *
     * @return the value of SALE_DETAIL.DISCOUNT
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    public Integer getDiscount() {
        return discount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALE_DETAIL.DISCOUNT
     *
     * @param discount the value for SALE_DETAIL.DISCOUNT
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALE_DETAIL.INVENTORY_OUTIN_ID
     *
     * @return the value of SALE_DETAIL.INVENTORY_OUTIN_ID
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    public Long getInventoryOutinId() {
        return inventoryOutinId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALE_DETAIL.INVENTORY_OUTIN_ID
     *
     * @param inventoryOutinId the value for SALE_DETAIL.INVENTORY_OUTIN_ID
     *
     * @mbg.generated Sun Dec 01 11:13:29 CST 2019
     */
    public void setInventoryOutinId(Long inventoryOutinId) {
        this.inventoryOutinId = inventoryOutinId;
    }
}