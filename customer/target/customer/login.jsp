
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>登录页面</title>
    <link href="/css/style.css"
          type=text/css rel=stylesheet>
    <link href="/css/boot-crm.css"
          type=text/css rel=stylesheet>
    <script
            src="/js/jquery-1.11.3.min.js"></script>
</head>
<body leftMargin=0 topMargin=0 marginwidth="0" marginheight="0"
      background="/images/rightbg.jpg">
<div ALIGN="center">
    <table border="0" width="1140px" cellspacing="0" cellpadding="0" id="table1">
        <tr>
            <td height="93"></td>
            <td></td>
        </tr>
        <tr>
            <td background="/images/rights1.jpg"
                width="740" height="412">
            </td>
            <td class="login_msg" width="400" align="center">
                <!-- margin:0px auto; 控制当前标签居中 -->
                <fieldset style="width: auto; margin: 0px auto;">
                    <legend>
                        <font style="font-size:15px" face="宋体">
                            欢迎使用BOOT客户管理系统
                        </font>
                    </legend>


                    <form action="/user/login" method="post">
                        <table style="line-height: 30px;">
                            <tr>
                                <td>账&nbsp;号：</td>
                                <td colspan="2"><input id="userCode" placeholder="请输入账号" type="text" name="userCode" value="${sysUser.userCode}"
                                                       required pattern="\w{4,16}" oninvalid="setCustomValidity('账号不能为空,且宽度为4-16位.')" oninput="setCustomValidity('')"/></td>

                            </tr>
                            <tr>
                                <td>密&nbsp;码：</td>
                                <td colspan="2"><input id="password" placeholder="请输入密码" type="password" name="userPassword"
                                                       required pattern="\w{3,16}" oninvalid="setCustomValidity('密码不能为空,且宽度为4-16位.')" oninput="setCustomValidity('')"/></td>
                            </tr>
                            <tr>
                                <td>验证码：</td>
                                <td><input name="checkCode" type="text" placeholder="请输入验证码" autocomplete="off"
                                           required pattern="\w{4}" oninvalid="setCustomValidity('验证码不能为空,且长度必须为四位')" oninput="setCustomValidity('')"></td>
                                <td><img src="/CheckCode" alt="" onclick="changeCheckCode(this)"></td>
                                <script type="text/javascript">
                                    //图片点击事件
                                    function changeCheckCode(img) {
                                        img.src = "/CheckCode?" + new Date().getTime();
                                    }
                                </script>
                            </tr>
                            <tr>
                                <td colspan="3"> <center><input type="submit" value="登录"/>
                                <span style="color:red;font-size: 15px;font-weight: bold">${err}</span>
                                </center></td>
                            </tr>
                        </table>

                    </form>
                </fieldset>
            </td>
        </tr>
    </table>
</div>
</body>
</html>

