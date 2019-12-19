<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Visit form</title>
</head>
<body>

<form:form action="saveVisit?id=${dentist.id}" modelAttribute="visit">

<table>

<tr>
<td>Dzien pracy:</td>
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


</body>
</html>