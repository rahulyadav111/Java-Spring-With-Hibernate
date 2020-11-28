<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.error{
color: red;

}

</style>
</head>
<body>
<h1>Registration page!</h1>
<form:form action="stor" method="post" modelAttribute="bean">
Student name :<br>
<form:input path="sname"/><br>
<form:errors path="sname" cssClass="error"></form:errors>
Course :<br>
<form:input path="course"/><br>
<form:errors path="course" cssClass="error"></form:errors>
<input type="submit" value="Register">

</form:form>
</body>
</html>