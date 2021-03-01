<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<center>
<h1>List Of Manufacturer Details</h1>
<table border="1px">
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>City</th>
        <th>Country</th>
    </tr>
    <c:forEach items="${listOfData}" var="list">
        <tr>
            <td>${list.id} </td>
            <td>${list.name}</td>
            <td>${list.city}</td>
            <td>${list.country.name}</td>
        </tr>
    </c:forEach>
</table>
</center>