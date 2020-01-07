<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Pacjent domowa</title>
</head>
<body>

<div align="center">

<h1>Dostępni specjaliści</h1>

<table border="1">

<tr>
<th>Imię: </th>
<th>Nazwisko: </th>
<th>Numer: </th>
<th>Specjalizacja: </th>
<th>Opis: </th>
<th>Akcja: </th>
</tr>

<c:forEach items="${dentists}" var="dentist">
<tr>
<td>${dentist.firstName}</td>
<td>${dentist.lastName}</td>
<td>${dentist.number}</td>
<td>${dentist.specialization}</td>
<td>${dentist.comment}</td>
<td><a href="showPatientForm?id=${dentist.id}"> Zapisz </a></td>
</tr>
</c:forEach>
</table>
</div>

<div align="center">

<br/>
<h2><a href="/Virtual_Dental_Clinic/mark/home"> Opinie pacjentów </a></h2>
<br/>


<h2><a href="/Virtual_Dental_Clinic/dentalTreatment/home">Cennik</a></h2>

</div>

</body>
</html>