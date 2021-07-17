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
		
		<title>DOSSIER</title>
		<style>
			body {
				  background-image: url('./image/infirmierBackground.jpsg');
				  background-image: no-repeat;
				  background-attachment: fixed;
  				  background-size: 100% 100%;
				}
		</style>
	</head>
<body>
		<%@include file="navigationInfirmier.jsp" %>
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
        				<th>Division</th>
        				<th>DateEntree</th>
        				<th>DateSortie</th>
        				<th>DiagEntree</th>
        				<th>DiagSortie</th>
        				<th>Imc</th>
        				<th>Pc</th>
        				<th>Pb</th>
        				<th>ArgAnamnestiques</th>
			        	<th>ArgCliniques</th>
        				<th>Traitement</th>
        				<th>Evolution</th>
        				</tr>
      				</thead>
      				<tbody>
      				<c:forEach items="${v1}" var="line">
      					<tr>

          				<td>${line.getDivision()}</td>
          				<td>${line.getDateEntree()}</td>
          				<td>${line.getDateSortie()}</td>
          				<td>${line.getDiagEntree()}</td>
          				<td>${line.getDiagSortie()}</td>
          				<td>${line.getImc()}</td>
          				<td>${line.getPc()}</td>
          				<td>${line.getPb()}</td>
          				<td>${line.getArgAnamnestiques()}</td>
          				<td>${line.getArgCliniques()}</td>
          				<td>${line.getTraitement()}</td>
          				<td>${line.getEvolution()}</td>
          				
          				</tr>
      				</c:forEach>
      				</tbody>
      			</table>
      			
      			<div>
      				<button class="btn btn-primary" onclick="window.location.href = 'afficherConsultationsI?idPatient=${patient.getIdPatient()}';" >Afficher Consultations</button>
      				
      			</div>
      	</div>

</body>
</html>