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
				  background-image: url('./image/infirmierBackground.jpg');
				  background-image: no-repeat;
				  background-attachment: fixed;
  				  background-size: 100% 100%;
				}
		</style>
	</head>


	<body>

		<!-- BARRE DE NAVIGATION ET LOGO ------------------------------- -->
		<%@include file="navigationInfirmier.jsp" %>
<!--contenu des pages-->

		

<!--PARGE D'ACCUEIL ---------------------------------------- -->

			<div class="tab-pane container active" id="accueil">
  				<div class="container p-3 my-3 bg-dark text-white" id="accueil">
					<div>
						<p>
							<h1 style="font-size:60px">BIENVENUE</h1> cher(e) Infirmier , vous êtes sur votre page d'accueil </br>
		   					vous avez la possibilité d'inscrire un patient s'il est nouveau en allant dans l'onglet <b>NOUVEAU-PATIENT</b> , et de voir le profil des patients dèjà</br>
		   					existants dans l'onglet <b>DOSSIER-DU-PATIENT</b></br>
		   					Vous pouvez aussi consulter et fixer des rendez-vous Voire la barre de navigation
		   				</p>
		   			</div>	
				</div>

  			</div>

	</body>
</html>
