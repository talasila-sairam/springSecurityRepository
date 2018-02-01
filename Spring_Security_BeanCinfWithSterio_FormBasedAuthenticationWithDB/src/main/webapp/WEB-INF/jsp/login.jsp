<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
  <h2>Welcome to custom login page</h2></br>
   <%--  <c:if test="${param.error == 'failed'}">
       <p style="font: 18px; color: red">Please enter valid username and password</p>
    </c:if> --%>
  <form action="${pageContext.request.contextPath}/login-check.htm" method="post">
  Username : <input type="text" name="username">
  Password : <input type="password" name="password">
  <input type="submit" value="login">
  </form>
</body>
</html>