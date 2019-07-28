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
<td>Train List Of Train</td>
</tr>

<tr>
<th>Id</th>
<th>Train Name</th>
<th>Passenger Name</th>
<th>PassengerContactNumber</th>
<th>Gender</th>
<th>PassengerAge</th>
</tr>


<c:forEach var="customers"  items="${trainList}">
<c:url var="update" value="/showUpdate">
<c:param name="customerId" value="${customers.bookid}"/>

</c:url>

<tr>
<td>${customers.bookid}</td>
<td>${customers.trainname}</td>
<td>${customers.passengername}</td>
<td>${customers.passengercontactnumber}</td>
<td>${customers.gender}</td>
<td>${customers.passsengerage}</td>
<td>
<a href="${update}">Update</a>
</td>


</tr>

</c:forEach>
</table>

</body>
</html>