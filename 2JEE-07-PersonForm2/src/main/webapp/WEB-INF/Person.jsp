<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>       
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Person Info</title>
</head>
<body>

<p> Hi, your name:<c:out value = "${firstnameS}"/> </p>
<p> your surname: <c:out value = "${lastnameS}"/> </p>
<p> your age: <c:out value = "${ageS}"/> </p>
<p> and you are <c:out value = "${personCat}"/> </p>




</body>
</html>