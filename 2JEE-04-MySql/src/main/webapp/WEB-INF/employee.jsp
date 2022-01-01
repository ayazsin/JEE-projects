<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>        
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/style.css">
<title>Employee</title>
</head>
<body>
<div>
<table id="table">
	<tr>
		<th>ID</th>
		<th>First name</th>
		<th>Last name</th>
		<th>Salary</th>
		<th>Year</th>
	</tr>
	<c:forEach items = "${empList}" var = "employee" > 
		 <tr>
			 <td><c:out value = "${employee.id}"> </c:out></td>
			 <td><c:out value = "${employee.first_name}"> </c:out></td>
			 <td><c:out value = "${employee.last_name}"> </c:out></td> 
			 <td><c:out value = "${employee.salary}"> </c:out></td> 
			 <td><c:out value = "${employee.year}"> </c:out></td> 
		 </tr>
	</c:forEach>
</table>
</div>

<p id="error"> <c:out value = "${error}"></c:out>
<p id="delete"> <c:out value = "${delete}"></c:out>

<c:if test="${emp.first_name!= null}">
<div>
<table id="table2">
<tr> 
<td> ID </td> <td> <c:out value = "${emp.id}"></c:out> </td>
</tr>
<tr>
<td> NAME </td> <td><c:out value = "${emp.first_name}"></c:out> </td>
</tr>
<tr>
<td> SURNAME </td> <td><c:out value = "${emp.last_name}"></c:out> </td>
</tr>
<tr>
<td> SALARY </td> <td><c:out value = "${emp.salary}"></c:out> </td>
</tr>
<tr>
<td> YEAR </td> <td><c:out value = "${emp.year}"></c:out> </td>
</tr>
</table>
</div>

 </c:if>


</body>
</html>