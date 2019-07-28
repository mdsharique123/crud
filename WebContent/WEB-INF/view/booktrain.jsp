<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form:form modelAttribute="data" action="processBookTrain">

BookId: <form:input path="bookid"/><br>
TrainName: <form:input path="trainname"/><br>
PassengerName: <form:input path="passengername"/><br>
PassengerContactNumber: <form:input path="passengercontactnumber"/><br>
Gender: <form:input path="gender"/><br>
PassengerAge: <form:input path="passsengerage"/><br>

<input type="submit" value="submit">


</form:form>

</body>
</html>