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
<h1>Dodaj doktora:</h1>


<form:form action="save" method="post" modelAttribute="doctor">

</form:form>

<form:form action="save" method="post" modelAttribute="doctorDetails"> 

<table>

<tr>
<td>Imie:</td>
<td><form:input path="firstName"/></td>
</tr>

<tr>
<td>Nazwisko:</td>
<td><form:input path="lastName"/></td>
</tr>

<tr>
<td>Numer telefonu:</td>
<td><form:input path="number"/></td>
</tr>

<tr>
<td>Specjalizacja:</td>
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