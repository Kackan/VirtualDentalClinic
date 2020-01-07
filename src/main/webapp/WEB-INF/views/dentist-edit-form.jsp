<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
        
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edycja</title>
</head>
<body>
<form:form action="save" method="post" modelAttribute="dentist">
<table>

<tr>
<td>ID:</td>
<td>${dentist.id}</td>
<form:hidden path="id"/>
</tr>

<tr>
<th>Imię:</th>
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
<th>Opis:</th>
<td><form:textarea path="comment"/></td>
<tr>

<tr>
<td><input type="submit" value="Submit"/></td>
</tr>

</table>
</form:form>



</body>
</html>