<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Form Login Page</title>
</head>
<body>
  <table>
  <tr><th>Movies</th></tr>
     <c:forEach items="${movies}" var="movie">
        <tr><td>${movie}</td></tr>
      </c:forEach>
  </table>
  
  	    <p style="color: red;">
			<c:if test="${not empty error}">
				Username or password is not valid
			</c:if>
		</p>
		<form action="${pageContext.request.contextPath}/login-check.htm" method="post">
			Email Address : <input type="text" name="j_username"/><br/>
			Password : <input type="text" name="j_password"/><br/>
			<input type="submit" value="login"/>		
		</form>
</body>
</html>