<%-- 
    Document   : mostrarUsu
    Created on : 12-08-2023, 09:27:32 PM
    Author     : GUASI
--%>

<%@page import="beans.Usuario"%>
<%@page import="controlador.MostrarUsuariosServlet" %>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<base href="${pageContext.request.contextPath}/" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lista de Usuarios Registrados</h1>
<%
    ArrayList<Usuario> MostrarUsuarios = (ArrayList) request.getSession().getAttribute("MostrarUsuarios");
    for (Usuario usu : MostrarUsuarios) {
%>
        <p>Nombre: <%= usu.getNombre() %></p>
        <!-- Aquí puedes agregar más código para mostrar otros detalles del usuario -->
<%
    }
%>

    </body>
</html>
