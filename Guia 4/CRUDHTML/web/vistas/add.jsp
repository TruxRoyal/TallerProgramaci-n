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
            <h1>Agregar usuario</h1>
            <div class="col-lg-6">
                <form>
                    N°ID:<br>
                    <input class="form-control" type="text" name ="txtNID"><br>
                    Tipo ID:<br>
                    <input class="form-control" type="text" name ="txtTipoId"><br>
                    Nombre:<br>
                    <input class="form-control" type="text" name ="txtNombre"><br>
                    Correo:<br>
                    <input class="form-control" type="text" name ="txtCorreo"><br>
                    Celular:<br>
                    <input class="form-control" type="text" name ="txtCelular"><br>

                    <input class="btn btn-primary" type="submit" name="accion" value="Agregar"><br>
                    <br>
                    <a class="btn btn-primary" href="Controlador?accion=listar">Regresar</a>
                </form>
            </div>
        </div>
    </body>
</html>
