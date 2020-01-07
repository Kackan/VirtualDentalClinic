<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %><!--  potrzebne zeby obslugiwalo c -->
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All visit</title>
</head>
<body>

<div align="center">

<h1>W te dni i godziny przyjmuje twój dentysta</h1>


<form:form action="addVisit?id=${dentist.id}" modelAttribute="patient">
<table border="1">

<tr>
<th>Dzień:</th>
<th>Godzina:</th>
</tr>


<c:forEach items="${visits}" var="visit">
<tr>
<td>${visit.day}</td>
<td>${visit.time}</td>
</tr>
</c:forEach>


</table>
</form:form>

</div>



</body>
</html>