package com.ninyjun.erp.order.salesvc.repository;

import java.util.List;

import com.ninyjun.erp.order.ordersdk.model.SaleExtra;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface SaleExtraMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SALE_EXTRA
     *
     * @mbg.generated Thu Nov 28 20:54:51 CST 2019
     */
    @Delete({
        "delete from SALE_EXTRA",
        "where SALE_ID = #{saleId,jdbcType=BIGINT}",
          "and PROPERTY_CODE = #{propertyCode,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(@Param("saleId") Long saleId, @Param("propertyCode") String propertyCode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SALE_EXTRA
     *
     * @mbg.generated Thu Nov 28 20:54:51 CST 2019
     */
    @Insert({
        "insert into SALE_EXTRA (SALE_ID, PROPERTY_CODE, ",
        "PROPERTY_VALUE)",
        "values (#{saleId,jdbcType=BIGINT}, #{propertyCode,jdbcType=VARCHAR}, ",
        "#{propertyValue,jdbcType=VARCHAR})"
    })
    int insert(SaleExtra record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SALE_EXTRA
     *
     * @mbg.generated Thu Nov 28 20:54:51 CST 2019
     */
    @Select({
        "select",
        "SALE_ID, PROPERTY_CODE, PROPERTY_VALUE",
        "from SALE_EXTRA",
        "where SALE_ID = #{saleId,jdbcType=BIGINT}",
          "and PROPERTY_CODE = #{propertyCode,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="SALE_ID", property="saleId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="PROPERTY_CODE", property="propertyCode", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="PROPERTY_VALUE", property="propertyValue", jdbcType=JdbcType.VARCHAR)
    })
    SaleExtra selectByPrimaryKey(@Param("saleId") Long saleId, @Param("propertyCode") String propertyCode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SALE_EXTRA
     *
     * @mbg.generated Thu Nov 28 20:54:51 CST 2019
     */
    @Select({
        "select",
        "SALE_ID, PROPERTY_CODE, PROPERTY_VALUE",
        "from SALE_EXTRA"
    })
    @Results({
        @Result(column="SALE_ID", property="saleId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="PROPERTY_CODE", property="propertyCode", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="PROPERTY_VALUE", property="propertyValue", jdbcType=JdbcType.VARCHAR)
    })
    List<SaleExtra> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SALE_EXTRA
     *
     * @mbg.generated Thu Nov 28 20:54:51 CST 2019
     */
    @Update({
        "update SALE_EXTRA",
        "set PROPERTY_VALUE = #{propertyValue,jdbcType=VARCHAR}",
        "where SALE_ID = #{saleId,jdbcType=BIGINT}",
          "and PROPERTY_CODE = #{propertyCode,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(SaleExtra record);
}