<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Object List</title>
</head>
<body>
    <h1>Object List</h1>
    <ul>
        <c:forEach listOfBookings="${listOfBookings}" var="object">
            <li>${object.cname}</li>
        </c:forEach>
    </ul>
</body>
</html>
