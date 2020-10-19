<%@page import="ru.appline.logic.Model" %>
<%--
  Created by IntelliJ IDEA.
  User: troa2
  Date: 17.10.2020
  Time: 14:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Title</title>
  </head>
  <body>
  <h1>Домашняя страница по работе с пользователями</h1>
  Введите ID пользователя (0 - для вывода всего списка пользователей)
  <br/>
  Доступно: <%
    Model model = Model.getInstance();
    out.print(model.getFromList().size());
  %>
  <form method="get" action="get">
    <label>ID:
      <input type="text" name="id"><br/>
    </label>
  </form>
  <a href="addUser.html">Создать нового пользователя</a><br/>
  <h1>Калькулятор</h1>
  <form method="post" action="calculate">
    <label>Первое число:
      <input type="text" name="a"><br/>
    </label>
    <label>Второе число:
      <input type="text" name="b"><br/>
    </label>
    <label>Операция:
      <input type="text" name="math"><br/>
    </label>
    <button type="submit">Посчитать</button>
  </form>
  </body>
</html>
