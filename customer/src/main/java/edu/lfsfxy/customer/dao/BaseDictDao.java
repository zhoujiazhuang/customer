package edu.lfsfxy.customer.dao;

import edu.lfsfxy.customer.entity.BaseDict;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BaseDictDao {

    @ResultMap("baseDictResultMap")
    @Select("select * from base_dict where dict_type_code=#{typeCode}")
    List<BaseDict> findByType(@Param("typeCode")  String typeCode);
}
