<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %><!-- 让${Error}当做一个变量，而不是以字符串的形式打印${Error} -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
    <form role="form" action="loginOn" method = "post">
        <table align = "center" border = "1" width = "500">
            <tr>
                <td>username: </td>
                <td>
                    <input type = "text" name = "username"/>
                </td>
            </tr>
            <tr>
                <td>password:</td>
                    <td>
                        <input type = "password" name = "password"/>
                    </td>
            </tr>
            <tr align = "center">
                    <td colspan = "2">
                            <input type = "submit" value = "login"/>
                            <input type = "reset" value = "reset"/>
                    </td>
            </tr>
            
        </table>
        <p style="font-size: 14px; line-height: 150%; font-family: consolas;">
                <font color="red">${Error}</font>
        </p>
    </form>
</body>
</html>
