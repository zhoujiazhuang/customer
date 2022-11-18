package edu.lfsfxy.customer.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sun.xml.internal.rngom.parse.host.Base;
//import edu.lfsfxy.customer.dao.BaseDictDao;
import edu.lfsfxy.customer.dao.BaseDictDao;
import edu.lfsfxy.customer.dao.CustomerDao;
import edu.lfsfxy.customer.entity.BaseDict;
import edu.lfsfxy.customer.entity.Customer;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    CustomerDao customerDao;
    @Autowired
    BaseDictDao baseDictDao;

    @RequestMapping("/find")
    public String find(@RequestParam(value="pageNum", defaultValue="1") int pageNum, Model model,
                       @RequestParam(defaultValue="") String custName,
                       @RequestParam(defaultValue="0") String custSource,
                       @RequestParam(defaultValue="0") String custIndustry,
                       @RequestParam(defaultValue="0") String custLevel){


        //要求：1.在查询上方且紧挨着查询语句 2.pageNum 页码，pageSize 页面大小
        PageHelper.startPage(pageNum,10);
        List<Customer> list = customerDao.find(custName,custSource,custIndustry,custLevel);

        //pageInfo 包含分页所需全部数据，不用单独计算
        PageInfo<Customer> pageInfo=new PageInfo<>(list);
        model.addAttribute("pageInfo",pageInfo);

        List<BaseDict> custSource2=baseDictDao.findByType("002");
        model.addAttribute("source",custSource2);
        List<BaseDict> custIndustry2=baseDictDao.findByType("001");
        model.addAttribute("industry",custIndustry2);
        List<BaseDict> custLevel2=baseDictDao.findByType("006");
        model.addAttribute("level",custLevel2);


        return "customer";   ///jsp/customer.jsp
    }

}

