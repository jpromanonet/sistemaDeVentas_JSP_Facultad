<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>Login</title>
    </head>
    <body background="img/bgimage.png">
        <div class="container mt-4 col-lg-4">
            <div class="card col-sm-10">
                <div class="card-body">
                    <form class="form-sign" action="Validar" method="POST">
                        <div class="form-group text-center">
                            <h1>Login</h1>
                            <img src="img/logo.png" alt="Actualiza el navegador" height="100" width="100"/>
                            <br/>
                            <label><h3>¡Bienvenidos al Sistema de Ventas!</h3></label>
                        </div>
                        <div class="form-group">
                            <label>Usuario:</label>
                            <input type="text" name="txtuser" value="emp01" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Password:</label>
                            <input type="password" name="txtpass" value="123" class="form-control">
                        </div>
                        <input type="submit" name="accion" value="Ingresar" class="btn btn-primary btn-block">
                        <br/>
                        <% if(request.getAttribute("Error") != null){
                            out.println("<center><span class='bg-danger' style='font-weight: 900; padding: 10px;'>");
                            out.println(request.getAttribute("Error"));
                            out.println("</span></center>");
                        }%>
                    </form>
                </div>
            </div>
        </div>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>