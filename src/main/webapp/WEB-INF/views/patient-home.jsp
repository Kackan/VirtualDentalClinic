<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Patient home</title>
</head>
<body>

<div align="center">

<h1>Dostepni dentysci</h1>

<table border="1">

<tr>
<th>Imie:</th>
<th>Nazwisko</th>
<th>Numer</th>
<th>Specjalizacja</th>
<th>Akcja</th>
</tr>

<c:forEach items="${dentists}" var="dentist">
<tr>
<td>${dentist.firstName}</td>
<td>${dentist.lastName}</td>
<td>${dentist.number}</td>
<td>${dentist.specialization}</td>
<td><a href="showForm?id=${dentist.id}">Zapisz</a></td>
</tr>
</c:forEach>


</table>


</div>


</body>
</html>