<%--
  Created by IntelliJ IDEA.
  User: Rostyslav
  Date: 26.07.2016
  Time: 21:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:forEach items="${products}" var="p">
    <div>
        <p>id: ${p.id}</p>
        <p>name :${p.name}</p>
        <p>price: ${p.price}</p>
        <p>client: ${p.client}</p>
    </div>
</c:forEach>