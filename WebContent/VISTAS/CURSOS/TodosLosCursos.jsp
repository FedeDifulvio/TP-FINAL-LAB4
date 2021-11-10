<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>

<link rel="stylesheet" href="../../Styles/Styles.css" />
<link rel="stylesheet" href="../../Styles/mini-lib.css" />

<body>

<main class="main-container">

  <nav class="navbar navbar-expand-lg navbar-dark full-width flex-center-container"> 
  
  <div class="container-fluid max-width-container">
  
    <a class="navbar-brand flex-center-container" href="#">
    	<img src="../../Assets/logo.png" />
    </a>
    
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
      
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="../VISTAS PROFESOR/ListarProfesores.jsp">Profesores</a>
        </li>
        
        <li class="nav-item">
          <a class="nav-link" href="../VISTAS ALUMNO/ListarAlumnos.jsp">Alumnos</a>
        </li>
        
        <li class="nav-item">
          <a class="nav-link"  href="../CURSOS/TodosLosCursos.jsp">Cursos</a>
        </li>
        
         <li class="nav-item">
          <a class="nav-link" class="nav-link"  href="../VISTAS USUARIO/ListarUsuarios.jsp">Usuarios</a>
        </li>
        
      </ul>
      
      <form class="flex-evenly-container align-items-center">
        <h5 class="user-name">Alejandro Gazzo</h5>
        <button class="btn accent" type="submit">Cerrar Sesión</button>
      </form>
      
    </div>
  </div>
  
</nav>
<!-- Fin navbar -->

<div class="container">
   <div class="row justify-content-center mb-3">
            <div class="col-md-4 mt-3"  style="text-align:center; border-radius: 20px;">
                <h1>CURSOS</h1>
            </div>
        </div>
        
        
       <div class="row">
       
       <div class="col-md-6">
         <div class="card" style="background: #1a2639">
			  <div class="card-body">
			    <h5 class="card-title">CURSO 1</h5>
			    <p class="card-text">Materia: Laboratorio IV</p>
			    <a href="../CALIFICACIONES/ListarCalificaciones.jsp" class="btn btn-primary">Ver calificaciones</a>
			  </div>
       </div>
       
       </div>   
       
          <div class="col-md-6 mb-5">
            <div class="card" style="background:#1a2639">
			  <div class="card-body">
			    <h5 class="card-title">CURSO 2</h5>
			    <p class="card-text">Materia: Legislación </p>
			    <a href="../CALIFICACIONES/ListarCalificaciones.jsp" class="btn btn-primary">Ver calificaciones</a>
			  </div>
         </div>
       
       </div>    
       
          <div class="col-md-6">
                     <div class="card" style="background: #1a2639">
					  <div class="card-body">
					    <h5 class="card-title"> CURSO 3</h5>
					    <p class="card-text"> Materia: Estadística </p>
					    <a href="../CALIFICACIONES/ListarCalificaciones.jsp" class="btn btn-primary">Ver calificaciones</a>
					  </div>
					</div>
       
       </div>
       
          <div class="col-md-6">
               <div class="card" style="background: #1a2639">
				  <div class="card-body">
				    <h5 class="card-title">CURSO 4</h5>
				    <p class="card-text">Materia: Programación 2</p>
				    <a href="../CALIFICACIONES/ListarCalificaciones.jsp" class="btn btn-primary">Ver calificaciones</a>
				  </div>
				</div>
       
       </div>
       <br/>
        <br/>
         <br/>
         
       </div>
              
</div>

<br/>
<br/>
<br/>
<br/>
 <div class="row">
           <a href="AgregarCurso.jsp" class="btn btn-success">Agregar</a>
         </div>



 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</html>
