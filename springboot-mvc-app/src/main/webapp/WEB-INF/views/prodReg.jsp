<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>




	<h1>Product Registration</h1>
	<form action="save" method="POST">
		<pre>
	
Product Id: <input type="text" name="prodId">
Product code: <input type="text" name="ProdCode">
Product Cost: <input type="text" name="prodCost">
Product Model: <input type="text" name="prodModel">
Product Description: <textarea name="prodDesc" rows="5" cols="30"></textarea>
Fomat: <select name="prodFormat">
<option>Red</option>
<option>Green</option>
<option>Blue</option>
</select>
Grades:

<input type="checkbox" name="prodGrd" value="A">
<input type="checkbox" name="prodGrd" value="B">
<input type="checkbox" name="prodGrd" value="C">

Brands
<select name="prodBrnd" >





<c:choose>

			<c:when test="${empty prodcutDp1.prodBrnd}">
				<option>No value</option>
			</c:when>
			<c:otherwise>
				<c:forEach items="${ prodcutDp1.prodBrnd}" var="dw">

<option>${dw }</option>

</c:forEach>
			</c:otherwise>
		</c:choose>





</select>
<input type="submit" value="Add Product">
</pre>
	</form>
</body>
</html>