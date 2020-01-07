<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    
<!DOCTYPE html>
<html>
<head>
<style>
#commentSection
{
width: 30%;
}

</style>
<meta charset="UTF-8">
<title>Dodawanie komentarza</title>
</head>
<body>

<div align="center">

<form:form action="saveComment?id=${dentist.id}" method="post" modelAttribute="mark">
<div id="commentSection">
<p>Komentarz:</p><form:textarea path="comment"/>
<br />
<p>Nick:</p><form:input path="author"/>
</div>
</form:form>

</div>

</body>
</html>