<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Person Form</title>
</head>
<body>

<h1>Person Form</h1>
<form action="/2JEE-07-PersonForm2/loginServlet" method = "post">
<fieldset>
<legend>Fill form please:</legend>
<label for = "firstname">FirstName *</label>
<input type="text" id="firstname" name="firstname" value="${param.firstname}" required>
<br>
<label for = "lastname">LastName *</label>
<input type="text" id="lastname" name="lastname" value="${param.lastname}" required>
<br>
<label for = "age">Age *</label>
<input type="text" id="age" name="age" value="${param.age}" required> 
<c:out value = "${error}"/> 
<br>
<input type = "submit" value = "Submit" name="ok">
</fieldset>
</form>

</body>
</html>