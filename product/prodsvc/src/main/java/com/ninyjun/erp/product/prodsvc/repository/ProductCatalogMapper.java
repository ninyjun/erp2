package com.ninyjun.erp.product.prodsvc.repository;

import com.ninyjun.erp.product.prodsvc.model.ProductCatalog;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface ProductCatalogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRODUCT_CATALOG
     *
     * @mbg.generated Fri Nov 29 10:54:26 CST 2019
     */
    @Delete({
        "delete from PRODUCT_CATALOG",
        "where PROD_CATALOG_CODE = #{prodCatalogCode,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer prodCatalogCode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRODUCT_CATALOG
     *
     * @mbg.generated Fri Nov 29 10:54:26 CST 2019
     */
    @Insert({
        "insert into PRODUCT_CATALOG (PROD_CATALOG_CODE, PROD_CATALOG_NAME, ",
        "PROD_CATALOG_DESCRIBE, PROD_CATALOG_UP, ",
        "PROD_LEVEL, CREATE_TIME, ",
        "CREATE_EMP_ID, CREATE_DEPART_ID)",
        "values (#{prodCatalogCode,jdbcType=INTEGER}, #{prodCatalogName,jdbcType=VARCHAR}, ",
        "#{prodCatalogDescribe,jdbcType=VARCHAR}, #{prodCatalogUp,jdbcType=INTEGER}, ",
        "#{prodLevel,jdbcType=INTEGER}, #{createTime,jdbcType=DATE}, ",
        "#{createEmpId,jdbcType=VARCHAR}, #{createDepartId,jdbcType=VARCHAR})"
    })
    int insert(ProductCatalog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRODUCT_CATALOG
     *
     * @mbg.generated Fri Nov 29 10:54:26 CST 2019
     */
    @Select({
        "select",
        "PROD_CATALOG_CODE, PROD_CATALOG_NAME, PROD_CATALOG_DESCRIBE, PROD_CATALOG_UP, ",
        "PROD_LEVEL, CREATE_TIME, CREATE_EMP_ID, CREATE_DEPART_ID",
        "from PRODUCT_CATALOG",
        "where PROD_CATALOG_CODE = #{prodCatalogCode,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="PROD_CATALOG_CODE", property="prodCatalogCode", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="PROD_CATALOG_NAME", property="prodCatalogName", jdbcType=JdbcType.VARCHAR),
        @Result(column="PROD_CATALOG_DESCRIBE", property="prodCatalogDescribe", jdbcType=JdbcType.VARCHAR),
        @Result(column="PROD_CATALOG_UP", property="prodCatalogUp", jdbcType=JdbcType.INTEGER),
        @Result(column="PROD_LEVEL", property="prodLevel", jdbcType=JdbcType.INTEGER),
        @Result(column="CREATE_TIME", property="createTime", jdbcType=JdbcType.DATE),
        @Result(column="CREATE_EMP_ID", property="createEmpId", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATE_DEPART_ID", property="createDepartId", jdbcType=JdbcType.VARCHAR)
    })
    ProductCatalog selectByPrimaryKey(Integer prodCatalogCode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRODUCT_CATALOG
     *
     * @mbg.generated Fri Nov 29 10:54:26 CST 2019
     */
    @Select({
        "select",
        "PROD_CATALOG_CODE, PROD_CATALOG_NAME, PROD_CATALOG_DESCRIBE, PROD_CATALOG_UP, ",
        "PROD_LEVEL, CREATE_TIME, CREATE_EMP_ID, CREATE_DEPART_ID",
        "from PRODUCT_CATALOG"
    })
    @Results({
        @Result(column="PROD_CATALOG_CODE", property="prodCatalogCode", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="PROD_CATALOG_NAME", property="prodCatalogName", jdbcType=JdbcType.VARCHAR),
        @Result(column="PROD_CATALOG_DESCRIBE", property="prodCatalogDescribe", jdbcType=JdbcType.VARCHAR),
        @Result(column="PROD_CATALOG_UP", property="prodCatalogUp", jdbcType=JdbcType.INTEGER),
        @Result(column="PROD_LEVEL", property="prodLevel", jdbcType=JdbcType.INTEGER),
        @Result(column="CREATE_TIME", property="createTime", jdbcType=JdbcType.DATE),
        @Result(column="CREATE_EMP_ID", property="createEmpId", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATE_DEPART_ID", property="createDepartId", jdbcType=JdbcType.VARCHAR)
    })
    List<ProductCatalog> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRODUCT_CATALOG
     *
     * @mbg.generated Fri Nov 29 10:54:26 CST 2019
     */
    @Update({
        "update PRODUCT_CATALOG",
        "set PROD_CATALOG_NAME = #{prodCatalogName,jdbcType=VARCHAR},",
          "PROD_CATALOG_DESCRIBE = #{prodCatalogDescribe,jdbcType=VARCHAR},",
          "PROD_CATALOG_UP = #{prodCatalogUp,jdbcType=INTEGER},",
          "PROD_LEVEL = #{prodLevel,jdbcType=INTEGER},",
          "CREATE_TIME = #{createTime,jdbcType=DATE},",
          "CREATE_EMP_ID = #{createEmpId,jdbcType=VARCHAR},",
          "CREATE_DEPART_ID = #{createDepartId,jdbcType=VARCHAR}",
        "where PROD_CATALOG_CODE = #{prodCatalogCode,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ProductCatalog record);
}