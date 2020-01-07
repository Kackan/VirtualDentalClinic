<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dodawanie zabiegu</title>
</head>
<body>
<div align="center">
<form:form action="save" modelAttribute="dentalTreatment">
<p>Nazwa:<form:input path="name"/></p>
<p>Cena:<form:input path="price"/></p>
<p><input type="submit" value="Dodaj">
</p>
</form:form>
</div>
</body>
</html>