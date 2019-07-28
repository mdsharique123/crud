<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table>
<tr>
<td>Train List</td>
</tr>

<tr>

<th>Id</th>
<th>TrainName</th>
<th>PassengerName</th>
<th>PassengerContactNumber</th>
<th>Gender</th>
<th>PassengerAge</th>

 
</tr>

<c:forEach var="customer"  items="${listtrain}">

<tr>
<td>${customer.bookid}</td>
<td>${customer.trainname}</td>
<td>${customer.passengername}</td>
<td>${customer.passengercontactnumber}</td>
<td>${customer.gender}</td>
<td>${customer.passsengerage}</td>
</tr>


</c:forEach>


</table>


</body>
</html>