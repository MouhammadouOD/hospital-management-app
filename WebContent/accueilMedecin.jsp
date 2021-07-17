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
				  background-image: url('./image/medecinBackground2.jpeg');
				  background-image: no-repeat;
				  background-attachment: fixed;
  				  background-size: 100% 100%;
				}
		</style>
	</head>

<body>
		<%@include file="navigationMedecin.jsp" %>		
		
  				<div class="container p-3 my-3 bg-dark text-white" id="accueil">
					<div>
						<p>
							<h1 style="font-size:60px">BIENVENUE</h1>  
							vous êtes sur votre page d'accueil MEDECIN </br>
		   					vous avez la possibilité d'afficher les patients et de voir leur dossier dans l'onglet <b>DOSSIER-PATIENT</b> , vous y trouverez une barre de recherche patient </br>
		   					existants dans l'onglet <b>VOIR-UTILISATEUR</b>
		   				</p>
		   			</div>	
				</div>

  			
</body>
</html>