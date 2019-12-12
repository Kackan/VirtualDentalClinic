<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>      
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Save patient</title>
</head>
<body>

<form:form action="savePatient?id=${dentist.id}" modelAttribute="patient">

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
<td>Adres:</td>
<td><form:input path="address"/></td>
</tr>

<tr>
<td>Numer:</td>
<td><form:input path="number"/></td>
</tr>

<tr>
<td>Data:</td>
<td><form:input path="visitDay"/></td>
</tr>

<tr>
<td><input type="submit"value="Zapisz"></td>
</tr>

</table>

</form:form>

</body>
</html>