<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
		<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
		
		<title>ACCUEIL</title>
		<style>
			body {
				  background-image: url('./image/infirmierBackground.jpeg');
				  background-image: no-repeat;
				  background-attachment: fixed;
  				  background-size: 100% 100%;
				}
		</style>
	</head>

<body>
		<%@include file="navigationMedecin.jsp" %>	
		
		<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	 		<form class="form-inline" method="post" action="medicament">
	   			<input class="form-control mr-sm-2" type="search" placeholder="tapez le nom d'un medicament" name="nomMedoc">
	    		<button class="btn btn-info" type="submit">rechercher</button>
	  		</form>
	  		<button onclick="window.location.href = 'nouveauMedoc.jsp';">Ajouter un Medicament</button>
		</nav>	
		
		<div class="table-responsive">
    			<table class="table table-bordered table-secondary">
      				<thead>
        				<tr>
        				<th>ID_Medicament</th>
        				<th>Nom</th>
        				<th>FrequenceDePrise</th>
        				<th>NombreParPrise</th>
        				<th>DureePrise</th>
        				<th>PeriodePrise</th>
        				</tr>
      				</thead>
      				
      				<tbody>
      				<c:forEach items="${v1}" var="line">
      					<tr>
          				<td>${line.getIdMed()}</td>
          				<td>${line.getNomMed()}</td>
          				<td>${line.getFrequenceDePrise()}</td>
          				<td>${line.getNombreParPrise()}</td>
          				<td>${line.getDureePrise()}</td>
          				<td>${line.getPeriodePrise()}</td>
          				<td><button class="btn btn-danger" onclick="window.location.href = 'supprimerMedoc?id=${line.getIdMed()}';" >SUPPRIMER</button></td>
          				</tr>
      				</c:forEach>
      				</tbody>
      			</table>
			</div>

</body>
</html>