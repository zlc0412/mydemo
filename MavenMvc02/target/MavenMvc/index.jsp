<%--
  Created by IntelliJ IDEA.
  User: zlc
  Date: 2019-05-22
  Time: 16:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>入门程序</h3>
    <%--<a href="hello">入门程序</a>--%>
    <a href="/user/testRequestMapping">测试RequestMapping</a><br/>
    <%--<a href="param/testParam?username=zlc&password=123">测试参数绑定</a>--%>
    <form action="/param/saveAccount" method="post">
        姓名：<input type="text" name="username"><br/>
        密码：<input type="text" name="password"><br/>
        金额：<input type="text" name="money"><br/>
        <input type="submit" value="提交"><br/>
    </form>

</body>
</html>
