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
<tags:form action="/saveUser" modelAttribute="logobj">
<table>
<tr>
	<td>First name</td>
	<td><tags:input path="firstname"/></td>
</tr>
<tr>
	<td>last name</td>
	<td><tags:input path="lastname"/></td>
</tr>
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