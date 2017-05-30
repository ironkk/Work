<%-- 
    Document   : usuarioValidado
--%>

<%@page import="persistence.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Validación cliente</title>
    </head>
    <body>
        <%
            String usuario = (String) session.getAttribute("username");
            User usu = (User) request.getAttribute("username");
            if (usuario != null && usu != null) {
                if(usuario == "admin"){
        %>
        <h1>OPCIONES ADMIN</h1>
        </br>
        <form action="altaproducto.jsp">
            <input type="submit" value="Alta Producto">
        </form>
        <form action="borrarproducto.jsp">
            <input type="submit" value="Borrar Producto">
        </form>
        <%            
                }else{
        %>
        
        <h1>Hola <%=usuario%></h1>
        </br>
        //lista tareas pendientes, finalizadas y borrar tareas 
        <% }} else {
        %>
        <h1>No hay usuario validado</h1>
        <%
    }%>
    </body>
</html>