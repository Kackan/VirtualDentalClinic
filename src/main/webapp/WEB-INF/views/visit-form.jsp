<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
	<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Visit form</title>
</head>
<body>


<div align="center">
<form:form action="saveVisit?id=${dentist.id}" modelAttribute="visit">
<table>
<tr>
<td>Dzień pracy:</td>
<td><form:input path="day"/></td>
</tr>

<tr>
<td>Godzina pracy:</td>
<td><form:input path="time"/></td>
</tr>

<tr>
<td><input type="submit" value="Akceptuj"></td>
<tr>
</table>
</form:form>

<br/><br/>

<!-- dodaj usuniecie dnia i godziny :) -->
<h2>Zapisane dni:</h2>
<table border="1">
<tr>
<td>ID:</td>
<td>Dzień:</td>
<td>Godzina:</td>
<td>Akcje:</td>
</tr>

<c:forEach items="${dentist.visits}" var="dv">
<tr>
<td>${dv.id}</td>
<td>${dv.day}</td>
<td>${dv.time}</td>
<td><a href="deleteVisit?id=${dv.id}&dentistId=${dentist.id}">Usuń</a>
<a href="">Edytuj</a></td>
</tr>
</c:forEach>
</table>


</div>
</body>
</html>