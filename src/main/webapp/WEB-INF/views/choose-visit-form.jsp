<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<table border="1">

<tr>
<td>ID:</td>
<td>Dzien:</td>
<td>Godzina:</td>
<td>Akcja</td>
</tr>
<c:forEach items="${visits}" var="visit">
<tr>
<td>${visit.id}</td>
<td>${visit.day}</td>
<td>${visit.time}</td>
<td><a href="saveVisit?visitId=${visit.id}"> Zapisz </a></td>
</tr>

</c:forEach>

</table>


</body>
</html>