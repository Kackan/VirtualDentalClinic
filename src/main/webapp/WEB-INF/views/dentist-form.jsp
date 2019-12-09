<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Doctor Form</title>
</head>
<body>

<div align="center">
<h1>Dodaj dentyste:</h1>

<form:form action="save" method="post" modelAttribute="dentist">
<table>
<tr>
<th>Imie:</th>
<td><form:input path="firstName"/></td>
</tr>
<tr>

<th>Nazwisko:</th>
<td><form:input path="lastName"/></td>
</tr>

<tr>
<th>Adres:</th>
<td><form:input path="address"/></td>
</tr>
<tr>
<th>Nr telefonu:</th>
<td><form:input path="number"/></td>
</tr>

<tr>
<th>Specjalizacja</th>
<td><form:input path="specialization"/></td>
</tr>

<tr>
<td><input type="submit" value="Submit"/></td>
</tr>

</table>


</form:form>


</div>


</body>
</html>