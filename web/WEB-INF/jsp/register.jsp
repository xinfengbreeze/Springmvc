<%--
  Created by IntelliJ IDEA.
  User: langchou
  Date: 2/22/17
  Time: 6:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>user register</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/account/register.form"  method="post">
    姓名<input type="text" name="name"/><br/>
    密码<input type="text" name="password"/><br/>
    年龄<input type="text" name="age"/><br/>
    工作<input type="text" name="job"/><br/>
    <input type="submit" name="OK">
</form>
</body>
</html>
