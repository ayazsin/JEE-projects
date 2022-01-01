<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Currency Converter</title>
</head>
<body>

<form action="" method = "post">
<fieldset>
<legend>Fill form please:</legend>
<label for = "amount">Amount *</label>
<input type="text" id="amount" name="amount" value="${param.amount}">
<br>
<input type="radio" id="eToD" name="currency" value = "0" checked>
<label for="eToD">Euro To Dollar</label>
<br>
<input type="radio" id="dToE" name="currency" value = "1">
<label for="dToE">Dollar to Euro</label>
<br>
<input type = "submit" value = "Submit" name="ok">

</fieldset>

</form>


<br>

<c:choose>
	<c:when test = "${! empty error}">
		<p> <c:out value = "${error}"/> </p>
	</c:when>
	<c:when test = "${empty error and param.amount>=1000}">
		<p id="error"> You have entered an amount over 1000, please enter a smaller amount!!! <p>
	</c:when>
	<c:otherwise>
		<c:if test = "${param.currency==0}">
			Amount : <c:out value = "${param.amount}"/>  
			EUR = 
			<c:out value = "${dollar}"/> USD
		</c:if>
		<c:if test = "${param.currency==1}">
			Amount : <c:out value = "${param.amount}"/>  
			USD =
			<c:out value = "${euro}"/> EUR
		</c:if>
	</c:otherwise>
</c:choose>




</body>
</html>