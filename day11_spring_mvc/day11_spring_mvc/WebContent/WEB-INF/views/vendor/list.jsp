<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3 align="center">Vendor List</h3>
	<table style="background-color: cyan; margin: auto;" border="1">
		<c:forEach var="v" items="${requestScope.vendor_list}">

			<tr>
				<td>${v.name}</td>
				<td>${v.email}</td>
				<td>${v.city}</td>
				<td>${v.phoneNo}</td>
			</tr>

		</c:forEach>
	</table>
</body>
</html>