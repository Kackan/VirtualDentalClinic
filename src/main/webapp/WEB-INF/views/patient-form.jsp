<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Pacjent formularz</title>
</head>
<body>

<div align="center">
<form:form action="savePatient?visitId=${visit.id}" modelAttribute="patient">

<table>
<tr>
<td>Imię: <form:input path="firstName"/></td>
</tr>

<tr>
<td>Nazwisko: <form:input path="lastName"/></td>
</tr>

<tr>
<td>Adres: <form:input path="address"/></td>
</tr>

<tr>
<td>Numer :<form:input path="number"/></td>
</tr>

<tr>
<td>
<input type="submit" value="Zapisz"/>
</td>
</tr>
</table>

</form:form>
</div>

</body>
</html>