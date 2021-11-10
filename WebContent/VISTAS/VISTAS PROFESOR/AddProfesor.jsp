<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<link rel="stylesheet" href="../../Styles/Styles.css" />
<link rel="stylesheet" href="../../Styles/mini-lib.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Profesores</title>
</head>
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
        <button class="btn accent" type="submit">Cerrar Sesi�n</button>
      </form>
      
    </div>
  </div>
</nav>


<h1 class="table-title">Agregar profesor</h1>


<div class="row">

<div class="full-width flex-column">

	<div class="flex-center-container flex-column max-width-container">
	
<div class="form__container full-width flex-center-container">
  <div class="form__container__heading">


  <form class="form max-width-container">
  
  	<div class="form__input-container">
      <label for="firstname">Legajo</label>
      <input required type="number" name="firstname" id="firstname">
    </div>
  

    <div class="form__input-container">
      <label for="firstname">Nombre</label>
      <input required type="text" name="firstname" id="firstname">
    </div>
    
    <div class="form__input-container">
      <label for="lastname">Apellido</label>
      <input required type="text" name="lastname" id="lastname">
    </div>
    
    <div class="form__input-container">
      <label for="lastname">Email</label>
      <input required type="email" name="lastname" id="lastname">
    </div>
    
    
    <div class="form__input-container">
      <label for="lastname">Telefono</label>
      <input required type="phone" name="lastname" id="lastname">
    </div>
    
    <div class="form__input-container">
      <label for="lastname">Direccion</label>
      <input required type="text" name="lastname" id="lastname">
    </div>
    
    
    
    <div class="form__input-container">
      <label for="document_type">Pa�s</label>
      <select name="document_type" id="document_type">

      </select>
    </div>

    <div class="form__input-container">
      <label for="document_type">Provincia</label>
      <select name="document_type" id="document_type">

      </select>
    </div>
    
    <div class="form__input-container">
      <label for="document_type">Localidad</label>
      <select name="document_type" id="document_type">

      </select>
    </div>
	<div class="form__input-container"></div>
	<div class="form__input-container" style=" width: 100%"></div>
    <a class="form__btn-sumbit accent" type="submit" href="UserProfesor.jsp">Agregar</a>
  
  </form>
</div>
</div>
	
	</div>

</div>
</div>





</main>

</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</html>