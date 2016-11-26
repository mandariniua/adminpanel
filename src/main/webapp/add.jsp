<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Product</title>
</head>
<body>

<form action="AddProductServlet" method="post">
	Name Product<br/> <input type="text" name="productName" ></br>
	Description Product </br> <input type="text" name="description">
	<br/><input type="submit" value="Add"/>

</form>

</body>
</html>