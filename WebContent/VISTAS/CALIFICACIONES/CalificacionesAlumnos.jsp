<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<link rel="stylesheet" href="../../Styles/Styles.css" />
<link rel="stylesheet" href="../../Styles/mini-lib.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Calificaciones Curso</title>
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
          <a class="nav-link active" aria-current="page" href="#">Alumnos</a>
        </li>
        
        <li class="nav-item">
          <a class="nav-link" href="#">Alumnos</a>
        </li>
        
        <li class="nav-item">
          <a class="nav-link">Cursos</a>
        </li>
        
         <li class="nav-item">
          <a class="nav-link">Usuarios</a>
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


	<div class="full-width flex-center-container">
		
		<div class="table-container max-width-container flex-column">
			
			<h1 class="table-title">Calificaciones Curso</h1>
			
			<table id="table-1" class="display table table-light table-hover">
	                    <thead class="table-dark">
	                        <tr>
	                            <th>Legajo</th>
	                            <th scope="col">Nombre</th>                        
	                            <th>Apellido</th>
	                            <th>Primer parcial</th>
	                            <th>Segundo parcial</th>
	                            <th>Primer Recuperatorio</th>
	                            <th>Segundo Recuperatorio</th>
	                            <th>Estado</th>
	                        </tr>
	                   </thead>
	                   <tbody>
	                   
	                   <%for(int x = 0; x<10; x++) 
	                   {
	                	  %>
	                	  
	                	  <tr>
								<th>40.420.420</th>
	                            <th scope="col">Alejandro</th>                        
	                            <th>Gazzo</th>
	                            <th>
	                            <select name="document_type" id="document_type">
	                               <option value="1">-</option>
                                   <option value="1">1</option>
                                   <option value="2">2</option>
                                   <option value="3">3</option>
                                   <option value="4">4</option> 
                                   <option value="5">5</option>
                                   <option value="6">6</option>
                                   <option value="7">7</option>
                                   <option value="8">8</option>
                                   <option value="9">9</option> 
                                   <option value="10">10</option> 
                                         
                                </select>
	                            </th>
	                            <th>
	                            <select name="document_type" id="document_type">
	                               <option value="1">-</option>
                                   <option value="1">1</option>
                                   <option value="2">2</option>
                                   <option value="3">3</option>
                                   <option value="4">4</option> 
                                   <option value="5">5</option>
                                   <option value="6">6</option>
                                   <option value="7">7</option>
                                   <option value="8">8</option>
                                   <option value="9">9</option> 
                                   <option value="10">10</option> 
                                         
                                </select>
	                            </th>
	                            <th>
	                            <select name="document_type" id="document_type">
	                               <option value="1">-</option>
                                   <option value="1">1</option>
                                   <option value="2">2</option>
                                   <option value="3">3</option>
                                   <option value="4">4</option> 
                                   <option value="5">5</option>
                                   <option value="6">6</option>
                                   <option value="7">7</option>
                                   <option value="8">8</option>
                                   <option value="9">9</option> 
                                   <option value="10">10</option> 
                                         
                                </select>
	                            
	                            
	                            </th>
	                            <th>
	                            <select name="document_type" id="document_type">
	                               <option value="1">-</option>
                                   <option value="1">1</option>
                                   <option value="2">2</option>
                                   <option value="3">3</option>
                                   <option value="4">4</option> 
                                   <option value="5">5</option>
                                   <option value="6">6</option>
                                   <option value="7">7</option>
                                   <option value="8">8</option>
                                   <option value="9">9</option> 
                                   <option value="10">10</option> 
                                         
                                </select>
	                            
	                            
	                            </th>
	                            
	                            <th>
	                            <select name="document_type" id="document_type">
	                               <option value="1">-</option>
                                   <option value="1">Libre</option>
                                   <option value="2">Regular</option>   
                                </select>
	                            
	                            
	                            </th>
	                            
							</tr>
	                	  
	                	  
	                	  
	                	  <%
	                	   
	                   }
	                   
	                   
	                   
	                   %>
	                   
	                   
							
	                   </tbody>
	       </table>
		
		<form>
			<input class="btn" type="submit" value="Guardar">
		</form>
		</div>
	
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