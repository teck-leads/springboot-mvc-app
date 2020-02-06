<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
<select name="prodBrnd" multiple="multiple">
<option>INFY</option>
<option>NIT</option>
<option>TCS</option>

</select>
<input type="submit" value="Add Product">
</pre>
	</form>
</body>
</html>