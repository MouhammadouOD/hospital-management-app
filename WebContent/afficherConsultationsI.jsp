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
		
		<title>AFFICHER-CONSUTATION</title>
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
		
		<%@include file="navigationInfirmier.jsp" %>
		<div class="table-responsive">
    			<table class="table table-bordered table-secondary">
      				<thead>
        				<tr>
        				
        				<th>Id Consultation</th>
        				<th>Date et Heure</th>
        				<th>Poids</th>
        				<th>Température</th>
        				<th>Taille</th>
        				
        				</tr>
      				</thead>
      				
      				<tbody>
      				<c:forEach items="${consultations}" var="line">
      					<tr>
          				<td>${line.getIdConsultationI()}</td>
          				<td>${line.getHeureDeCons()}</td>
          				<td>${line.getPoids()}</td>
          				<td>${line.getTemperature()}</td>
          				<td>${line.getTaille()}</td>
          				</tr>
      				</c:forEach>
      				</tbody>
      			</table>
		</div>

</body>
</html>