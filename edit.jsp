<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<body>
<form:form action="update" method="post" modelAttribute="data">
<p><form:input type="hidden" path="id"/></p>
<p>Enter First Name:<form:input path="firstname"/></p>
<p>Enter Last name:<form:input path="lastname"/></p>
<p>Enter Username:<form:input path="username"/></p>
<p>Enter Password:<form:input type="password" path="password"/></p>
<p><input type="submit" value="Submit"/></p>
</form:form>
</body>
</html>