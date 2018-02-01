<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<body>
  <h2>Welcome!  Book A Cab Here</h2></br>
  From : <input type="text" name="start" />   To : <input type="text" name="destination" /></br>
  <a href="${pageContext.request.contextPath}/request-cab.htm" style="color: blue; font: 18px;">book</a>
</body>
</html>