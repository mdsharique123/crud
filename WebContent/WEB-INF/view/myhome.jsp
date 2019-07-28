<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css"/>

<style>

ul{

list-style:none;
}

li{

float:left;
}

li a{
text-decoration:none;
}
.menu {
  background-color: #333;
  overflow: auto;
  white-space: nowrap;
}

.menu a {
  
  color: white;
  text-align: center;
  padding: 14px;
  
}

.menu a:hover {
  background-color:#777;
}







</style>
</head>
<body>

<div id="outer">
<div id="header">

<div id="logo">
<img src="${pageContext.request.contextPath}/resources/images/train.jpg"/></div>

<div id="banner"></div>

</div>


<div id="maincontainer">
<div id="leftcontainer">
<form:form modelAttribute="store" action="processForm">

name:<form:input path="username"/><br>
password:<form:input path="password"/><br>

<input type="submit" value="submit">


</form:form>
</div>

<div id="rightcontainer">
<div class="menu">
<ul>

<li><a href="hme">Home</a></li>
<li><a href="book">BookTrain</a></li>
<li><a href="view">View</a></li>
<li><a href="update">Update Train</a></li>
<li><a href="cancel">Cancel</a></li>
</ul>
</div>

</div>
</div>

<div id="footer"></div>
</div>


</body>
</html>