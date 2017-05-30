<%-- 
    Document   : altaproducto
    Created on : 15-may-2017, 16:19:23
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
        <h1>NUEVO PRODUCTO</h1>
        <form action="AltaCliente" method="POST">
            <p>Nombre: <input type="text" name="nombre"></p>
            <p>Descripcion: <input type="text" name="descripcion"></p>
            <p>Empresa: <input type="text" name="empresa"></p>
            <p>Precio: <input type="number" name="precio"></p>
            <p><input type="submit" value="Alta" name="altaproducto"></p>
        </form>
    </body>
</html>
