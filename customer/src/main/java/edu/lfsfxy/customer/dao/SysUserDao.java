package edu.lfsfxy.customer.dao;

import edu.lfsfxy.customer.entity.SysUser;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

public interface SysUserDao {

    @ResultMap("userResultMap")
    @Select("select * from sys_user where user_code=#{userCode} and user_password=#{pwd}")
    SysUser findUser(@Param("userCode") String userCode, @Param("pwd") String userPassword);
    //int findUser(@Param("userCode") String userCode,@Param("pwd") String userPassword);
}
