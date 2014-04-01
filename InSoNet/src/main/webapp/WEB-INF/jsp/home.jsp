<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <script src="js/holder.js"></script>
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="js/jquery.js"></script>
    <!-- conditional comments -->
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="js/html5shiv.js"></script>
      <script src="js/respond.min.js"></script>
    <![endif]-->
    <!--[if IE 9]>
        <script type='text/javascript' src='js/jquery.html5-placeholder-shim.js'></script>
    <![endif]-->
    <title>Insert title here</title>
</head>
<body>
<div class="container">
    <div class="row">
        <nav class="navbar navbar-default" role="navigation">
            <div class="col-lg-6">
                <img src="images/insonet_logo.png" class="img-responsive" alt="InSoNet" title="InSoNet">
            </div><!-- /.col-lg-6 -->
            <div class="col-lg-6">
                
                
            </div>
        </nav>
    </div>
    <div class="row">
        <div class="col-lg-4">
        <c:out value="${message}"/>
        
        </div>
        <div class="col-lg-4">
            <form  role="form">
                <div class="form-group">
                    <label for="exampleInputEmail1">E-mail</label>
                    <input type="email" class="form-control" id="exampleInputEmail1" placeholder="Ingrese E-mail">
                </div>
                <div class="form-group">
                    <label for="exampleInputPassword1">Contraseña</label>
                    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Ingrese contraseña">
                </div>
                <div class="form-group">
                    
                        <div class="checkbox">
                            <label>
                                <input type="checkbox"> Recordarme
                            </label>
                        </div>
                    
                </div>
                <button type="submit" class="btn btn-default" title="Iniciar sesión" onclick="location.href='index.html'; return false;">Enviar</button>
                &nbsp;&nbsp;<a href="registroInSoNet.html" title="Crear cuenta en InSoNet">Registrarse</a>
                
            </form>
                   
        </div>
        <div class="col-lg-4">
        </div>
    </div>
</div>    
    
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="js/bootstrap.min.js"></script>

</body>
</html>