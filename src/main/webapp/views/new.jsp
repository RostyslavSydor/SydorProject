<%--
  Created by IntelliJ IDEA.
  User: Rostyslav
  Date: 26.07.2016
  Time: 21:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form method="post" action="/createClient">
        <input type="text" name="name">
        <input type="text" name="country">
        <button value="post">Send!</button>
    </form>
</body>
</html>
