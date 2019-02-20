<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>


<table border = "1px">
	<tr>
		<th>Firstname</th>
		<th>Lastname</th>
		<th>Username</th>
		<th>Delete</th>
		<th>EDit</th>
	</tr>
	
<c:forEach items="${showrecord}" var="i">

	<tr>
		<td>${i.firstname}</td>
		<td>${i.lastname}</td>
		<td>${i.username}</td>
		
		<td><a href = "delete?insertId=${i.id}">Delete</a></td>
		
		<td><a href="edit?id=${i.id}">Edit</a></td>
	</tr>
</c:forEach>

</table>

</body>
</html>