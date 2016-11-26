<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="findProductByIDServlet" method="post">
	Id Product<br/> <input type="text" name="id" ></br>
	<br/><input type="submit" value="Search"/>
	
	<% if (request.getAttribute("product") == null) {
		
	
} %>

		<br />
		<c:out value="${product.id}" />
		<c:out value="${product.productName}" />
		<br />
		<c:out value="${product.description}" />
		</br>


</body>
</html>