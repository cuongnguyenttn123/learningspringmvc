<%--
  Created by IntelliJ IDEA.
  User: cuong
  Date: 30/07/2019
  Time: 04:40 CH
  To change this template use File | Settings | File Templates.
--%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>index</title>
</head>
<body>
<form:form method="POST" action="/upload/excel" enctype="multipart/form-data" modelAttribute="myFile">
    File: <input type="file" name="multipartFile" /> <br /> <br/>
    Description: <form:input path="description"/> <br />
    <input type="submit" value="Submit" />
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />

</form:form>
</body>
</html>