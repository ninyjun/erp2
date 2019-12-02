package com.ninyjun.erp.account.acctbalancesvc.repository;

import java.util.List;

import com.ninyjun.erp.account.acctsdk.model.AccountBalance;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface AccountBalanceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ACCOUNT_BALANCE
     *
     * @mbg.generated Fri Nov 29 17:37:57 CST 2019
     */
    @Delete({
        "delete from ACCOUNT_BALANCE",
        "where ACCT_BALANCE_ID = #{acctBalanceId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long acctBalanceId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ACCOUNT_BALANCE
     *
     * @mbg.generated Fri Nov 29 17:37:57 CST 2019
     */
    @Insert({
        "insert into ACCOUNT_BALANCE (ACCT_BALANCE_ID, ACCT_ID, ",
        "ACCT_BALANCE_TYPE_CODE, ACCT_BALANCE, ",
        "ACCT_BALANCE_INIT, VERSION_NO, ",
        "CREATE_TIME, CREATE_EMP_ID, ",
        "CREATE_DEPART_ID)",
        "values (#{acctBalanceId,jdbcType=BIGINT}, #{acctId,jdbcType=BIGINT}, ",
        "#{acctBalanceTypeCode,jdbcType=INTEGER}, #{acctBalance,jdbcType=BIGINT}, ",
        "#{acctBalanceInit,jdbcType=BIGINT}, #{versionNo,jdbcType=BIGINT}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{createEmpId,jdbcType=VARCHAR}, ",
        "#{createDepartId,jdbcType=VARCHAR})"
    })
    int insert(AccountBalance record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ACCOUNT_BALANCE
     *
     * @mbg.generated Fri Nov 29 17:37:57 CST 2019
     */
    @Select({
        "select",
        "ACCT_BALANCE_ID, ACCT_ID, ACCT_BALANCE_TYPE_CODE, ACCT_BALANCE, ACCT_BALANCE_INIT, ",
        "VERSION_NO, CREATE_TIME, CREATE_EMP_ID, CREATE_DEPART_ID",
        "from ACCOUNT_BALANCE",
        "where ACCT_BALANCE_ID = #{acctBalanceId,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="ACCT_BALANCE_ID", property="acctBalanceId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="ACCT_ID", property="acctId", jdbcType=JdbcType.BIGINT),
        @Result(column="ACCT_BALANCE_TYPE_CODE", property="acctBalanceTypeCode", jdbcType=JdbcType.INTEGER),
        @Result(column="ACCT_BALANCE", property="acctBalance", jdbcType=JdbcType.BIGINT),
        @Result(column="ACCT_BALANCE_INIT", property="acctBalanceInit", jdbcType=JdbcType.BIGINT),
        @Result(column="VERSION_NO", property="versionNo", jdbcType=JdbcType.BIGINT),
        @Result(column="CREATE_TIME", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CREATE_EMP_ID", property="createEmpId", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATE_DEPART_ID", property="createDepartId", jdbcType=JdbcType.VARCHAR)
    })
    AccountBalance selectByPrimaryKey(Long acctBalanceId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ACCOUNT_BALANCE
     *
     * @mbg.generated Fri Nov 29 17:37:57 CST 2019
     */
    @Select({
        "select",
        "ACCT_BALANCE_ID, ACCT_ID, ACCT_BALANCE_TYPE_CODE, ACCT_BALANCE, ACCT_BALANCE_INIT, ",
        "VERSION_NO, CREATE_TIME, CREATE_EMP_ID, CREATE_DEPART_ID",
        "from ACCOUNT_BALANCE"
    })
    @Results({
        @Result(column="ACCT_BALANCE_ID", property="acctBalanceId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="ACCT_ID", property="acctId", jdbcType=JdbcType.BIGINT),
        @Result(column="ACCT_BALANCE_TYPE_CODE", property="acctBalanceTypeCode", jdbcType=JdbcType.INTEGER),
        @Result(column="ACCT_BALANCE", property="acctBalance", jdbcType=JdbcType.BIGINT),
        @Result(column="ACCT_BALANCE_INIT", property="acctBalanceInit", jdbcType=JdbcType.BIGINT),
        @Result(column="VERSION_NO", property="versionNo", jdbcType=JdbcType.BIGINT),
        @Result(column="CREATE_TIME", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CREATE_EMP_ID", property="createEmpId", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATE_DEPART_ID", property="createDepartId", jdbcType=JdbcType.VARCHAR)
    })
    List<AccountBalance> selectAll();

    @Select({
            "select",
            "ACCT_BALANCE_ID, ACCT_ID, ACCT_BALANCE_TYPE_CODE, ACCT_BALANCE, ACCT_BALANCE_INIT, ",
            "VERSION_NO, CREATE_TIME, CREATE_EMP_ID, CREATE_DEPART_ID",
            "from ACCOUNT_BALANCE",
            " where ACCT_ID = #{acctId,jdbcType=BIGINT}"
    })
    @Results({
            @Result(column="ACCT_BALANCE_ID", property="acctBalanceId", jdbcType=JdbcType.BIGINT, id=true),
            @Result(column="ACCT_ID", property="acctId", jdbcType=JdbcType.BIGINT),
            @Result(column="ACCT_BALANCE_TYPE_CODE", property="acctBalanceTypeCode", jdbcType=JdbcType.INTEGER),
            @Result(column="ACCT_BALANCE", property="acctBalance", jdbcType=JdbcType.BIGINT),
            @Result(column="ACCT_BALANCE_INIT", property="acctBalanceInit", jdbcType=JdbcType.BIGINT),
            @Result(column="VERSION_NO", property="versionNo", jdbcType=JdbcType.BIGINT),
            @Result(column="CREATE_TIME", property="createTime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="CREATE_EMP_ID", property="createEmpId", jdbcType=JdbcType.VARCHAR),
            @Result(column="CREATE_DEPART_ID", property="createDepartId", jdbcType=JdbcType.VARCHAR)
    })
    List<AccountBalance> selectByAcctId(Long acctId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ACCOUNT_BALANCE
     *
     * @mbg.generated Fri Nov 29 17:37:57 CST 2019
     */
    @Update({
        "update ACCOUNT_BALANCE",
        "set ACCT_ID = #{acctId,jdbcType=BIGINT},",
          "ACCT_BALANCE_TYPE_CODE = #{acctBalanceTypeCode,jdbcType=INTEGER},",
          "ACCT_BALANCE = #{acctBalance,jdbcType=BIGINT},",
          "ACCT_BALANCE_INIT = #{acctBalanceInit,jdbcType=BIGINT},",
          "VERSION_NO = #{versionNo,jdbcType=BIGINT},",
          "CREATE_TIME = #{createTime,jdbcType=TIMESTAMP},",
          "CREATE_EMP_ID = #{createEmpId,jdbcType=VARCHAR},",
          "CREATE_DEPART_ID = #{createDepartId,jdbcType=VARCHAR}",
        "where ACCT_BALANCE_ID = #{acctBalanceId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(AccountBalance record);
}