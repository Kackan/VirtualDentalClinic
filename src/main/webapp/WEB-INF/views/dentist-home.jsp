<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %><!--  potrzebne zeby obslugiwalo c -->
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dentist Page</title>
</head>
<body>


<div align="center">

<h1>Witaj!</h1>
<br/><br/>

<a href="showForm">Add dentist</a>
<br/>
<table border="1">

<tr>
<th>id:</th>
<th>Imie:</th>
<th>Nazwisko</th>
<th>Adres</th>
<th>Numer</th>
<th>Specjalizacja</th>
</tr>


<c:forEach items="${dentists}" var="dentist">
<tr>
<td>${dentist.id}</td>
<td>${dentist.firstName}</td>
<td>${dentist.lastName}</td>
<td>${dentist.address}</td>
<td>${dentist.number}</td>
<td>${dentist.specialization}</td>
</tr>
</c:forEach>


</table>
</div>

</body>
</html>