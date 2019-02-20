<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="dataInsert" method="post" modelAttribute="data">

		firstname:<form:input path="firstname"/>
		lastname:<form:input path="lastname"/>
		username:<form:input  path="username"/>
		password:<form:input   path="password"/>
		
<input type="submit" value="submit">

<a href="/search">Search</a>
<a href="/category">Category</a>

</form:form>
</body>
</html>