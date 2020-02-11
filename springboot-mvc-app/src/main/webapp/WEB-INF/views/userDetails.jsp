<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>

<th>ID</th>
<th>NAME</th>
<th>Country</th>
<th>Operation</th>
</tr>
<c:forEach items="${users }" var="user" >
<tr>
<td>${user.id }</td>
<td>${user.name }</td>
<td>${user.country }</td>
<td><a href="http://localhost:8083/getusr?id=${user.id }">Delete</a></td>
</tr>
</c:forEach>



</table>
<pre>




</pre>
</body>
</html>