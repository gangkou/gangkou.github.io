<%--
  Created by IntelliJ IDEA.
  User: 小米饭
  Date: 2020/6/8
  Time: 9:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加用户</title>
</head>
<body>
<form action="/user/addUser" method="post" accept-charset="UTF-8">
    姓名:<input type="text" name="username"/><br>
    编号:<input type="text" name="userid"/><br>
    余额:<input type="text" name="money"/> <br>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
