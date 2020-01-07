<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Wybór dentysty</title>
</head>
<body>

Wybierz specjalistę, o którym chcesz wystawić opinię:

<table border="1">
<tr>
<td>Imię:</td>
<td>Nazwisko:</td>
<td>Specjalizacja:</td>
<td>Akcja:</td>
</tr>
<c:forEach items="${dentists}" var="dentist">
<tr>
<td>${dentist.firstName}</td>
<td>${dentist.lastName}</td>
<td>${dentist.specialization}</td>
<td><a href="addComment?id=${dentist.id}">Wystaw opinię</a></td>
</tr>
</c:forEach>
</table>

</body>
</html>