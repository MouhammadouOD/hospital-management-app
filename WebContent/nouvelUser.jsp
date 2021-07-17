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
		
		<title>CREER UTILISATEUR</title>
		<style>
			body {
				  background-image: url('./image/accueilAdministrateur.jpeg');
				  background-image: no-repeat;
				  background-attachment: fixed;
  				  background-size: 100% 100%;
				}
		</style>
	</head>



<%@include file="navigationAdmin.jsp" %>

<div class="container">
			
						<form method="post" action="nouvelUser" class="was-validated">

 							<div class="form-group">
    							<label for="nom">NOM:</label>
    							<input type="text" class="form-control" id="nom" placeholder="Entrer le nom" name="nom" required>
    							<div class="valid-feedback">Valid.</div>
    							<div class="invalid-feedback">Please fill out this field.</div>
  							</div>

  							<div class="form-group">
    							<label for="prenom">Prenom:</label>
    							<input type="text" class="form-control" id="prenom" placeholder="Entrer le prenom" name="prenom" required>
    							<div class="valid-feedback">Valid.</div>
    							<div class="invalid-feedback">Please fill out this field.</div>
  							</div>

  							<div class="form-group">
    							<label for="pseudo">Pseudo:</label>
    							<input type="text" class="form-control" id="pseudo" placeholder="Donner un pseudo" name="pseudo" required>
    							<div class="valid-feedback">Valid.</div>
    							<div class="invalid-feedback">Please fill out this field.</div>
  							</div>

  							<div class="form-group">
    							<label for="mdp">Mot de Passe:</label>
    							<input type="password" class="form-control" id="mdp" placeholder="Donner un mot de passe" name="mdp" required>
    							<div class="valid-feedback">Valid.</div>
    							<div class="invalid-feedback">Please fill out this field.</div>
  							</div>
  							
  							<div class="form-group">
    							<label for="fonction">statut Du Profil:</label>
    							<select class="form-control" id="fonction" name="fonction">
							        <option>Administrateur</option>
							        <option>Medecin</option>
							        <option>Infirmier</option>
							    </select>
  							</div>

  							<button type="submit" class="btn btn-primary " >Creer</button>
						</form>

					</div>

  			 </div>


</body>
</html>