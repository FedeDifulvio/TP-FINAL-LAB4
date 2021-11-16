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
<link rel="stylesheet" href="https://cdn.datatables.net/1.10.25/css/jquery.dataTables.min.css" />

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
          <a class="nav-link active" aria-current="page" href="../HOME.jsp" id="listarProfesores" name="listarProfesores">Home</a>
        </li>
      
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="../../servletListarProfesor" id="listarProfesores" name="listarProfesores">Profesores</a>
        </li>
        
        <li class="nav-item">
          <a class="nav-link" href="../../servletListarAlumnos">Alumnos</a>
        </li>
        
        <li class="nav-item">
          <a class="nav-link"  href="../CURSOS/TodosLosCursos.jsp">Cursos</a>
        </li>
        
         <li class="nav-item">
          <a class="nav-link" class="nav-link"  href="../../servletListarUsarios">Usuarios</a>
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
                <h1 class="h1">Agregar Curso</h1>
            </div>
        </div>
 

    <div class="row justify-content-center mt-5">
      <div class="col-md-4">
        
        <label for="lastname" class="px-3" style="font-size: 2rem">Profesor : </label>
       
       <select name="document_type" id="document_type">
	                               <option  value=""> Gazzo, Alejandro</option>
                                   <option  value="1">Arostegui, isidoro</option>
                                   <option  value="2">Morgado, Santiago</option>       
                                </select>
      
      </div>
       
    </div>
    
    <div class="row justify-content-center mt-5">
      <div class="col-md-4">
        
        <label for="lastname" class="px-3" style="font-size: 2rem">Materia : </label>
       
       <select name="document_type" id="document_type">
	                               <option  value="">Laboratorio IV</option>
                                   <option  value="1">Programación III</option>
                                   <option  value="2">Sistemas Operativos</option>       
                                </select>
      
      </div>
       
    </div>
    
    
    <div class="row justify-content-center mt-5">
            <div class="col-md-4 mt-3"  style="text-align:center; border-radius: 20px;">
                <h3 class="h3">Listado de Alumnos</h3>
            </div>
        </div>
    
    <div class="row">
      <table id="table-1" class="display table table-light table-hover">
	                    <thead class="table-dark">
	                        <tr> 
	                            <th>Legajo</th>
	                            <th>Nombre</th>                        
	                            <th>Apellido</th>
	                            <th>Seleccionado</th>
	                            
	                        </tr>
	                   </thead>
	                   <tbody>
							<tr>
								<th>5555</th>
	                            <th scope="col">Alejandro</th>                        
	                            <th>Gazzo</th>
	                            <th > <input type="checkbox"/></th>
							</tr>
							<tr>
								<th>666</th>
	                            <th>Santiago</th>                        
	                            <th>Arostegui</th>
	                            <th> <input type="checkbox"/></th>
							</tr>
							<tr>
								<th>7777</th>
	                            <th>Ignacio</th>                        
	                            <th>Morgado</th>
	                            <th> <input type="checkbox"/></th>
							</tr>
	                   </tbody>
	       </table>
    
    </div>
    
    <form class="flex-evenly-container align-items-center">
        <button class="btn accent" type="submit">Guardar</button>
      </form>
    
    
    
 </div>

	
	
</main>

</body>
 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
 <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
 <script src="https://cdn.datatables.net/1.10.25/js/jquery.dataTables.min.js"></script>
 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta2/css/all.min.css" integrity="sha512-YWzhKL2whUzgiheMoBFwW8CKV4qpHQAEuvilg9FAn5VJUDwKZZxkJNuGM4XkWuk94WCrrwslk8yWNGmY1EduTA==" crossorigin="anonymous" referrerpolicy="no-referrer" />
  <script>
    $(document).ready(function() {
        $('#table-1').DataTable({
            "language": {
                search:"Buscar"
            }
        });
    } );
    </script>
</html>