<%@page import="Modelo.Usuario"%>
<%@page import="ModeloDAO1.UsuarioDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <div class="col-lg-6">
                <%
                    UsuarioDAO dao = new UsuarioDAO();
                    String nroID = request.getParameter("nroID");
                    Usuario p = (Usuario) dao.list(nroID);
                %>
                <h1>Modificar usuario</h1>
                <form action="Controlador">

                    N°ID:<br>
                    <input class="form-control" type="text" name ="txtNID" value="<%= p.getNroID()%>"><br>
                    Tipo ID:<br>
                    <input class="form-control" type="text" name ="txtTipoId" value="<%= p.getTipoID()%>"><br>
                    Nombre:<br>
                    <input class="form-control" type="text" name ="txtNombre" value="<%= p.getNombres()%>"><br>
                    Correo:<br>
                    <input class="form-control" type="text" name ="txtCorreo" value="<%= p.getCorreo()%>"><br>
                    Celular:<br>
                    <input class="form-control" type="text" name ="txtCelular" value="<%= p.getCelular()%>"><br>

                    <input class="btn btn-primary" type="submit" name="accion" value="Actualizar"><br>
                    <br>
                    <a class="btn btn-primary" href="Controlador?accion=listar">Regresar</a>
                </form>
            </div>         
        </div>
    </body>
</html>
