package edu.lfsfxy.customer.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

//设置View->Controller自动装配日期格式：yyyy-MM-dd
public class StringToDateConverter implements Converter<String, Date> {

    @Override
    public Date convert(String source) {
        if(source==null){
            throw new RuntimeException("请输入数据");
        }
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        try {
            return df.parse(source);
        }catch (Exception e){
            throw  new RuntimeException("数据类型转换出错");
        }
    }
}
