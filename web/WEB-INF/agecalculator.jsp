<%-- 
    Document   : agecalculator
    Created on : 24-Sep-2021, 7:54:32 AM
    Author     : wenchi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="POST" action="age" >
            <label>Enter your age:</label>
            <input type="text" name="age">
            <br>
            <input type="submit" name="cal" value="Age next birthday"><br>
            ${message}<br>
            <a href="/CPRG-352-LAB03/arithmetic">Arithmetic Calculator</a>
        </form>
    </body>
</html>
