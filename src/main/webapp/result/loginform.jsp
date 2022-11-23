<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri = "http://www.springframework.org/tags/form" 
    prefix = "tags"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<tags:form action="/check" modelAttribute="loginobj">
<table>

<tr>
	<td>User Name</td>
	<td><tags:input path="username"/></td>
</tr>
<tr>
	<td>Password</td>
	<td><tags:input path="password"/></td>
</tr>
<tr>
	<td></td>
	<td><input type="submit" value="Registration"/>
</table>
</tags:form>

</body>
</html>