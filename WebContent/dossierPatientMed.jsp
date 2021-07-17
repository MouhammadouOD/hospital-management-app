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
		
		<title>DOSSIER-PATIENT</title>
		<style>
			body {
				  background-image: url('./image/medecinBackground2.jpeg');
				  background-image: no-repeat;
				  background-attachment: fixed;
  				  background-size: 100% 100%;
				}
		</style>
	</head>
<body>
		<%@include file="navigationMedecin.jsp" %>
		
		<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	 		<form class="form-inline" method="post" action="dossierPatientMed">
	   			<input class="form-control mr-sm-2" type="search" placeholder="tapez le nom d'un patient" name="prenomPatient">
	    		<button class="btn btn-info" type="submit">rechercher</button>
	  		</form>
		</nav>
		
		<div class="table-responsive">
    			<table class="table table-bordered table-secondary">
      				<thead>
        				<tr>
        				<th>ID_Patient</th>
        				<th>Nom</th>
        				<th>Prenom</th>
        				<th>Sexe</th>
        				<th>Date_De_Naissance</th>
        				<th>Adresse</th>
        				<th>Nom_Accompagnant</th>
        				<th>Tel_Accompagnant</th>
        				</tr>
      				</thead>
      				
      				<tbody>
      				<c:forEach items="${v1}" var="line">
      					<tr>
          				<td>${line.getIdPatient()}</td>
          				<td>${line.getNom()}</td>
          				<td>${line.getPrenom()}</td>
          				<td>${line.getSexe()}</td>
          				<td>${line.getDateNaissance()}</td>
          				<td>${line.getAdresse()}</td>
          				<td>${line.getNomAcc()}</td>
          				<td>${line.getTelAcc()}</td>
          				<td>
     						
	   						<button class="btn btn-primary" onclick="window.location.href = 'afficherDossier?idPatient=${line.getIdPatient()}';" >Afficher Dossier</button>
	   					</td>
	   					
	  					<td>
     						
	   						<button class="btn btn-primary" onclick="window.location.href = 'consulterM?idPatient=${line.getIdPatient()}';" >Consulter</button>
	   					</td>
          				</tr>
      				</c:forEach>
      				</tbody>
      			</table>
			</div>
</body>
</html>