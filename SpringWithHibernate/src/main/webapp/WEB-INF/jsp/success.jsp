<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.section{
background-color: lightblue;

}


</style>

</head>
<body>
<h1>your Record is successfully inserted.....</h1>
<hr>
<div class="section">
Roll number is :${bean.roll }<br>
Student name is :${bean.sname }<br>
course is :${bean.course }

</div>
<hr>


</body>
</html>