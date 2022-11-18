package edu.lfsfxy.customer.controller;

import edu.lfsfxy.customer.dao.SysUserDao;
import edu.lfsfxy.customer.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;


@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    SysUserDao sysUserDao;


    @RequestMapping("/login")
    public String login(Model model,SysUser sysUser, HttpServletRequest request, String checkCode) {

        try {
            //获取验证码
            String code = (String) request.getSession().getAttribute("CHECKCODE_SERVER");

            String userCode = sysUser.getUserCode();
            String userPassword = sysUser.getUserPassword();

            //验证验证码
            if (code.equalsIgnoreCase(checkCode)){
                //一致
            }else{
                model.addAttribute("err","验证码错误");
                //return "../login";  ///forword:不加前后缀
                return "forward:/login.jsp";
            }

            SysUser user = sysUserDao.findUser(userCode, userPassword);
            int userState=-1;
            if(user!=null){
                userState = user.getUserState();
            }

            if(user!=null&&userState==1){
                return "redirect:/customer/find?pageNum=1";  // redirect：重定向，不传递requsst对象
            }else{
                model.addAttribute("err","用户名或密码不正确.");
                return "../login";
            }
        } catch (Exception e) {
            model.addAttribute("err",e.getMessage());
            return "forward:/login.jsp";  //forward转发，含有request对象
        }

    }





}
