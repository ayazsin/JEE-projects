<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/style.css">
<title>MY TEAM</title>
</head>
<body>
<h1>Welcome to my team</h1>

<div id="imgcont">
	<img src = "img/img1.jpg">
	<img src = "img/img2.jpg">
	<img src = "img/img3.jpg">
	<img src = "img/img4.jpg">
	<img src = "img/img5.jpg">
</div>
<div id="table">
<table>
	<tr>
		<th>First name</th>
		<th>Last name</th>
		<th>Age</th>
	</tr>
	<c:forEach items = "${salariesList}" var = "salarie" > 
		 <tr>
			 <td><c:out value = "${salarie.firstname}"> </c:out></td>
			 <td><c:out value = "${salarie.surname}"> </c:out></td>
			 <td><c:out value = "${salarie.age}"> </c:out></td> 
		 </tr>
	</c:forEach>
</table>
</div>
</body>
</html>