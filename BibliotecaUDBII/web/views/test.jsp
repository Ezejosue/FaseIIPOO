<%-- 
    Document   : test
    Created on : 12-06-2023, 10:40:05 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<base href="${pageContext.request.contextPath}/" />
<%
    request.setAttribute("title", "Test");
%>

 <%@ include file="components/header.jsp" %>
 
 <%@ include file="components/navbar.jsp" %>
 
 <%@ include file="components/sidebar.jsp" %>
 
 
 <!--contenido de-->
   
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <div class="container-fluid">
        <div class="row mb-2">
          <div class="col-sm-6">
            <h1>Pagina Test</h1>
          </div>
          <div class="col-sm-6">
            <ol class="breadcrumb float-sm-right">
              <li class="breadcrumb-item"><a href="#">Inicio</a></li>
              <li class="breadcrumb-item active">Actual</li>
            </ol>
          </div>
        </div>
      </div><!-- /.container-fluid -->
    </section>

    <!-- Main content -->
    <section class="content">

      <!-- Default box -->
      <div class="card">
        <div class="card-header">
            <h3 class="card-title, text-center" >REGISTRO DE USUARIOS</h3>

          <div class="card-tools">
            <button type="button" class="btn btn-tool" data-card-widget="collapse" title="Collapse">
              <i class="fas fa-minus"></i>
            </button>
            <button type="button" class="btn btn-tool" data-card-widget="remove" title="Remove">
              <i class="fas fa-times"></i>
            </button>
          </div>
        </div>
        <div class="card-body">
            <form  action="RegistroUsuarioServlet" method="post">
        <div class="mb-3">
          <label for="nombre" class="form-label">Nombre:</label>
          <input type="text" class="form-control" id="nombre" name="nombre" required>
        </div>
        <div class="mb-3">
          <label for="correo" class="form-label">Correo electrónico:</label>
          <input type="email" class="form-control" id="correo" name="correo" required>
        </div>
        <div class="mb-3">
          <label for="contrasena" class="form-label">Contraseña:</label>
          <input type="password" class="form-control" id="contrasena" name="contrasena" required>
        </div>
        <div class="mb-3">
          <label for="tipoUsuario" class="form-label">Tipo de usuario:</label>
          <select class="form-select" id="tipoUsuario" name="tipoUsuario" required>
            <option value="Administrador">Administrador</option>
            <option value="Alumno">Alumno</option>
            <option value="Profesor">Profesor</option>
          </select>
        </div>
        <button type="submit" class="btn btn-primary">Enviar</button>
      </form>
        </div>
        <!-- /.card-body -->
        <div class="card-footer">
          Footer
        </div>
        <!-- /.card-footer-->
      </div>
      <!-- /.card -->

    </section>
  
 <%@ include file="components/footer.jsp" %>