<%-- 
    Document   : arithmeticcalculator
    Created on : 24-Sep-2021, 7:53:38 PM
    Author     : wenchi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="POST" action="arithmetic">
            <label>First:</label>
            <input type="text" name="first_number" value=${firstnumber}><br>
            <label>Second:</label>
            <input type="text" name="second_number" value=${secondnumber}><br>
            <input type="submit" name="cal_method" value="+" />
            <input type="submit" name="cal_method" value="-" />
            <input type="submit" name="cal_method" value="*" />
            <input type="submit" name="cal_method" value="/" /><br>
            <p>
                Result: ${message}<br>
                <a href="/CPRG-352-LAB03/age">Age Calculator</a>
            </p>
        </form>
    </body>
</html>
