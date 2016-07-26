<%--
  Created by IntelliJ IDEA.
  User: Rostyslav
  Date: 26.07.2016
  Time: 21:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>All Clients here!</h2>
<c:forEach items="${clients}" var="client">
    <a href="/client=${client.id}">
        <div style="width: 100px; height: 100px; float: left; background-color: orange; margin: 10px;">
            <p>${client.name}</p>
            <p>${client.country}</p>
        </div>
    </a>
</c:forEach>
<sec:authorize access="isAuthenticated()"><a href="clientNew">New Author</a></sec:authorize>
</body>
</html>
