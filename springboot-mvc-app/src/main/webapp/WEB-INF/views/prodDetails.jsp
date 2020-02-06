<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Product Details</h1>

	<table border="1">
		<tr>
			<th>Product Id</th>
			<th>Product Code</th>
			<th>Product Cost</th>
			<th>Product Model</th>
			<th>Product Description</th>
			<th>Product Format</th>

		</tr>


		<tr>
			<th>${product.prodId }</th>
			<td>${product.prodCode }</td>
			<td>${product.prodCost }</td>
			<td>${product.prodModel }</td>
			<td>${product.prodDesc }</td>
			<td>${product.prodFormat }</td>

		</tr>

	</table>


</body>
</html>