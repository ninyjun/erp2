package com.ninyjun.erp.order.salesvc.repository;

import java.util.List;

import com.ninyjun.erp.order.ordersdk.model.SalePayVoucher;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface SalePayVoucherMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SALE_PAY_VOUCHER
     *
     * @mbg.generated Thu Nov 28 20:54:51 CST 2019
     */
    @Delete({
        "delete from SALE_PAY_VOUCHER",
        "where SALE_PAY_VOUCHER_ID = #{salePayVoucherId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long salePayVoucherId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SALE_PAY_VOUCHER
     *
     * @mbg.generated Thu Nov 28 20:54:51 CST 2019
     */
    @Insert({
        "insert into SALE_PAY_VOUCHER (SALE_PAY_VOUCHER_ID, SALE_ID, ",
        "PAY_MODE, PAY_VOUCHER_NO, ",
        "PAY_FEE, FINANCIAL_CODE, ",
        "FINANCIAL_NAME, CARD_NO, ",
        "INVALID_DATE)",
        "values (#{salePayVoucherId,jdbcType=BIGINT}, #{saleId,jdbcType=BIGINT}, ",
        "#{payMode,jdbcType=INTEGER}, #{payVoucherNo,jdbcType=VARCHAR}, ",
        "#{payFee,jdbcType=BIGINT}, #{financialCode,jdbcType=VARCHAR}, ",
        "#{financialName,jdbcType=VARCHAR}, #{cardNo,jdbcType=VARCHAR}, ",
        "#{invalidDate,jdbcType=DATE})"
    })
    int insert(SalePayVoucher record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SALE_PAY_VOUCHER
     *
     * @mbg.generated Thu Nov 28 20:54:51 CST 2019
     */
    @Select({
        "select",
        "SALE_PAY_VOUCHER_ID, SALE_ID, PAY_MODE, PAY_VOUCHER_NO, PAY_FEE, FINANCIAL_CODE, ",
        "FINANCIAL_NAME, CARD_NO, INVALID_DATE",
        "from SALE_PAY_VOUCHER",
        "where SALE_PAY_VOUCHER_ID = #{salePayVoucherId,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="SALE_PAY_VOUCHER_ID", property="salePayVoucherId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="SALE_ID", property="saleId", jdbcType=JdbcType.BIGINT),
        @Result(column="PAY_MODE", property="payMode", jdbcType=JdbcType.INTEGER),
        @Result(column="PAY_VOUCHER_NO", property="payVoucherNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="PAY_FEE", property="payFee", jdbcType=JdbcType.BIGINT),
        @Result(column="FINANCIAL_CODE", property="financialCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="FINANCIAL_NAME", property="financialName", jdbcType=JdbcType.VARCHAR),
        @Result(column="CARD_NO", property="cardNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="INVALID_DATE", property="invalidDate", jdbcType=JdbcType.DATE)
    })
    SalePayVoucher selectByPrimaryKey(Long salePayVoucherId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SALE_PAY_VOUCHER
     *
     * @mbg.generated Thu Nov 28 20:54:51 CST 2019
     */
    @Select({
        "select",
        "SALE_PAY_VOUCHER_ID, SALE_ID, PAY_MODE, PAY_VOUCHER_NO, PAY_FEE, FINANCIAL_CODE, ",
        "FINANCIAL_NAME, CARD_NO, INVALID_DATE",
        "from SALE_PAY_VOUCHER"
    })
    @Results({
        @Result(column="SALE_PAY_VOUCHER_ID", property="salePayVoucherId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="SALE_ID", property="saleId", jdbcType=JdbcType.BIGINT),
        @Result(column="PAY_MODE", property="payMode", jdbcType=JdbcType.INTEGER),
        @Result(column="PAY_VOUCHER_NO", property="payVoucherNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="PAY_FEE", property="payFee", jdbcType=JdbcType.BIGINT),
        @Result(column="FINANCIAL_CODE", property="financialCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="FINANCIAL_NAME", property="financialName", jdbcType=JdbcType.VARCHAR),
        @Result(column="CARD_NO", property="cardNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="INVALID_DATE", property="invalidDate", jdbcType=JdbcType.DATE)
    })
    List<SalePayVoucher> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SALE_PAY_VOUCHER
     *
     * @mbg.generated Thu Nov 28 20:54:51 CST 2019
     */
    @Update({
        "update SALE_PAY_VOUCHER",
        "set SALE_ID = #{saleId,jdbcType=BIGINT},",
          "PAY_MODE = #{payMode,jdbcType=INTEGER},",
          "PAY_VOUCHER_NO = #{payVoucherNo,jdbcType=VARCHAR},",
          "PAY_FEE = #{payFee,jdbcType=BIGINT},",
          "FINANCIAL_CODE = #{financialCode,jdbcType=VARCHAR},",
          "FINANCIAL_NAME = #{financialName,jdbcType=VARCHAR},",
          "CARD_NO = #{cardNo,jdbcType=VARCHAR},",
          "INVALID_DATE = #{invalidDate,jdbcType=DATE}",
        "where SALE_PAY_VOUCHER_ID = #{salePayVoucherId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(SalePayVoucher record);
}