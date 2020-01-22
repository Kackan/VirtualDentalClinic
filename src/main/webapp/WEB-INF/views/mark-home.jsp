<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Opinie</title>
<style type="text/css">

.comment
{
background-color: #FFFACD;
padding: 5px;
border-style: dotted;
width: 30%;
margin-bottom: 10px;
}

</style>
</head>
<body>

<div align="left">
<a href="chooseDentist">Dodaj opinię: </a><br/>
<a href="/Virtual_Dental_Clinic/patient/home">Powrót</a>
<p id="head">OPINIE:</p>

<c:forEach items="${marks}" var="mark">
<div class="comment">
<p>Author: ${mark.author}</p>
<p>Komentarz: ${mark.comment}</p>
<p>Specjalista: ${mark.dentist.firstName} ${mark.dentist.lastName} ${mark.dentist.specialization}</p>
</div>

</c:forEach>
</div>

</body>
</html>