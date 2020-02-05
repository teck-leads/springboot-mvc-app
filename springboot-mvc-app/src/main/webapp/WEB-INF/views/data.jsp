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
	<h1>Spring Boot - MVC web application example</h1>
	<hr>

	<table>
		<tr>
			<td>Name</td>
			<td>${name }</td>
		</tr>
		<tr>
			<td>Spouse Name</td>
			<td>${spouse }</td>

		</tr>
	</table>
	<hr>
	<table>
		<tr>
			<td>Name</td>
		</tr>
		<c:forEach items="${list} " var="li">
			<tr>
				<%-- <td><c:out value="${li}" /></td> --%>
				<td>${li }</td>

			</tr>
		</c:forEach>
	</table>
	<hr>
	<table>

		<tr>
			<td>Id</td>
			<td>Name</td>
			<td>Country</td>
		</tr>
		<tr>
			<td>${user.id }</td>
			<td>${user.name }</td>
			<td>${user.country }</td>
		</tr>
	</table>

<hr>
<table border="1">
<tr>
			<td>Id</td>
			<td>Name</td>
			<td>Country</td>
		</tr>
<c:forEach items="${users }" var="user">
<tr>
			<td>${user.id }</td>
			<td>${user.name }</td>
			<td>${user.country }</td>
		</tr>

</c:forEach>
</table>
</body>
</html>