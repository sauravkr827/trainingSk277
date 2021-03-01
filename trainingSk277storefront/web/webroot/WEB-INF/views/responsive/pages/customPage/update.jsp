<%--
  Created by IntelliJ IDEA.
  User: saurav
  Date: 2/22/2021
  Time: 11:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fomr" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
<head>
    <title>Registration Form</title>
</head>
<body>
<center>
    <h1>Registration Form</h1>
    <hr>
    <h4>${msg}</h4>
    <br> <font color="#5f9ea0">${msg} </font>
    <form:form modelAttribute="model" action="saveUpdate" method="post">
        <table>
            <tr><td>Id :</td>
                <td><form:input path="id" placeholder="Id" readonly="true"/></td>
            </tr>
            <tr><td>Name :</td>
                <td><form:input path="name" placeholder="Enter Name"/></td>
            </tr>
            <tr><td>City :</td>
                <td><form:input path="city" placeholder="Enter City"/></td>
            </tr>
            <tr><td>Country :</td>
                <td><form:input path="country" placeholder="Enter Country"/></td>
            </tr>
            <tr><td bgcolor="#6495ed"><input type="submit" value="Submit"/></td></tr>
        </table>

    </form:form>
</center>

</body>
</html>
