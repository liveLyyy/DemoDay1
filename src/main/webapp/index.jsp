<html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<body>
  <table border="1">
      <tr>
          <th>花卉编号</th>
          <th>花卉名称</th>
          <th>花卉价格</th>
          <th>花卉出产地</th>
      </tr>
      <c:forEach var="l" items="${list}">
          <tr>
              <td>${l.id}</td>
              <td>${l.name}</td>
              <td>${l.price}</td>
              <td>${l.priduction}</td>
          </tr>
      </c:forEach>
  </table>
</body>
</html>
