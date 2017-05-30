<%-- 
    Document   : final
    Created on : 25-abr-2017, 17:41:31
    Author     : dam
--%>

<%@page import="servlet.AltaCliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String status = (String) request.getAttribute("status");
            if (status.equals(AltaCliente.STATUS_OK)) { %>
        <p>Cliente registrado</p> 
        <% } else if (status.equals(AltaCliente.STATUS_ERROR)) { %>
        <p>Team already exists.</p>
        <% } %>
        <a href="index.jsp">Main menu</a>
    </body>
</html>
