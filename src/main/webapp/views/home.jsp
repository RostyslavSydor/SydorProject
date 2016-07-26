<%--
  Created by IntelliJ IDEA.
  User: Rostyslav
  Date: 26.07.2016
  Time: 21:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title></title>
</head>
<body>
<h1>Hello!</h1>
<a href="/allClients">All Clients</a>
<a href="/allProducs">All Products</a>

<sec:authorize access="isAnonymous()"><a href="/loginpage">Login!</a></sec:authorize>
<sec:authorize access="isAnonymous()"><a href="/registration">Registration!</a></sec:authorize>
<sec:authorize access="isAuthenticated()"><a href="/logout">Logout</a></sec:authorize>

</body>
</html>
