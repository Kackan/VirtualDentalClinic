<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %><!--  potrzebne zeby obslugiwalo c -->
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dentist Page</title>
</head>
<body>


<div align="center">
<a href="showForm">Dodaj specjalistę</a>
<br/>
<table border="1">

<tr>
<th>id:</th>
<th>Imię:</th>
<th>Nazwisko:</th>
<th>Adres:</th>
<th>Numer:</th>
<th>Specjalizacja:</th>
<th>Opis:</th>
<th>Akcje:</th>
</tr>


<c:forEach items="${dentists}" var="dentist">
<tr>
<td>${dentist.id}</td>
<td>${dentist.firstName}</td>
<td>${dentist.lastName}</td>
<td>${dentist.address}</td>
<td>${dentist.number}</td>
<td>${dentist.specialization}</td>
<td>${dentist.comment}</td>
<td><a href="showVisitForm?id=${dentist.id}">Dodaj dni robocze</a>
<a href="delete?id=${dentist.id}">Usuń</a>
<a href="edit?id=${dentist.id}">Edytuj</a>
</td>
</tr>
</c:forEach>


</table>
<h2><a href="/Virtual_Dental_Clinic/patient/home">Panel pacjenta</a></h2>
</div>

</body>
</html>