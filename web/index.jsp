<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: 25440
  Date: 2022/9/16
  Time: 9:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <meta charset="utf-8">
    <title>$Title$</title>
  </head>
  <body>
  <a href="${pageContext.request.contextPath}/index">index</a>
  <form method="post" action="${pageContext.request.contextPath}/success">
    username:<input name="username" type="text"/>
    <input type="submit" value="提交"/>
  </form>
  message:${message}
  </body>
</html>
