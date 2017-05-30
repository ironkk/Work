<%-- 
    Document   : AltaCliente
    Created on : 25-abr-2017, 17:49:27
    Author     : dam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>NUEVO USUARIO</h1>
        <form action="AltaUsuario" method="POST">
            <p>Username: <input type="text" name="username"></p>
            <p>Pass: <input type="password" name="pass"></p>
            <p>Name: <input type="text" name="name"></p>
            <p>Age: <input type="number" name="age"></p>
            
            <p><input type="submit" value="Alta" name="altausuario"></p>
        </form>
    </body>
</html>
