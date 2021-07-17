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
		
		<title>PAGE DE CONSULTATION</title>
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
		<div>
			<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	 				 	<form class="form-inline" method="post" action="rendezVousMed">
	   					 	<input class="form-control mr-sm-2" type="search" placeholder="tapez le nom d'un patient" name="nomPatient">
	    				 	<button class="btn btn-info" type="submit">rechercher</button>
	  					</form>
	  					<button onclick="window.location.href = 'nouveauRvMed.jsp';">Nouveau rendez-vous</button>
			</nav>
			<div class="table-responsive">
    			<table class="table table-bordered table-secondary">
      				<thead>
        				<tr>
        				<th>NomPatient</th>
        				<th>PrenomPatient</th>
        				<th>IdRv</th>
        				<th>DateRv</th>
        				<th>Heure</th>
 
        				</tr>
      				</thead>
      				
      				<tbody>
      				<c:forEach items="${v1}" var="line">
      					<tr>
          				<td>${line.getNomPatient()}</td>
          				<td>${line.getPrenomPatient()}</td>
          				<td>${line.getIdRv()}</td>
          				<td>${line.getDateRv()}</td>
          				<td>${line.getHeure()}</td>
          				
          				<td>
	  					</td>
          				</tr>
      				</c:forEach>
      				</tbody>
      			</table>
			</div>
		</div>
		
		
		
</body>
</html>