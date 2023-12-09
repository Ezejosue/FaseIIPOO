<%-- 
    Document   : test
    Created on : 12-06-2023, 10:40:05 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    request.setAttribute("title", "Usuarios");
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
            <h1>Usuarios</h1>
          </div>
          <div class="col-sm-6">
            <ol class="breadcrumb float-sm-right">
              <li class="breadcrumb-item"><a href="#">Usuarios</a></li>
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
            <h3 class="card-title">Lista de usuarios</h3>

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
          <table class="table">
            <thead>
              <tr>
                <th scope="col">Nombre</th>
                <th scope="col">Correo</th>
                <th scope="col">Rol de Usuario</th>
                <th scope="col">Mora</th>
              </tr>
            </thead>
            <tbody>
              <tr>
                <td>Nombre1</td>
                <td>correo1@example.com</td>
                <td>Rol1</td>
                <td>0</td>
              </tr>
            </tbody>
          </table>
        </div>
        
      </div>
      <!-- /.card -->

    </section>
  
 <%@ include file="components/footer.jsp" %>