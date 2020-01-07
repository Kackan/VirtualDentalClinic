<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Zabiegi</title>
</head>
<body>

<div align="center">
<h1>Zabiegi wykonywane w naszej klinice</h1>
<table border="1">
<tr>
<th>Nazwa</th>
<th>Cena</th>
<th>Specjalista</th>
</tr>
<tr>
<td>Przegląd/wizyta kontrolna</td>
<td>Bezpłatna</td>
<td>Dentysta</td>
</tr>
<tr>
<td>Wypełnienie</td>
<td>200zł</td>
<td>Dentysta</td>
</tr>
<tr>
<td>Odbudowa zęba</td>
<td>190zł</td>
<td>Dentysta</td>
</tr>
<tr>
<td>Wybielanie</td>
<td>170zł</td>
<td>Dentysta</td>
</tr>
<tr>
<td>Oczyszczanie</td>
<td>130zł</td>
<td>Dentysta</td>
</tr>
<tr>
<td>Fluoryzacja</td>
<td>70 zł</td>
<td>Dentysta</td>
</tr>
<tr>
<td>Ząb kanałowy</td>
<td>320 zł</td>
<td>Dentysta</td>
</tr>
<tr>
<td>Aparat stały</td>
<td>1550 zł</td>
<td>Ortodonta</td>
</tr>
<tr>
<td>Konsultacja</td>
<td>70 zł</td>
<td>Ortodonta</td>
</tr>
<tr>
<td>Wizyta kontrolna</td>
<td>130 zł</td>
<td>Ortodonta</td>
</tr>
</table>
<br/>

Oblicz przybliżoną cenę
<table border="1">
<form:form method="POST" modelAttribute="treatment" action="result">
<tr>
<td>
<ul><form:checkboxes items="${treatment.treatments}" path="chosen"/></ul>
</td>
</tr>
<td><input type="submit" value="Podlicz"></td>
</form:form>
</table>

</div>

</body>
</html>