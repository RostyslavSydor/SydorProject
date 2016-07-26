<%--
  Created by IntelliJ IDEA.
  User: Rostyslav
  Date: 26.07.2016
  Time: 21:23
  To change this template use File | Settings | File Templates.
--%><%@ page contentType="text/html;charset=UTF-8" language="java" %>
<form action="/loginprocessing" method="post">
    <h1>Увійти на сайт!</h1>
    <label for="user-login-name">Логін:</label>
    <input id="user-login-name" placeholder="Email або телефон" name="username" required>
    <label for="user-login-password">Пароль:</label>
    <input type="password" id="user-login-password" placeholder="Пароль" name="password" required>
    <button type="submit">Увійти!</button>
</form>
