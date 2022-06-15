<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
</head>
<body>
<h3>Welcome, Enter The Student Details</h3>
<form:form method="POST"
           action="${pageContext.request.contextPath}/addStudent" modelAttribute="student">

            <form:label path="name">Name</form:label>
            <form:input path="name"/>


            <form:label path="email">Email</form:label>
            <form:input path="email"/>


            <form:label path="city">
                Contact Number</form:label>
            <form:input path="city"/>


            <input type="submit" value="Submit"/>


</form:form>
</body>
</html>