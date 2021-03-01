<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="ftr" tagdir="/WEB-INF/tags/responsive/common/footer"%>


<html>
<head>
    <title>
        ManufacturerDetails
    </title>

    <style>
        table, th, td {
            border: 1px solid black;
        }
        table {
            border-collapse: collapse;
            width:600px;
        }

        th{
            background-color: #900C3F;
        }
        td{
            text-align:center;
            background-color: #f1f1c1;
        }

        body {
            background-image: url("https://media.istockphoto.com/photos/repairman-checking-voltage-with-digital-multimeter-picture-id1006169700?k=6&m=1006169700&s=612x612&w=0&h=HgVoR0qaeC_bJqZm9t8CmxMk_oFdcESDb10DLwPb5jw=");
            background-color: #cccccc;
            height: 500px;
            background-position: center;
            background-repeat: no-repeat;
            background-size: cover;
        }
        font
        {
            font-size:45px;
            color:#0B0208;
        }
    </style>
</head>

<body>


<br>
<center>

    <font>ManufacturerDetails</font>
    <hr>
    <br>

    <table>
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>City</th>
            <th>Country</th>
        </tr>
        <tr>
            <td>${singleData.id}</td>
            <td>${singleData.name}</td>
            <td>${singleData.city}</td>
            <td>${singleData.country.name}</td>
        </tr>
    </table>

</center>
</body>

</html>

