<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>

<link rel="stylesheet" href="../Styles/Styles.css" />
<link rel="stylesheet" href="../Styles/mini-lib.css" />

<body>

<main class="main-container">

  <nav class="navbar navbar-expand-lg navbar-dark full-width flex-center-container"> 
  
  <div class="container-fluid max-width-container">
  
    <a class="navbar-brand flex-center-container" href="#">
    	<img src="../Assets/logo.png" />
    </a>
    
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
      
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="../servletListarProfesor" id="listarProfesores" name="listarProfesores">Profesores</a>
        </li>
        
        <li class="nav-item">
          <a class="nav-link" href="../servletListarAlumnos">Alumnos</a>
        </li>
        
        <li class="nav-item">
          <a class="nav-link"  href="CURSOS/TodosLosCursos.jsp">Cursos</a>
        </li>
        
         <li class="nav-item">
          <a class="nav-link" class="nav-link"  href="../servletListarUsarios">Usuarios</a>
        </li>
        
      </ul>
      
      <form class="flex-evenly-container align-items-center">
        <h5 class="user-name">Alejandro Gazzo</h5>
        <button class="btn accent" type="submit">Cerrar Sesi�n</button>
      </form>
      
    </div>
  </div>
  
</nav>
<!-- Fin navbar -->


<div class="full-width flex-center-container">
	
	<div class="max-width-container">
		
		<div class="home-banner flex-center-container flex-column flex-center-container">
			<img src="../Assets/comune.png">
			<h1 class="mt-3">�Bienvenido al sistema!</h1>
		</div>
		
		<div class="dashboard-card-container full-width responsive-container flex-center-container">
		
			<div class="dashboard-card">
				<a class="dashboard-card-banner" href="VISTAS PROFESOR/ListarProfesores.jsp">Profesores</a>	
			</div>
			
			<div class="dashboard-card">
				<a class="dashboard-card-banner" href="VISTAS ALUMNO/ListarAlumnos.jsp">Alumnos</a>	
			</div>
			
			<div class="dashboard-card">
				<a class="dashboard-card-banner" href="CURSOS/TodosLosCursos.jsp">Cursos</a>	
			</div>
			
			<div class="dashboard-card">
				<a class="dashboard-card-banner" href="VISTAS USUARIO/ListarUsuarios.jsp">Usuarios</a>	
			</div>
		
		</div>
	
	</div>

</div>





</main>

</body>
 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</html>