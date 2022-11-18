package edu.lfsfxy.customer.dao;

import edu.lfsfxy.customer.entity.Customer;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CustomerDao {

    @ResultMap("customerResultMap")
    @Select("<script>SELECT cust_id, cust_name, cust_user_id,cust_create_id,\n" +
            "(SELECT dict_item_name FROM base_dict WHERE base_dict.dict_id=cust_source)AS cust_source,\n" +
            "(SELEcT dict_item_name FROM base_dict WHERE base_dict.dict_id=cust_industry)As cust_industry,\n" +
            "(SELECT dict_item_name FROM base_dict WHERE base_dict.dict_id=cust_level) As cust_level," +
            "cust_linkman,cust_phone,cust_mobile,cust_zipcode,cust_address,cust_createtime \n" +
            "FROM boot_crm.customer" +
            "<where>" +
            "   <if test='custName!=\"\"'> and cust_name like '%${custName}%'</if>" +
            "   <if test='custSource!=0'> and cust_source = #{custSource}</if>" +
            "   <if test='custIndustry!=0'> and cust_industry =#{custIndustry}</if>" +
            "   <if test='custLevel!=0'> and cust_level = #{custLevel}</if>" +
            "</where></script>")
    List<Customer> find(@Param("custName") String custName,
                        @Param("custSource")  String custSource,
                        @Param("custIndustry")  String custIndustry,
                        @Param("custLevel")  String custLevel);
}
