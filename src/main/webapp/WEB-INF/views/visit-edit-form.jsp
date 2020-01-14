<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edytuj</title>
</head>
<body>
<body>
<form:form action="saveEditedVisit?dentistId=${dentist}" method="post" modelAttribute="visit">
<table>

<tr>
<td>ID:</td>
<td>${visit.id}</td>
<form:hidden path="id"/>
</tr>

<tr>
<th>Dzień:</th>
<td><form:input path="day"/></td>
</tr>
<tr>

<tr>
<th>Czas:</th>
<td><form:input path="time"/></td>
</tr>
<tr>



<tr>
<td><input type="submit" value="Submit"/></td>
</tr>

</table>
</form:form>


</body>
</html>