package com.ninyjun.erp.inventory.inventorysvc.repository;

import java.util.List;

import com.ninyjun.erp.inventory.inventorysdk.model.InventoryStorehouse;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface InventoryStorehouseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INVENTORY_STOREHOUSE
     *
     * @mbg.generated Mon Dec 02 16:05:57 CST 2019
     */
    @Delete({
        "delete from INVENTORY_STOREHOUSE",
        "where STOREHOUSE_CODE = #{storehouseCode,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer storehouseCode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INVENTORY_STOREHOUSE
     *
     * @mbg.generated Mon Dec 02 16:05:57 CST 2019
     */
    @Insert({
        "insert into INVENTORY_STOREHOUSE (STOREHOUSE_CODE, STOREHOUSE_NAME, ",
        "ADDRESS, TEL, LINKMAN, ",
        "UP_STOREHOUSE_CODE, LEVEL)",
        "values (#{storehouseCode,jdbcType=INTEGER}, #{storehouseName,jdbcType=VARCHAR}, ",
        "#{address,jdbcType=VARCHAR}, #{tel,jdbcType=VARCHAR}, #{linkman,jdbcType=VARCHAR}, ",
        "#{upStorehouseCode,jdbcType=INTEGER}, #{level,jdbcType=INTEGER})"
    })
    int insert(InventoryStorehouse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INVENTORY_STOREHOUSE
     *
     * @mbg.generated Mon Dec 02 16:05:57 CST 2019
     */
    @Select({
        "select",
        "STOREHOUSE_CODE, STOREHOUSE_NAME, ADDRESS, TEL, LINKMAN, UP_STOREHOUSE_CODE, ",
        "LEVEL",
        "from INVENTORY_STOREHOUSE",
        "where STOREHOUSE_CODE = #{storehouseCode,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="STOREHOUSE_CODE", property="storehouseCode", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="STOREHOUSE_NAME", property="storehouseName", jdbcType=JdbcType.VARCHAR),
        @Result(column="ADDRESS", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="TEL", property="tel", jdbcType=JdbcType.VARCHAR),
        @Result(column="LINKMAN", property="linkman", jdbcType=JdbcType.VARCHAR),
        @Result(column="UP_STOREHOUSE_CODE", property="upStorehouseCode", jdbcType=JdbcType.INTEGER),
        @Result(column="LEVEL", property="level", jdbcType=JdbcType.INTEGER)
    })
    InventoryStorehouse selectByPrimaryKey(Integer storehouseCode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INVENTORY_STOREHOUSE
     *
     * @mbg.generated Mon Dec 02 16:05:57 CST 2019
     */
    @Select({
        "select",
        "STOREHOUSE_CODE, STOREHOUSE_NAME, ADDRESS, TEL, LINKMAN, UP_STOREHOUSE_CODE, ",
        "LEVEL",
        "from INVENTORY_STOREHOUSE"
    })
    @Results({
        @Result(column="STOREHOUSE_CODE", property="storehouseCode", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="STOREHOUSE_NAME", property="storehouseName", jdbcType=JdbcType.VARCHAR),
        @Result(column="ADDRESS", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="TEL", property="tel", jdbcType=JdbcType.VARCHAR),
        @Result(column="LINKMAN", property="linkman", jdbcType=JdbcType.VARCHAR),
        @Result(column="UP_STOREHOUSE_CODE", property="upStorehouseCode", jdbcType=JdbcType.INTEGER),
        @Result(column="LEVEL", property="level", jdbcType=JdbcType.INTEGER)
    })
    List<InventoryStorehouse> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INVENTORY_STOREHOUSE
     *
     * @mbg.generated Mon Dec 02 16:05:57 CST 2019
     */
    @Update({
        "update INVENTORY_STOREHOUSE",
        "set STOREHOUSE_NAME = #{storehouseName,jdbcType=VARCHAR},",
          "ADDRESS = #{address,jdbcType=VARCHAR},",
          "TEL = #{tel,jdbcType=VARCHAR},",
          "LINKMAN = #{linkman,jdbcType=VARCHAR},",
          "UP_STOREHOUSE_CODE = #{upStorehouseCode,jdbcType=INTEGER},",
          "LEVEL = #{level,jdbcType=INTEGER}",
        "where STOREHOUSE_CODE = #{storehouseCode,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(InventoryStorehouse record);
}