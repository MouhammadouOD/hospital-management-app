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
		
		<title>CREER UNE ORDONNANCE</title>
		<style>
			body {
				  background-image: url('./image/infirmierBackground.jpg');
				  background-image: no-repeat;
				  background-attachment: fixed;
  				  background-size: 100% 100%;
				}
		</style>
	</head>
<body>
		<div class="container">

			<div class="row">
				<div class="container col-sm-2">
					<a class="navbar-brand" href="#"><img src="./image/imagehosto.jpg" alt="Logo" style="width:100px;"></a>
				</div>	
				<div class="container col-sm-10 bg-info ">
					<nav class="navbar navbar-expand-sm navbar-light justify-content-center fixed-top ">
						<ul class="nav nav-tabs text-dark">

    						<li class="nav-item active">
      							<a class="nav-link text-dark"  href="accueilInfirmier">ACCUEIL</a>
    						</li>

    						<li class="nav-item">
      							<a class="nav-link text-dark"  href="nouveauPatientI">NOUVEAU-PATIENT</a>
    						</li>

    						<li class="nav-item">
      							<a class="nav-link text-dark"  href="dossierPatientInf">DOSSIER-PATIENT</a>
    						</li>

    						<li class="nav-item">
      							<a class="nav-link text-dark"  href="consulterI">CONSULTER</a>
    						</li>

    						<li class="nav-item">
      							<a class="nav-link text-dark"  href="rendezVousInf">FIXER-RENDEZ-VOUS</a>
    						</li>

						</ul>
					</nav>
				</div>
			
			</div>
			
			<br>
			
			<div class="container border border-primary col-sm-6 float-right">
				<div class=" bg-secondary text-success" >
					 <center> <h5><b>RECHERCHER UN MEDICAMENT<b></h5> </center>
				</div>
				
				<form class="" method="post" action="creerOrdonnanceI.jsp">
				<div class="float-right"><button class="btn btn-info" type="submit">ajouter</button></div>
					<div class="form-group">
					  <label for="sel1">choisir un medicament:</label>
					  <select class="form-control" id="sel1" name="medchoisi">
					  <c:forEach items="${v1}" var ="line">
					    <option>${line.getNomMed()}</option>
					  </c:forEach>
					  </select>
					</div>
					
					
	  			</form>
				<button onclick="window.location.href = 'nouveauMedoc.jsp';">creer un nouveau Medicament</button>
				
				
			</div>
			
			<div class="container border border-primary col-sm-6 float-left">
				<div class="container bg-info bordered">
					<h2>${patient.getNom()} ${patient.getPrenom()}</h2>
					<h4> SEXE: ${patient.getSexe()}</h4>
					<h4> Date_De_Naissance: ${patient.getDateNaissance()}</h4>
					<h4> Adresse: ${patient.getAdresse()}</h4>
				</div>
					
				<div class="table-responsive">
    			<table class="table table-bordered table-secondary">
      				<thead>
        				<tr>
        				<th>Nom</th>
        				<th>FrequenceDePrise</th>
        				<th>NombreParPrise</th>
        				<th>DureePrise</th>
        				<th>PeriodePrise</th>
        				</tr>
      				</thead>
      				
      				<tbody>
      				<c:forEach items="${v2}" var="line">
      					<tr>
          				<td>${line.getNomMed()}</td>
          				<td>${line.getFrequenceDePrise()}</td>
          				<td>${line.getNombreParPrise()}</td>
          				<td>${line.getDureePrise()}</td>
          				<td>${line.getPeriodePrise()}</td>
          				</tr>
      				</c:forEach>
      				</tbody>
      			</table>
		</div>
			
			</div>
			
		
		
		
		
</body>
</html>