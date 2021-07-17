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
		<br>
		<div class=" bg-secondary text-success" >
			 <center> <h3><b>CONSULTATION EFFECTUEE</b></h3> </center>
		</div>
		<br>
		<div class="" >
		<button class="btn btn-primary" onclick="window.location.href = 'creerOrdonnance?idPatient=${idPatient}';" >Creer une ordonnance</button>
		</div>
		<br>
		<div>
		<button class="btn btn-primary" onclick="window.location.href = 'creerDossier?idPatient=${idPatient}';" >Hospitaliser</button>
		</div>
		
</body>
</html>