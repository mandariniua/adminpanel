<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="main-style.css"/>
<title>Page</title>
</head>
<body>
<h2>Hello Admin!</h2>

<a href="add.jsp"><img src ="http://i.piccy.info/i9/a03fbaa717a3e371465ffb6499357132/1479742675/10209/1092023/add_button.png" width="70"/></a>
<a href="delete.jsp"><img src= "http://i.piccy.info/i9/137bf998f735ca4ff7647962f322341f/1479742777/7758/1092023/delete.png" width="30"/></a>
<a href="findProductId.jsp"><img src= "http://i.piccy.info/i9/62468f75299538072475ca2923501031/1479742799/2252/1092023/search_magnifier_interface_symbol.png" width="30"/></a>

<% if (request.getAttribute("productList") == null) {
	response.sendRedirect("AllProductServlet");
	
}%>

<h2>List of all products</h2>
<table>
<tr>
<th>id</th>
<th>Name product</th>
<th>Description</th>
<th></th>
</tr>


<c:forEach var="product" items="${productList}">
		<tr><td><c:out value="${product.id}" /></td>
		<td><c:out value="${product.productName}" /></td>
		<td><c:out value="${product.description}" /></td>
		<td><input type="button" value="Delete"/>
		</tr>
	</c:forEach>

</table>
	

</body>
</html>