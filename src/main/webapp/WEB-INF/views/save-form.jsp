<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
          
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Zapisywanie pacjenta</title>
</head>
<body>

<form:form action="savePatient?dentId=${dentist.id}" modelAttribute="patient">
<table>
<tr>
<td>Imię:</td>
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
<td><input type="submit"value="Zapisz"></td>
</tr>

</table>

</form:form>

</body>
</html>