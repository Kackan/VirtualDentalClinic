<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dentist Form</title>
<style>
.error
{
color:red;
}
</style>
</head>
<body>

<div align="center">
<h1>Dodaj dentystę:</h1>

<form:form action="save" method="post" modelAttribute="dentist">
<table>
<tr>
<th>Imię:</th>
<td><form:input path="firstName"/></td>
<form:errors path="firstName" cssClass="error"></form:errors>
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
<th>Opis:</th>
<td><form:textarea path="comment"/></td>
<tr>

<tr>
<td><input type="submit" value="Submit"/></td>
</tr>

</table>


</form:form>


</div>


</body>
</html>