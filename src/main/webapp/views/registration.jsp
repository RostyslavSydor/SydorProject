<%--
  Created by IntelliJ IDEA.
  User: Rostyslav
  Date: 26.07.2016
  Time: 21:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<form action="/registration" method="post">
    <h1>Sign up</h1>
    <label for="name">Ім'я:</label>
    <input id="name" type="text" name="name">
    <label for="secondname">Прізвище:</label>
    <input id="secondname" type="text" name="secondname">
    <label for="email">Email:</label>
    <input id="email" type="email" name="email">
    <label for="phone">Телефон:</label>
    <input id="phone" type="text" name="phone">
    <label for="password">Пароль:</label>
    <input id="password" type="password" name="password">
    <button type="submit">Sign up</button>
</form>