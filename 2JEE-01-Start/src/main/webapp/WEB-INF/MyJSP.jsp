<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>VUE JSP</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
<h3>Welcome sur ma vue JSP: jsp1</h3>
<%
out.print("ceci est du code java, 2+3 = ");
int i = 2 + 3;
out.print(i);
%>
<br>
<a href="index.html">Retour</a>

</body>
</html>